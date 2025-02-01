package com.spring.aopdemo;

import com.spring.aopdemo.dao.AccountDAO;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class AopdemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(AopdemoApplication.class, args);
	}

	/*
	@Bean
	public CommandLineRunner commandLineRunner(String[] args) {

		return runner -> {
			System.out.println("Hello World!");
		};
	}
	 */
	
	@Bean
	public CommandLineRunner commandLineRunner(AccountDAO theAccountDAO) {
		
		return runner -> {
			 
			demoTheBeforeAdvice(theAccountDAO);
		};
	}

	private void demoTheBeforeAdvice(AccountDAO theAccountDAO) {

		// call the business method
		theAccountDAO.addAccount();

		// do it again!
		System.out.println("\n Call Again!");

		// call the business method again to verify that aspect is being executed.
		theAccountDAO.addAccount();
	}

}
