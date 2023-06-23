package com.masai.Repo;

import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.stereotype.Repository;

import com.masai.EMUtils;
import com.masai.Entity.Bike;

@Repository
public class BikeDao {

	EntityManager em=EMUtils.getEntityManager();
	
	
	public String save(Bike bike) {
		
		Bike presentbike=em.find(Bike.class, bike.getId());
		if(presentbike!=null) {
			return null;
		}
		
		em.getTransaction().begin();
		
		em.persist(bike);
		em.getTransaction().commit();
		
		return "Bike added successfully";
	}
	
	public Bike findById(String  id) {
		Bike bike=em.find(Bike.class, id);
		return bike;
	}
	
	public Bike updateBike(Bike bike) {
		Bike presentbike=em.find(Bike.class, bike.getId());
		if(presentbike==null) {
			return null;
		}
		presentbike.setBrand(bike.getBrand());
		presentbike.setDate(bike.getDate());
		presentbike.setModel(bike.getModel());
		presentbike.setPrice(bike.getPrice());
        em.getTransaction().begin();
		
		em.merge(presentbike);
		em.getTransaction().commit();
		
		return presentbike;
	}
	
	
	public Bike deleteBike(String id) {
		Bike presentbike=em.find(Bike.class, id);
		if(presentbike==null) {
			return null;
		}
		 em.getTransaction().begin();
			
			em.remove(presentbike);
			em.getTransaction().commit();
		
			return presentbike;			
	}
	
	public List<Bike> getAllBike(){
		javax.persistence.Query q=em.createQuery("select b from Bike b");
		
		List<Bike> list=q.getResultList();
		if(list.isEmpty()) {
			return null;
		}
		return list;
	}
	
	public List<Bike> getAllSortByPriceAndModel(){
		javax.persistence.Query q=em.createQuery("select b from Bike b order by b.price desc , b.model");
		
		List<Bike> list=q.getResultList();
		if(list.isEmpty()) {
			return null;
		}
		return list;
	}
	
	
	public List<Bike> searchinrange(int s,int e){
		javax.persistence.Query q=em.createQuery("select b from Bike b where b.price>="+s+" and b.price<="+e);
//		q.setParameter(1, s);
//		q.setParameter(2, e);
		
		List<Bike> list=q.getResultList();
		if(list.isEmpty()) {
			return null;
		}
		return list;
	}
	
	public List<String> getAlldestinctBike(){
		javax.persistence.Query q=em.createQuery("select distinct b.brand from Bike b");
		
		List<String> list=q.getResultList();
		if(list.isEmpty()) {
			return null;
		}
		return list;
	}
	
	
	
	
	
}






















