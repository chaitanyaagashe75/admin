package com.example.admin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AdminApplication {

	public static void main(String[] args) {
		System.out.println("the messge which i wanted to see");
		SpringApplication.run(AdminApplication.class, args);
	}

}
