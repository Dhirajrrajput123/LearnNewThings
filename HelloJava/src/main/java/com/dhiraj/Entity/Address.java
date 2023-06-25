package com.dhiraj.Entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dhiraj.Student;

@Service
public class Address {

	@Autowired
	private Student student;
	
	private String picode="207123";

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public String getPicode() {
		return picode;
	}

	public void setPicode(String picode) {
		this.picode = picode;
	}

	@Override
	public String toString() {
		return "Address [student=" + student + ", picode=" + picode + "]";
	}
	
	
}
