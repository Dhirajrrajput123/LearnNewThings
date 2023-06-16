package com.dhiraj.Services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.dhiraj.Entity.MyUserDetails;
import com.dhiraj.Entity.Student;
import com.dhiraj.Exception.StudentException;
import com.dhiraj.Repository.StudentDao;

@Service
public class MyUserdetailServices implements UserDetailsService {

	@Autowired
	private StudentDao sDao;
	
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException{
		// TODO Auto-generated method stub
		Optional<Student> student=sDao.findByEmail(username);
		
		if(student.isEmpty()) {
			throw new UsernameNotFoundException("User not present in this Username "+username);
		}
		
		return new MyUserDetails(student.get());
	}

}
