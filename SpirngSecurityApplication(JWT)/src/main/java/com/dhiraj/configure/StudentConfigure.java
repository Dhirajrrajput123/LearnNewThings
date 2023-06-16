package com.dhiraj.configure;

import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.stereotype.Component;

@Component
public class StudentConfigure {

	@Bean
	public SecurityFilterChain studentfilterChain(HttpSecurity http) throws Exception {
		
	http.authorizeHttpRequests()
			.requestMatchers("").permitAll()
			.anyRequest().authenticated()
			.and()
			.csrf().disable()
			.formLogin()
			.and()
			.httpBasic();
	
	 return http.build();
	}
	
	@Bean
	public PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}
}
