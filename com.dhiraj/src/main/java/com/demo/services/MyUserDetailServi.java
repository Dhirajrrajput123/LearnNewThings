package com.demo.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.demo.Entity.MyUserdetails;
import com.demo.Entity.Student;
import com.demo.repo.StudentDao;

@Service
public class MyUserDetailServi implements UserDetailsService{
 
	@Autowired
	private StudentDao sDao;
	
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		Optional<Student> std=sDao.findByUsername(username);
		
		if(std.isEmpty()) {
			throw new UsernameNotFoundException("user not present");
		}
		
		return new MyUserdetails(std.get());
	}

}
