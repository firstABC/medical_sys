package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/test")
public class TestController {
	
	@RequestMapping("/index")
    public String showUpload(){
      System.out.println("进入跳转页面控制器");
      return "index";
	}    
}
