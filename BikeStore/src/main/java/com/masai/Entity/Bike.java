package com.masai.Entity;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Bike {

	@Id
	private String id;
	private String brand;
	private String model;
	private int price;
	private LocalDate date;
	public Bike() {
		super();
	}
	public Bike(String id, String brand, String model, int price, LocalDate date) {
		super();
		this.id = id;
		this.brand = brand;
		this.model = model;
		this.price = price;
		this.date = date;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	@Override
	public String toString() {
		return "Bike [id=" + id + ", brand=" + brand + ", model=" + model + ", price=" + price + ", date=" + date + "]";
	}
	
	
	
}

