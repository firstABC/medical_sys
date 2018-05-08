package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/switch")
public class SwitchController {
	@RequestMapping("/login")
	public String toLogin(){//到登录
		return "/login";
	}
	
}
