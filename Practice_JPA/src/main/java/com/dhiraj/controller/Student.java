package com.dhiraj.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/app")
public class Student {

	@GetMapping("/get/{id}")
	public String getNmae(@PathVariable("id") int id) {
		return "hello how are you "+id;
	}
	
	
	@GetMapping("/path")
	public String getNme(@RequestParam("id") int id) {
		return "hello how are you "+id;
	}
	
	
}
