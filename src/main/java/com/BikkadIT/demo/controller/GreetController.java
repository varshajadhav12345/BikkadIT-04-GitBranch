package com.BikkadIT.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class GreetController {
	@GetMapping("/greet")
	public String greet() {
		String msg= "Hello";
		return msg;
		
	

}
}
