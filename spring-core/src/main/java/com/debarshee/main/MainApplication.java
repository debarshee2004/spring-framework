package com.debarshee.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class MainApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(MainApplication.class, args);
		System.out.println("This is a Spring Core Application using Spring Boot.");

//		Dependence Injection
		Alien object = context.getBean(Alien.class);
		object.information();
	}

}
