package com.avasia.restservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.File;

/**
 * Web Server Class
 */
@SpringBootApplication
public class RestServiceApplication {

	/**
	 * Loads application
	 * @param args
	 */
	public static void main(String[] args) {
		FileHandler.ensureRecipesExists();
		SpringApplication.run(RestServiceApplication.class, args);
	}
}
