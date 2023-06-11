package com.dhiraj.CustomerServices;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.dhiraj.Entity.Customer;
import com.dhiraj.Entity.CustomerUserDetails;
import com.dhiraj.Repository.CustomerRepo;

@Service
public class CustomUserDetailServices implements UserDetailsService {

	@Autowired
	private CustomerRepo customerRepo;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		Optional<Customer> customer=customerRepo.findByEmail(username);
		if(customer.isPresent()) {
			return new CustomerUserDetails(customer.get());
		}
		
		throw new UsernameNotFoundException("Usernot present in this username");
	}

}
