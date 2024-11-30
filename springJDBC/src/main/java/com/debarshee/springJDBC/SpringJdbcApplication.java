package com.debarshee.springJDBC;

import com.debarshee.springJDBC.model.AlienModel;
import com.debarshee.springJDBC.repository.AlienRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringJdbcApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringJdbcApplication.class, args);

		AlienModel alien = context.getBean(AlienModel.class);
		alien.setId(104);
		alien.setName("Debarshee");
		alien.setTech("Java");

		AlienRepository repo = context.getBean(AlienRepository.class);
		repo.create(alien);
		System.out.println(repo.findAll());;
	}

}
