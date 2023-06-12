package com.dhiraj.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

	@GetMapping("/hello")
	public String sayHello() {
		String str="Welcome ouw Security Application";
		return str;
	}
}
