package com.acmsk.dortkafadar.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RouteController {
	@RequestMapping("/")
	public String showHomePage(){
		return "index";
	}
	
	@RequestMapping(value="/login")
	public String loginPage(){
		return "login";
	}
}
