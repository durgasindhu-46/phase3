package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.example")
public class UserFeedbackApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserFeedbackApplication.class, args);
	}

}
