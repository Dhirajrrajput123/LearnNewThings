package com.dhiraj.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.dhiraj.dto.ChatGptRequest;
import com.dhiraj.dto.ChatGptResponce;

@RestController
//@RequestMapping
public class BotController {

	@Value("${openai.model}")
	private String model;
	
	@Value("${openai.api.url}")
	private String url;
	
	@Autowired
	private RestTemplate restTemp;
	
	@GetMapping("/chat")
	public String chat(@RequestParam("prompt") String prompt) {
		
		System.out.println(prompt+" "+model+"  "+url);
		
		ChatGptRequest req=new ChatGptRequest(model.trim(), prompt);
			
		System.out.println("10000000=================================");
		
		ChatGptResponce responce= restTemp.postForObject(url, req, ChatGptResponce.class);
		
		System.out.println("20=============================================");
		
		return responce.getChoices().get(0).getMessage().getContent();
	}
}
