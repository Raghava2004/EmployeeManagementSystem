package com.knot.Banking.Config;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import com.knot.Banking.ServiceImpl.JWTService;

import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@Component
public class JwtAuthenticationFilter extends OncePerRequestFilter{
	
	
	@Autowired
	private JWTService jwtService;

	@Override
	protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)
	        throws ServletException, IOException {
	    final String authHeader = request.getHeader("Authorization");
	    final String jwt;
	    final String username;

	    System.out.println("Authorization Header: " + authHeader);

	    if (authHeader == null || !authHeader.startsWith("Bearer ")) {
	        filterChain.doFilter(request, response);
	        return;
	    }

	    jwt = authHeader.substring(7);
	    username = jwtService.extractUsername(jwt);

	    System.out.println("Token: " + jwt);
	    System.out.println("Username: " + username);

	    if (username != null && SecurityContextHolder.getContext().getAuthentication() == null) {
	        // Validate the token (make sure your validateToken method only needs the token or username)
	        if (jwtService.validateToken(jwt)) { // Adjust this method to only take jwt if needed
	            // Create an authentication token with only the username
	            UsernamePasswordAuthenticationToken authToken = new UsernamePasswordAuthenticationToken(
	                    username, null, null); // No authorities/roles
	            SecurityContextHolder.getContext().setAuthentication(authToken);
	        }
	    }
	    filterChain.doFilter(request, response);
	}
	
	

}
