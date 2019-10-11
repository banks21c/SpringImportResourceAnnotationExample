package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@ImportResource({"classpath*:applicationContext.xml"})

@SpringBootApplication
public class SpringBootStarterProject1Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootStarterProject1Application.class, args);
	}

}
