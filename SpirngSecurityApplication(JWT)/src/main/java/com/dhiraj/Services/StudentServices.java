package com.dhiraj.Services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.dhiraj.Entity.Student;
import com.dhiraj.Exception.StudentException;

@Service
public interface StudentServices {

	public Student getStudentByEmail(String email) throws StudentException;
	
	public Student registerStudent(Student student) throws StudentException;
	
	public List<Student>  getAllStudent() throws StudentException;
	
}
