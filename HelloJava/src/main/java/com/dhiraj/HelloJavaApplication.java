package com.dhiraj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.dhiraj.Entity.Address;

@SpringBootApplication
public class HelloJavaApplication {

	public static void main(String[] args) {
		ApplicationContext ac= SpringApplication.run(HelloJavaApplication.class, args);
		
		Student std=ac.getBean(Student.class);
		
		System.out.println(std);
		Address add=ac.getBean(Address.class);
		
		System.out.println(add.getStudent());
		
	}

	
}
