package com.controller;

import java.net.URL;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.entity.Permissions;
import com.entity.Role;
import com.entity.User;
import com.service.PermissionsService;
import com.service.UserService;
import com.util.FileReadUtil;

@Controller
@RequestMapping("/switch")
public class SwitchController { 
	
	@Autowired
	private UserService userService;
	@Autowired
	private PermissionsService permissionsService; 
	
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
	public ModelAndView toRole(){
		ModelAndView mv = new ModelAndView();
		mv.setViewName("role");
		FileReadUtil ileReadUtil = new FileReadUtil();
		//查询所有的角色
		URL url = this.getClass().getResource("/");
		String path= url.getPath()+"role.property";
		List<Role> ltRole = ileReadUtil.fileToRole(path);
		//从数据库中读取所有的权限
		List<Permissions> ltPermissions = permissionsService.selectPermissions();
		
		mv.addObject("ltRole", ltRole);
		mv.addObject("ltPermissions", ltPermissions);
		return mv;
	}
	
	@RequestMapping("/user")
	public ModelAndView toUser(){
		ModelAndView mv = new ModelAndView();
		//获取所有的用户
		List<User> ltUser = userService.selectUserAll();
		mv.addObject("ltUser", ltUser);
		mv.setViewName("user");
		return mv; 
	}
	
	@RequestMapping("/addUser")
	public ModelAndView toAddUser(){
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
	
}
