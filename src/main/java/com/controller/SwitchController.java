package com.controller;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.entity.Permissions;
import com.entity.Role;
import com.entity.Role_permissions;
import com.entity.User;
import com.service.PermissionsService;
import com.service.PrescriptionService;
import com.service.Role_permissionsService;
import com.service.UserService;
import com.util.FileReadUtil;
import com.util.Utils;

@Controller
@RequestMapping("/switch")
public class SwitchController { 
	private static Logger logger = LoggerFactory
			.getLogger(SwitchController.class); 
	@Autowired
	private UserService userService;
	@Autowired
	private PermissionsService permissionsService; 
	@Autowired
	private PrescriptionService prescriptionService;
	@Autowired
	private Role_permissionsService role_permissionsService;
	
	@RequestMapping("/login")
	public String toLogin(){//到登录
		return "/login";
	}
	
	@RequestMapping("/index")
	public String toIndex(){//到首页
		return "/index";
	}
	@RequestMapping("/openUser")
	public String toOpenUser(){//到开户
		return "/openUser";
	}
	@RequestMapping("/role")
	public ModelAndView toRole(){//到角色管理
		ModelAndView mv = new ModelAndView();
		mv.setViewName("role");
		FileReadUtil ileReadUtil = new FileReadUtil();
		//查询所有的角色
		URL url = this.getClass().getResource("/");
		String path= url.getPath()+"role.property";
		List<Role> ltRole = ileReadUtil.fileToRole(path);
		//从数据库中读取所有的权限
		//List<Permissions> ltPermissions = permissionsService.selectPermissions();
		for(Role role :ltRole){
			String rid = role.getRoleid();
			List<Role_permissions> ltRP = role_permissionsService.selectRole_permissions(rid);
			List<String> ltPercode = new ArrayList<String>();
			for(Role_permissions Role_permissions:ltRP){
			//	Permissions permissions = permissionsService.selectPermissions(Role_permissions.getPerid());
				ltPercode.add(Role_permissions.getPerid());
			}
			role.setLtPerCode(ltPercode);
		}
		mv.addObject("ltRole", ltRole);
	//	mv.addObject("ltPermissions", ltPermissions);
		return mv;
	}
	
	@RequestMapping("/user")
	public ModelAndView toUser(){//到用户管理
		ModelAndView mv = new ModelAndView();
		//获取所有的用户
		List<User> ltUser = userService.selectUserAll();
		mv.addObject("ltUser", ltUser);
		mv.setViewName("user");
		return mv; 
	}
	
	@RequestMapping("/addUser")
	public ModelAndView toAddUser(){//到新增用户
		ModelAndView mv = new ModelAndView();
		FileReadUtil ileReadUtil = new FileReadUtil();
		//查询所有的角色
		URL url = this.getClass().getResource("/");
		String path= url.getPath()+"role.property";
		List<Role> ltRole = ileReadUtil.fileToRole(path);
		mv.addObject("ltRole", ltRole);
		mv.setViewName("addUser");
		return mv;
	}
	
	@RequestMapping("/closeUser")
	public ModelAndView toCloseUser(){//销户
		ModelAndView mv = new ModelAndView();
		
		mv.setViewName("closeUser");
		return mv;
	}
	
	@RequestMapping("/rechangeCard")
	public ModelAndView toRecharge(){//充值
		ModelAndView mv = new ModelAndView();
		mv.setViewName("rechangeCard");
		return mv;
	}
	
	@RequestMapping("/recipe")
	public ModelAndView toRecipe(){//开处方
		ModelAndView mv = new ModelAndView();
		String prescriptionCode = Utils.getRandomAB();
		int count = prescriptionService.selectPrescriptionCode(prescriptionCode);
		while(count>0){
			logger.info("产生处方编码重复：---"+prescriptionCode);
			prescriptionCode = Utils.getRandomAB();
			count = prescriptionService.selectPrescriptionCode(prescriptionCode);
		}
		mv.addObject("prescriptionCode",prescriptionCode);
		mv.setViewName("recipe");
		return mv;
	}
	
}
