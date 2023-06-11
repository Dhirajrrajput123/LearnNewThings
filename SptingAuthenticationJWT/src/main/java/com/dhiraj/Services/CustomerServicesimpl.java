package com.dhiraj.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Service;

import com.dhiraj.Entity.Customer;
import com.dhiraj.Repository.CustomerRepo;

@Service
public class CustomerServicesimpl implements CustomerServices {

	@Autowired
	private CustomerRepo customerRepo;
	
	
	@Override
	public Customer getCustomer(String Username) {
		// TODO Auto-generated method stub
		Optional<Customer> customer=customerRepo.findByEmail(Username);
		
		return customer.get();
	}

	@Override
	public List<Customer> getAllCustomer() {
		// TODO Auto-generated method stub
		
		return customerRepo.findAll();
	}

	
	@Override
	public Customer registorCustomer(Customer customer) {
		// TODO Auto-generated method stub
		return customerRepo.save(customer);
	}

}
