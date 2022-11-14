package com.BikkadIT.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WelcomeController {
	
	@GetMapping("/welcome")
	public String welcome() {
		String msg= "Welcome to Bikkad IT";
		return msg;
		
	}

}
