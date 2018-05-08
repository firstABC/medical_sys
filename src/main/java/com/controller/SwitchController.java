package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.portlet.ModelAndView;

import com.entity.Permissions;
import com.entity.Role;
import com.service.PermissionsService;
import com.util.FileReadUtil;

	@Controller
	@RequestMapping("/switch")
public class SwitchController { 
	
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
		//从文件中读取所有的角色
		String path= "//resources//role.property";
		List<Role> ltRole = FileReadUtil.fileToRole(path);
		//从数据库中读取所有的权限
		List<Permissions> ltPermissions = permissionsService.selectPermissions();
		
		mv.addObject("ltRole", ltRole);
		mv.addObject("ltPermissions", ltPermissions);
		return mv;
	}
	
}
