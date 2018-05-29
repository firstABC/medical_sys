package com.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.service.Role_permissionsService;
import com.util.Utils;

@Controller
@RequestMapping("/rolep")
public class Role_perminssionsController {

	@Autowired
	private Role_permissionsService role_permissionsService;
	@RequestMapping("/upR")
	public String updateRoleper(HttpServletRequest request){
		//ModelAndView mv = new ModelAndView();
		String permissions = request.getParameter("permissions");
		String roleId = request.getParameter("roleId");
		//mv.setViewName("role");
		if(Utils.stringNotEmpty(roleId)){
			//删除所有的权限
			role_permissionsService.dropRP(roleId);
			//添加新权限
			if(permissions!=null&&permissions.trim()!=""&&!permissions.equals("on")){
				String[] prIds = permissions.split(",");
				for(String perId:prIds){
					role_permissionsService.insertRP(roleId, perId);
				}
			}
		}
		return "redirect:/switch/role.abc";
	}
}
