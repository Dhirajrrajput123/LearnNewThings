package com.dhiraj.controller;

import org.apache.catalina.connector.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.neo4j.Neo4jProperties.Authentication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dhiraj.Entity.Student;
import com.dhiraj.Exception.StudentException;
import com.dhiraj.Services.StudentServices;

@RestController
public class LogInController {

	@Autowired
	private StudentServices sService;
	
	
	
	@GetMapping("/signIn")
	public ResponseEntity<Student> getLoggedInStudent(Authentication auth) throws StudentException{
		System.out.println(auth);
		
		Student student=sService.getStudentByEmail(auth.getUsername());
		
		return new ResponseEntity<Student>(student, HttpStatus.ACCEPTED);
	}
}
