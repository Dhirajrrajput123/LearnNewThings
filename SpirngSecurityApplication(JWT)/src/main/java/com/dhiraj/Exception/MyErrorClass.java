package com.dhiraj.Exception;

import java.time.LocalDateTime;

public class MyErrorClass {

	private LocalDateTime date;
	private String desc;
	private String message;
	public MyErrorClass(LocalDateTime date, String desc, String message) {
		super();
		this.date = date;
		this.desc = desc;
		this.message = message;
	}
	public MyErrorClass() {
		super();
	}
	public LocalDateTime getDate() {
		return date;
	}
	public void setDate(LocalDateTime date) {
		this.date = date;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
	
}
