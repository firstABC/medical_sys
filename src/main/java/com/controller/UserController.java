package com.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.dto.MsgDTO;
import com.entity.Permissions;
import com.entity.Role_permissions;
import com.entity.User;
import com.entity.User_role;
import com.service.PermissionsService;
import com.service.Role_permissionsService;
import com.service.UserService;
import com.service.User_RoleService;
import com.util.Md5;

@Controller
@RequestMapping("/uesr")
public class UserController {

	@Autowired
	private UserService userService;
	@Autowired
	private User_RoleService user_RoleService;
	@Autowired
	private Role_permissionsService role_permissionsService;
	@Autowired
	private PermissionsService PermissionsService;
	
	@RequestMapping("/toLogin")
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
					ServletContext application = request.getSession().getServletContext();
					application.setAttribute(userid, userSessionId);
					session.setAttribute("userid", userid);
					
					Set permissionsSet = new HashSet();
					//查询所有的角色
					List<User_role> ltuserRole =  user_RoleService.selectUserRole(userid);
					//查询所有的权限
					for(User_role user_role :ltuserRole){
						String roleid = user_role.getRoleid();
						List<Role_permissions>  ltRolepermissions= role_permissionsService.selectRole_permissions(roleid);
						for(Role_permissions role_permissions:ltRolepermissions){
							String perid = role_permissions.getPerid();
							//查具体的权限
							Permissions permissions = PermissionsService.selectPermissions(perid);
							String percode = permissions.getPercode();
							permissionsSet.add(percode);
						}
					}
					//将用户的权限放入session中
					request.getSession().setAttribute("permissionsSet", permissionsSet);
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
			}
		}catch(Throwable e){
			e.printStackTrace();
		}
		return msgDTO;
	}
}
