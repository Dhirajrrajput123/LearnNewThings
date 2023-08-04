package com.dhiraj.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dhiraj.entity.Tuble;

@Repository
public interface TubalDao extends JpaRepository<Tuble, Integer> {

	
 
}
