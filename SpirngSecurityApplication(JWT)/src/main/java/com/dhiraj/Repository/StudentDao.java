package com.dhiraj.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dhiraj.Entity.Student;
import com.dhiraj.Exception.StudentException;

@Repository
public interface StudentDao extends JpaRepository<Student, Integer>{

	public Optional<Student> findByEmail(String email) throws StudentException;
}
