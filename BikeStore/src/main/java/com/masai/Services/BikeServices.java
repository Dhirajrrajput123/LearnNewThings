package com.masai.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.Entity.Bike;
import com.masai.Exception.BikeException;
import com.masai.Repo.BikeDao;

@Service
public class BikeServices {

//	@Autowired
	private BikeDao bDao;
	
	public BikeServices(BikeDao bd) {
		bDao=bd;
	}
	

	public String saveBike(Bike bike) throws BikeException {
		
		String saveBike=bDao.save(bike);
		
		if(saveBike==null) {
			throw new BikeException("Bike not save");
		}
		return saveBike;
	}
	
	public Bike findByIdServices(String  id) throws BikeException {
		Bike saveBike=bDao.findById(id);
		if(saveBike==null) {
			throw new BikeException("Bike not Present");
		}
		return saveBike;
	}
	
	public Bike updateBikeservices(Bike bike) throws BikeException {
		
		Bike updateBike=bDao.updateBike(bike);
		if(updateBike==null) {
			throw new BikeException("Bike not Present");
		}
		return updateBike;
		
	}
	
	
	public Bike deleteBikeServices(String id) throws BikeException {
				
		Bike deleteBike=bDao.deleteBike(id);
		if(deleteBike==null) {
			throw new BikeException("Bike not delete");
		}
		return deleteBike;
	}
	
	public List<Bike> getAllSortByPriceAndModelServices() throws BikeException{
		
		List<Bike> list=bDao.getAllSortByPriceAndModel();
		if(list==null) throw new BikeException("No bikes Present");
		return list;
	}
	
	
	public List<Bike> searchinrangeServices(int s,int e) throws BikeException{
		
		List<Bike> list=bDao.searchinrange(s, e);
		if(list==null) throw new BikeException("No bikes Present");
		return list;
		
	}
	
	public List<Bike> getAllBikeServices() throws BikeException{
		
		List<Bike> list=bDao.getAllBike();
		if(list==null) throw new BikeException("No bikes Present");
		return list;
		
	}
	public List<String> getAlldestinctBikeServices() throws BikeException{
		List<String> list=bDao.getAlldestinctBike();
		if(list==null) throw new BikeException("No bikes Present");
		return list;
	}
}



