package com.springbootreact.webapplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WebApplication {

	public static void main(String[] args) {
		SpringApplication.run(WebApplication.class, args);

	}
	// TODO: Lesson 97

}
/**
 * All request from browser are handled by our web application deployed on a
 * server
 * Request Scope: Active for a single request ONLY
 * - Once the response is sent back, the request attributes will be removed from
 * memory
 * - These cannot be used for future request
 * - Recommended for most use cases
 * 
 * Session Scope - The details are stored across multiple requests
 * -Be careful about what you store in session (Takes additional memory as all
 * details are stored on server)
 * 
 * 
 */
