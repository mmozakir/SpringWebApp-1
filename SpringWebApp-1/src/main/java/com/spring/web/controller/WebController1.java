package com.spring.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WebController1 {
	
	@RequestMapping("/home")
	public String ShowHome () {
		System.out.println("This is Response from controller ");
		return "home";
	}
}
