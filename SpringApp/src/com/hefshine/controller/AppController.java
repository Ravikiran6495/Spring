package com.hefshine.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class AppController {


	@RequestMapping("/index")
	public String FromHadler()
	{
		return "index";
	}
	
	
	@RequestMapping("/login")
//	@ResponseBody
	public String Hadler(@RequestParam("username") String name, @RequestParam String password, Model model)
	{
		
		
		System.out.println("name");
		model.addAttribute("username",name);
		return "welcome";
	}
}


