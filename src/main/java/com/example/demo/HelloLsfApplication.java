package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.example.demo.mapper")
public class HelloLsfApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelloLsfApplication.class, args);
	}

}
