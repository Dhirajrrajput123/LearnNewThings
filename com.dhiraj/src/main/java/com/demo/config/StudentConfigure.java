package com.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class StudentConfigure {

	@Bean
	public SecurityFilterChain myconfigure(HttpSecurity http) throws Exception {
		
		http.authorizeHttpRequests(auth->auth
				.requestMatchers("/app/ForAll","/app/student").permitAll()
				.requestMatchers("/app/forAdmin").hasRole("admin")
				.anyRequest().authenticated()
				)
		.csrf().disable()
		.httpBasic();
		return http.build();
	}
	
	@Bean
	public PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}
	
}
