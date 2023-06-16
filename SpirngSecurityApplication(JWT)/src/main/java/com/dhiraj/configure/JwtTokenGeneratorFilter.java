package com.dhiraj.configure;

import java.io.IOException;

import javax.crypto.SecretKey;

import org.springframework.boot.autoconfigure.neo4j.Neo4jProperties.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.filter.OncePerRequestFilter;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.security.Keys;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class JwtTokenGeneratorFilter extends OncePerRequestFilter{

	@Override
	protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)
			throws ServletException, IOException {
		
		System.out.println("inside doFilter----");
		//down casting 
		Authentication authentication= (Authentication) SecurityContextHolder.getContext().getAuthentication();
		
		if(null != authentication) {
//			System.out.println(("auth.getAuthentication "+authentication.get);
			
			SecretKey key=Keys.hmacShaKeyFor(SecurityConstants.JWT_KEY.getBytes());
			
//			String jwt=Jwts.builder()
//					.setIssuer("Dhiraj")
//					.setSubject("JWT tokken")
//					.claim("username", authentication.getUsername());
//			        .claim("authorities", populateAuthorities(authentication.get))
		}
	}

}
