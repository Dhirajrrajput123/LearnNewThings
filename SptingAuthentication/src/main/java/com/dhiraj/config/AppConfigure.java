package com.dhiraj.config;

import java.net.http.HttpRequest;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class AppConfigure {

	
	@Bean
	public SecurityFilterChain provideAuth(HttpSecurity http) throws Exception {
		
		http.authorizeHttpRequests(auth->auth
				.requestMatchers("/App/Customer","/App/welcome").permitAll()
				.anyRequest().authenticated()			
				).httpBasic();
		
		return http.build();
	}
	
	@Bean
	public PasswordEncoder passowrdEncoder() {
		return new BCryptPasswordEncoder();
	}
}
