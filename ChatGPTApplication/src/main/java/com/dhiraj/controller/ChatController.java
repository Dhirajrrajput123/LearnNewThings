package com.dhiraj.controller;


import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
@RestController
@RequestMapping("/chat")
public class ChatController {

	    @PostMapping
	    public String chat(@RequestParam("userInput") String userInput) {
	        // Implement ChatGPT integration here
	    	System.out.println(userInput);
	        String response = generateChatResponse(userInput);
	        return response;
	    }
	    
	    
	    private String generateChatResponse(String userInput) {
	    	 String apiKey = "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"; // Replace with your OpenAI API key
	    	    String apiUrl = "https://api.openai.com/v1/engines/davinci-codex/completions";
	    	    
	    	    RestTemplate restTemplate = new RestTemplate();
	    	    
	    	    HttpHeaders headers = new HttpHeaders();
	    	    headers.setBearerAuth(apiKey);
	    	    headers.setContentType(MediaType.APPLICATION_JSON);
	    	    
	    	    String systemMessage = "You are a helpful assistant.";
	    	    String requestBody = "{\"messages\":[{\"role\":\"user\",\"content\":\"" + userInput + "\"},{\"role\":\"system\",\"content\":\"" + systemMessage + "\"}]}";
	    	    
	    	    HttpEntity<String> entity = new HttpEntity<>(requestBody, headers);
	    	    
	    	    ResponseEntity<String> response = restTemplate.exchange(apiUrl, HttpMethod.POST, entity, String.class);
	    	    
	    	    // Extract the response from the ResponseEntity object
	    	    String responseBody = response.getBody();
	    	    
	    	    // Process and extract the relevant information from the response
	    	    // In this example, assuming the response body contains the generated response
	    	    // You may need to parse the JSON response based on the actual response structure
	    	    
	    	    
	    	    
	    	    
	    	    return responseBody;
	    }
}
