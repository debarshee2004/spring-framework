package com.debarshee.spring_boot_jdbc;

import com.debarshee.spring_boot_jdbc.model.AlienModel;
import com.debarshee.spring_boot_jdbc.repository.AlienRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

/**
 * Main class for the Spring Boot JDBC application.
 * This class initializes the Spring Boot application and demonstrates basic
 * CRUD operations using the AlienModel and AlienRepository.
 */
@SpringBootApplication
public class SpringBootJdbcApplication {

	/**
	 * Entry point of the Spring Boot application.
	 *
	 * @param args command-line arguments passed during application startup.
	 */
	public static void main(String[] args) {
		// Bootstraps the Spring Boot application and retrieves the application context
		ApplicationContext context = SpringApplication.run(SpringBootJdbcApplication.class, args);

		// Alien table schema is created in `schema.sql` in the resources folder.

		// Creating an instance of AlienModel using Spring's dependency injection
		AlienModel alien = context.getBean(AlienModel.class);

		// Setting properties of the Alien object
		alien.setId(101); // Setting ID
		alien.setName("Debarshee"); // Setting name
		alien.setTech("Java"); // Setting technology

		// Accessing the AlienRepository bean from the application context
		AlienRepository repo = context.getBean(AlienRepository.class);

		// Inserting the Alien object into the database
		repo.create(alien);

		// Retrieving all Alien records from the database and printing them
		System.out.println(repo.findAll());
	}
}
