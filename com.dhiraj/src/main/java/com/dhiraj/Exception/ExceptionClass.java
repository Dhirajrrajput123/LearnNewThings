package com.dhiraj.Exception;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

@ControllerAdvice
public class ExceptionClass {

	@ExceptionHandler(StudentException.class)
	public ResponseEntity<MyErrorClass> handleStudentException(StudentException se , WebRequest req){
		
		MyErrorClass er=new MyErrorClass();
		er.setDate(LocalDateTime.now());
		er.setMessage(se.getMessage());
		er.setDesc(req.getDescription(false));
		return new ResponseEntity<MyErrorClass>(er, HttpStatus.ACCEPTED);
	}
	
	@ExceptionHandler(Exception.class)
	public ResponseEntity<MyErrorClass> exceptionHandler(Exception se,WebRequest req){
		
		MyErrorClass er=new MyErrorClass();
		er.setDate(LocalDateTime.now());
		er.setMessage(se.getMessage());
		er.setDesc(req.getDescription(false));
		return new ResponseEntity<MyErrorClass>(er, HttpStatus.ACCEPTED);
	}
}
