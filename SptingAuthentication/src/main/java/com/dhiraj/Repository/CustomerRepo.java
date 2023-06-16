package com.dhiraj.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dhiraj.Entity.Customer;

@Repository
public interface CustomerRepo extends JpaRepository<Customer, Integer> {

	public Optional<Customer> findByEmail(String email) ;
}
