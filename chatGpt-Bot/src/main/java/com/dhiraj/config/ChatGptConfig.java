package com.dhiraj.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.web.client.RestTemplate;

@Configuration
public class ChatGptConfig {

	@Value("${openai.api.key}")
	private String openaiAPiKey;
	
	@Bean
	public RestTemplate template() {
	    RestTemplate temp = new RestTemplate();
	    temp.getInterceptors().add((request, body, execution) -> {
	        request.getHeaders().add("Authorization", "Bearer " + openaiAPiKey.trim());
	        return execution.execute(request, body);
	    });
	    return temp;
	}
	
	

}
