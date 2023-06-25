package com.dhiraj.dto;

import java.util.List;

import com.dhiraj.dto.ChatGptResponce.Choice;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ChatGptResponce {

	private List<Choice> choices;
	
	@Data
	@AllArgsConstructor
	@NoArgsConstructor
	public static class Choice {
		private int indsex;
		private Message message;
	}
}
