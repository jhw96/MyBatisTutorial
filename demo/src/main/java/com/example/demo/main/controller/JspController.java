package com.example.demo.main.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class JspController {
	
	
	@GetMapping("/test")
	public String test() {
		System.out.println("test");

		return "index";
	}
	
	
}
