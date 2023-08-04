package com.dhiraj.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;


@Entity
@Getter
@Setter
public class Tuble {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private int tNo;
	private String add;
	
	public Tuble(String name, int tNo, String add) {
		super();
		this.name = name;
		this.tNo = tNo;
		this.add = add;
	}

	public Tuble() {
		super();
	}

//	public int getId() {
//		return id;
//	}
//
//	public void setId(int id) {
//		this.id = id;
//	}
//
//	public String getName() {
//		return name;
//	}
//
//	public void setName(String name) {
//		this.name = name;
//	}
//
//	public int gettNo() {
//		return tNo;
//	}
//
//	public void settNo(int tNo) {
//		this.tNo = tNo;
//	}
//
//	public String getAdd() {
//		return add;
//	}
//
//	public void setAdd(String add) {
//		this.add = add;
//	}
	
}
