package com.dhiraj.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dhiraj.dao.TubalDao;
import com.dhiraj.entity.Tuble;

@Service
public class TubleServicesImpl  implements TubleServices{

	@Autowired
	private TubalDao tDao;
	
	@Override
	public String addTuble(Tuble tuble) {
		
		
		return null;
	}

	@Override
	public Tuble getTuble() {
		// TODO Auto-generated method stub
		return null;
	}

	
}
