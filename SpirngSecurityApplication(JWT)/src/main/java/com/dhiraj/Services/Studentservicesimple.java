package com.dhiraj.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dhiraj.Entity.Student;
import com.dhiraj.Exception.StudentException;
import com.dhiraj.Repository.StudentDao;

@Service
public class Studentservicesimple implements StudentServices {

	@Autowired
	private StudentDao sDao;
	
	@Override
	public Student getStudentByEmail(String email) throws StudentException {
		// TODO Auto-generated method stub
		Optional<Student> student=sDao.findByEmail(email);
		if(student.isEmpty()) {
			throw new StudentException("Student not present in this email "+email);
		}
		return student.get();
	}

	@Override
	public Student registerStudent(Student student) throws StudentException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Student> getAllStudent() throws StudentException {
		// TODO Auto-generated method stub
		return null;
	}

}
