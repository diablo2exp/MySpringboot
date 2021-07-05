package com.myspringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HelloWorldMainApplication {
	public static void mail(String[] args) {
		SpringApplication.run(HelloWorldMainApplication.class, args);
	}
}
