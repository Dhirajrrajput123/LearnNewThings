package com.masai;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;

import com.masai.Entity.Bike;
import com.masai.Exception.BikeException;
import com.masai.Repo.BikeDao;
import com.masai.Services.BikeServices;

public class Main {

//	@Autowired
//	private static BikeServices bs;
//	
//	@Autowired
//	private static BikeDao bd;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        BikeServices bs=new BikeServices(new BikeDao());
        
		try {
			bs.saveBike(new Bike("B001", "Hero", "Splender", 39400, LocalDate.now()));
			bs.saveBike(new Bike("B002", "Hero", "Splender", 51400, LocalDate.now()));
			bs.saveBike(new Bike("B003", "Honda", "Passion Pro", 35400, LocalDate.now()));
			bs.saveBike(new Bike("B004", "Hero", "Splender", 31400, LocalDate.now()));
			bs.saveBike(new Bike("B005", "Tata", "Sppedo", 25400, LocalDate.now()));
			bs.saveBike(new Bike("B006", "Mahindra", "Thar", 50400, LocalDate.now()));
			
			System.out.println("Save Method");
			
		
			System.out.println("\n find By Id Bike Id "+bs.findByIdServices("B004"));
			
			System.out.println("\n update  Bike  "+bs.updateBikeservices(new Bike("B005", "Tata", "Sppedo", 25400, LocalDate.parse("2022-12-23"))));
			
			System.out.println("\n delete Bike By bike id "+bs.deleteBikeServices("B006"));
			
			bs.getAllBikeServices().forEach(System.out::println);
			
			
			
			System.out.println("\n get All bike in decending order ");
			
			bs.getAllSortByPriceAndModelServices().forEach(System.out::println);
			
			System.out.println("\n get All distrinct bands");
			
			bs.getAlldestinctBikeServices().forEach(System.out::println);
			
             System.out.println("\n get Bike in given range");
			
			bs.searchinrangeServices(30000, 40000).forEach(System.out::println);
		} catch (BikeException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		
		
	}

}
