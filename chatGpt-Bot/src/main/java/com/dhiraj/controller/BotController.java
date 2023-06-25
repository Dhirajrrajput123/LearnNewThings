package com.dhiraj.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.dhiraj.dto.ChatGptRequest;
import com.dhiraj.dto.ChatGptResponce;

@RestController
@RequestMapping
public class BotController {

	@Value("${openai.model}")
	private String model;
	
	@Value("${openai.api.url}")
	private String api;
	
	@Autowired
	private RestTemplate restTemp;
	
	@GetMapping("/chat")
	public String chat(@RequestParam("prompt") String prompt) {
		
		System.out.println(prompt+" "+model+"  "+api);
		ChatGptRequest req=new ChatGptRequest(model, prompt);
		
		ChatGptResponce responce= restTemp.postForObject(api, req, ChatGptResponce.class);
		
		return responce.getChoices().get(0).getMessage().getContent();
	}
}
