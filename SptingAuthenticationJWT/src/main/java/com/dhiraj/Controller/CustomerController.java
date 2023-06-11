package com.dhiraj.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.service.annotation.GetExchange;

import com.dhiraj.Entity.Customer;
import com.dhiraj.Services.CustomerServices;

@RestController
@RequestMapping("/App")
public class CustomerController {

	@Autowired
	private CustomerServices cusromerserv;
	
	@Autowired
	private PasswordEncoder passwordEncoder;
	
	@GetMapping("/Customer")
	public ResponseEntity<Customer> addCustomer(@RequestBody Customer customer){
		customer.setPassword(passwordEncoder.encode(customer.getPassword()));
		return new ResponseEntity<Customer>(cusromerserv.registorCustomer(customer), HttpStatus.ACCEPTED);
	}
	
	@GetMapping("/Customers")
	public ResponseEntity<List<Customer>> getAllCustomers(){
		List<Customer> list=cusromerserv.getAllCustomer();
		
		return new ResponseEntity<List<Customer>>(list, HttpStatus.ACCEPTED);
	}
	
	@GetMapping("/signIn")
	public ResponseEntity<Customer> signIn(Authentication auth){
		
		Customer customer=cusromerserv.getCustomer(auth.getName());
		return new ResponseEntity<Customer>(customer, HttpStatus.ACCEPTED);
	}
	@GetMapping("/welcome")
	public ResponseEntity<String> welcomePage(){
		return new ResponseEntity<String>("wecome", HttpStatus.ACCEPTED);
	}
	
}
