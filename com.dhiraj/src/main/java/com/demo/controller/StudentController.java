package com.demo.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.Entity.Student;
import com.demo.repo.StudentDao;

@RestController
@RequestMapping("/app")
public class StudentController {

	@Autowired
	private StudentDao sDao;
	
	@Autowired
	private PasswordEncoder pe;
	
	@PostMapping("/student")
	public ResponseEntity<Student> saveStudent(@RequestBody Student student){
		
		student.setPassword(pe.encode(student.getPassword()));
		
		Student std=sDao.save(student);
		
		return new ResponseEntity<Student>(std, HttpStatus.ACCEPTED);
		
	}
	
	@GetMapping("/ForAll")
	public ResponseEntity<String> forAll(){
	
		return new ResponseEntity<>("welcome for All", HttpStatus.ACCEPTED);
	}
	
	@GetMapping("/forAdmin")
	public ResponseEntity<String> forAdmin(){
	
		return new ResponseEntity<>("welcome for admin", HttpStatus.ACCEPTED);
	}
	
	@GetMapping("/forAdminandUser")
	public ResponseEntity<String> forAdminandUser(){
	
		return new ResponseEntity<>("welcome for admin and user", HttpStatus.ACCEPTED);
	}
	
}
