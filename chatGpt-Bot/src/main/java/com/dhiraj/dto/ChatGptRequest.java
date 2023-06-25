package com.dhiraj.dto;

import java.util.ArrayList;
import java.util.List;

import lombok.Data;

@Data
public class ChatGptRequest {

	private String model;
	private List<Message> message;
	public ChatGptRequest(String model, String prompt) {
		super();
		this.model = model;
		this.message = new ArrayList<>();
		
		this.message.add(new Message("user", prompt));
	}
	
	
}
