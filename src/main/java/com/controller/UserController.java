package com.controller;

import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.dto.MsgDTO;
import com.entity.Permissions;
import com.entity.Role;
import com.entity.Role_permissions;
import com.entity.User;
import com.entity.User_role;
import com.service.PermissionsService;
import com.service.Role_permissionsService;
import com.service.UserService;
import com.service.User_RoleService;
import com.util.FileReadUtil;
import com.util.LoginUserMap;
import com.util.Md5;

@Controller
@RequestMapping("/uesr")
public class UserController {

	private static Logger logger = LoggerFactory
			.getLogger(UserController.class);
	@Autowired
	private UserService userService;
	@Autowired
	private User_RoleService user_RoleService;
	@Autowired
	private Role_permissionsService role_permissionsService;
	@Autowired
	private PermissionsService permissionsService;
	
	@RequestMapping("/toLogin")
	@ResponseBody
	public MsgDTO loginVerfiy(HttpServletRequest request,String userAccount,String userPwd){
		MsgDTO msgDTO = new MsgDTO();
		try {
			//md5加密
			userPwd = Md5.encoderByMd5(userPwd);
			User user =new User();
			user.setUseraccount(userAccount);
			user.setUserpwd(userPwd);
			
			User userBack = userService.userVerify(user);
			if(userBack!=null){
				String status = userBack.getStatus();
				//用户状态正常
				if("A".equals(status)){
					//进行用户的权限查询，并将权限封装到session中去
					HttpSession session = request.getSession();
					String userSessionId = session.getId();
					String userid = userBack.getUserid();
					LoginUserMap.setLoginUsers(userid, userSessionId);
					session.setAttribute("userid", userid);
					session.setAttribute("currentUser", userBack);
						
					Set permissionsSet = new HashSet();
					//查询所有的角色
					List<User_role> ltuserRole =  user_RoleService.selectUserRole(userid);
					//查询所有的权限
					for(User_role user_role :ltuserRole){
						String roleid = user_role.getRoleid();
						List<Role_permissions>  ltRolepermissions= role_permissionsService.selectRole_permissions(roleid);
						for(Role_permissions role_permissions:ltRolepermissions){
							String perid = role_permissions.getPerid();
							/*//查具体的权限
							Permissions permissions = permissionsService.selectPermissions(perid);
							String percode = permissions.getPercode();*/
							permissionsSet.add(perid);
						}
					}
					//将用户的权限放入session中
					request.getSession().setAttribute("permissionsSet", permissionsSet);
					logger.error("用户的权限为："+permissionsSet);
					//修改登录时间
					SimpleDateFormat dateFormater = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
					Date date=new Date();
					String dateNow = dateFormater.format(date);
					Date lastTime;
					lastTime = dateFormater.parse(dateNow);
					userService.updateLastTime(userid, lastTime);
					
					msgDTO = MsgDTO.success();
				}else{
					//用户被锁定了
					msgDTO.setStatus(-1);
					msgDTO.setMessage("此用户被冻结！");
				}
			}else{
				msgDTO.setStatus(-2);
				msgDTO.setMessage("用户或密码错误");
			}
		}catch(Throwable e){
			e.printStackTrace();
		}
		return msgDTO;
	}
	
	@RequestMapping("/createUser")
	@ResponseBody
	@Transactional
	public MsgDTO createUser(HttpServletRequest request){
		MsgDTO msgDTO = new MsgDTO();
	try{
		String[] roleIds = request.getParameterValues("role");
		String userAccount = request.getParameter("userAccount");
		String userPwd = request.getParameter("userPwd");
		String userPwdAffirm =request.getParameter("userPwdAffirm");
		if(!userPwd.equals(userPwdAffirm)){
			msgDTO.setStatus(msgDTO.STATUS_ERR);
			msgDTO.setMessage("两次密码不一致");
			return msgDTO;
		}
		User user = new User();
		Date date=new Date();
		String userId = UUID.randomUUID().toString();
		user.setUserid(userId);
		user.setCreatetime(date);
		user.setUseraccount(userAccount);
		userPwd = Md5.encoderByMd5(userPwd);
		user.setUserpwd(userPwd);
		user.setStatus("A");
		int isOk = userService.createUser(user);
		
		if(roleIds.length>0){
			for(String roleId:roleIds){
				User_role user_role = new User_role();
				user_role.setUrid(UUID.randomUUID().toString());
				user_role.setRoleid(roleId);
				user_role.setUserid(userId);
				int isOk1 = user_RoleService.insertUser_Role(user_role);
			}
		}
		msgDTO.setStatus(msgDTO.STATUS_OK);
		msgDTO.setMessage("创建用户成功");
		return msgDTO;
	}catch(Throwable e){
		msgDTO.setStatus(msgDTO.STATUS_ERR);
		msgDTO.setMessage("操作失败，请稍后重试");
		logger.error("创建用户失败："+e);
		return msgDTO;
	}
		
	}
	
	@RequestMapping("/toEdit")
	public String toEditUser(HttpServletRequest request,@RequestParam(value="userId",defaultValue="")String userId){
		if(userId!=null&&userId.trim()!=""){
			User user = userService.selectUser(userId);
			List<User_role> ltUR = user.getLtUR();
			List<String> ltrid = new ArrayList<String>();
			for(User_role ur : ltUR){
				ltrid.add(ur.getRoleid());
			}
			request.setAttribute("ltrid", ltrid);
			request.setAttribute("user", user);
			
			FileReadUtil ileReadUtil = new FileReadUtil();
			//查询所有的角色
			URL url = this.getClass().getResource("/");
			String path= url.getPath()+"role.property";
			List<Role> ltRole = ileReadUtil.fileToRole(path);
			request.setAttribute("ltRole", ltRole);
		}
		return "/editUser";
	} 
	
	@RequestMapping("/editUser")
	@ResponseBody
	@Transactional
	public MsgDTO editUser(HttpServletRequest request){
		MsgDTO msgDTO = new MsgDTO();
	try{
		String[] roleIds = request.getParameterValues("role");
		String userAccount = request.getParameter("userAccount");
		String userPwd = request.getParameter("userPwd");
		String userId = request.getParameter("userId");
		String status = request.getParameter("status");
		User user = new User();
		user.setUserid(userId);
		user.setUseraccount(userAccount);
		if(userPwd!=null&&userPwd.trim()!=""){
			userPwd = Md5.encoderByMd5(userPwd);
			user.setUserpwd(userPwd);
		}
		user.setStatus(status);
		int isOk = userService.editUser(user);
		//删除所有角色
		user_RoleService.deleteUser_role(userId);
		if(roleIds.length>0){
			for(String roleId:roleIds){
				User_role user_role = new User_role();
				user_role.setUrid(UUID.randomUUID().toString());
				user_role.setRoleid(roleId);
				user_role.setUserid(userId);
				int isOk1 = user_RoleService.insertUser_Role(user_role);
			}
		}
		msgDTO.setStatus(msgDTO.STATUS_OK);
		msgDTO.setMessage("修改用户信息成功");
		return msgDTO;
	}catch(Throwable e){
		msgDTO.setStatus(msgDTO.STATUS_ERR);
		msgDTO.setMessage("操作失败，请稍后重试");
		logger.error("修改用户失败："+e);
		return msgDTO;
	}
		
	}
}
