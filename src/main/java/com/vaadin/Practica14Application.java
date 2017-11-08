package com.vaadin;

import com.vaadin.Clases.Customer;
import com.vaadin.Clases.CustomerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SpringBootApplication
public class Practica14Application {

	private static final Logger log = LoggerFactory.getLogger(Practica14Application.class);

	public static void main(String[] args) {
		SpringApplication.run(Practica14Application.class, args);
	}


	@Bean
	public CommandLineRunner loadData(CustomerRepository repository) {
		return (args) -> {
			// save a couple of customers
			repository.save(new Customer("Jack", "Bauer", "JB@something.com"));
			repository.save(new Customer("Chloe", "O'Brian", "CO@algo.com"));
			repository.save(new Customer("Kim", "Bauer", "KB@ok.com"));
			repository.save(new Customer("David", "Palmer", "DB@klk.com"));
			repository.save(new Customer("Michelle", "Dessler", "MD@nice.com"));

			// fetch all customers
			log.info("Customers found with findAll():");
			log.info("-------------------------------");
			for (Customer customer : repository.findAll()) {
				log.info(customer.toString());
			}
			log.info("");

			// fetch an individual customer by ID
			Customer customer = repository.findOne(1L);
			log.info("Customer found with findOne(1L):");
			log.info("--------------------------------");
			log.info(customer.toString());
			log.info("");

			// fetch customers by last name
			log.info("Customer found with findByLastNameStartsWithIgnoreCase('Bauer'):");
			log.info("--------------------------------------------");
			for (Customer bauer : repository
					.findByLastNameStartsWithIgnoreCase("Bauer")) {
				log.info(bauer.toString());
			}
			log.info("");
		};
	}
}
