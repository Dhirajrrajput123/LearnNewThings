package com.masai;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EMUtils {
	
     public static final EntityManagerFactory emf;
      
     static {
    	 emf=Persistence.createEntityManagerFactory("bikeStore");
     }
     
     public static EntityManager getEntityManager() {
    	 return emf.createEntityManager();
     }
	
}
