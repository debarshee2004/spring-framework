package com.debarshee.spring_boot_basics;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBootBasicsApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringBootBasicsApplication.class, args);
		System.out.println("This is a Spring Core Application using Spring Boot.");

		// Dependence Injection
		Alien object = context.getBean(Alien.class);
		object.information();
	}

}
