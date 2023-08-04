package com.dhiraj.services;

import org.springframework.stereotype.Service;

import com.dhiraj.entity.Tuble;

@Service
public interface TubleServices {

	public String addTuble(Tuble tuble);
	public Tuble getTuble();
	
}
