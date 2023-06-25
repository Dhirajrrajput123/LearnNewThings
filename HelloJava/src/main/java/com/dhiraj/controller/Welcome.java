package com.dhiraj.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
//@RestController
public class Welcome {

	@GetMapping("/hello/{a}")
	public String sayHello(@PathVariable("a") int age) {
		
		return "hello java "+age*2;
	}
	
	@GetMapping("/hello1")
	public String sayHello1() {
		return "hello java with Spring boot";
	}
	
	
}
