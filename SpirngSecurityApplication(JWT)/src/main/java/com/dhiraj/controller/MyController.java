package com.dhiraj.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.dhiraj.Entity.Student;
import com.dhiraj.Exception.StudentException;
import com.dhiraj.Services.StudentServices;

@RestController
public class MyController {

	@Autowired
	private StudentServices sService;
	
	@Autowired
	private PasswordEncoder passwordEncoder;
	
	@GetMapping("/hello")
	public ResponseEntity<String> sayHello() {
		String str="Welcome ouw Security Application";
		return new ResponseEntity<String>(str, HttpStatus.ACCEPTED);
	}
	
	@PostMapping("/Student")
	public ResponseEntity<Student> registerStudent(@RequestBody Student student) throws StudentException {
		
		student.setPassword(passwordEncoder.encode(student.getPassword()));
		Student std=sService.registerStudent(student);
		
		return new ResponseEntity<Student>(std, HttpStatus.ACCEPTED);	
	}
	
	@GetMapping("/Students")
	public ResponseEntity<List<Student>> getAllStudetn() throws StudentException{
		List<Student> list= sService.getAllStudent();
		
		return new ResponseEntity<>(list, HttpStatus.ACCEPTED);
	}
	@GetMapping("/Student/{email}")
	public ResponseEntity<Student> getCustomerByEmailHandler(@PathVariable("email") String email) throws StudentException{
		
		
		Student customer= sService.getStudentByEmail(email);
		
		return new ResponseEntity<>(customer,HttpStatus.ACCEPTED);
		
	}
	
}
