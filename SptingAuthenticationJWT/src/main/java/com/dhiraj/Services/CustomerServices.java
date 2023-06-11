package com.dhiraj.Services;

import java.util.List;

import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Service;

import com.dhiraj.Entity.Customer;

@Service
public interface CustomerServices {

	public Customer getCustomer(String Username);
	public List<Customer> getAllCustomer();
	public Customer registorCustomer(Customer customer);
	
}
