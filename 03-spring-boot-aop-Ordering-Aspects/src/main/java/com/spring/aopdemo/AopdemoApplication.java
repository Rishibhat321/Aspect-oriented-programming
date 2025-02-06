package com.spring.aopdemo;

import com.spring.aopdemo.dao.AccountDAO;
import com.spring.aopdemo.dao.MembershipDAO;
import com.spring.aopdemo.service.TrafficFortuneService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

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
	public CommandLineRunner commandLineRunner(AccountDAO theAccountDAO,
											   MembershipDAO theMembershipDAO,
											   TrafficFortuneService theTrafficFortuneService) {
		
		return runner -> {
			 
		//	demoTheBeforeAdvice(theAccountDAO, theMembershipDAO);

		//	demoTheAfterReturningAdvice(theAccountDAO);

		//	demoTheAfterThrowingAdvice(theAccountDAO);

		//	demoTheAfterAdvice(theAccountDAO);

			demoTheAroundAdvice(theTrafficFortuneService);

		};
	}

	private void demoTheAroundAdvice(TrafficFortuneService theTrafficFortuneService) {

		System.out.println("\nMain Program: demoTheAroundAdvice");

		System.out.println("Calling getFortune()");

		String data = theTrafficFortuneService.getFortune();

		System.out.println("\nMy fortune is: " + data);

		System.out.println("Finished");

	}


	private void demoTheAfterAdvice(AccountDAO theAccountDAO) {

		// call method to find the accounts
		List<Account> theAccounts = null;

		// add try-catch for exception handling
		try{
			// add a boolean flag to simulate(throw) the exceptions
		//	boolean tripWire = true;
			boolean tripWire = false;
			theAccounts = theAccountDAO.findAccounts(tripWire);
		}
		catch (Exception exc) {
			System.out.println("\n\nMain Program ... caught exception: " + exc);
		}

		// display(print) the accounts
		System.out.println("\n\nMain Program: demoTheAfterThrowingAdvice");
		System.out.println("---");

		System.out.println(theAccounts);

		System.out.println("\n");

	}


	private void demoTheAfterThrowingAdvice(AccountDAO theAccountDAO) {

		// call method to find the accounts
		List<Account> theAccounts = null;

		// add try-catch for exception handling
		try{
			// add a boolean flag to simulate(throw) the exceptions
			boolean tripWire = true;
			theAccounts = theAccountDAO.findAccounts(tripWire);
		}
		catch (Exception exc) {
			System.out.println("\n\nMain Program ... caught exception: " + exc);
		}

		// display(print) the accounts
		System.out.println("\n\nMain Program: demoTheAfterThrowingAdvice");
		System.out.println("---");

		System.out.println(theAccounts);

		System.out.println("\n");

	}


	private void demoTheAfterReturningAdvice(AccountDAO theAccountDAO) {

		// call method to find the accounts
		List<Account> theAccounts = theAccountDAO.findAccounts();

		// display(print) the accounts
		System.out.println("\n\nMain Program: demoTheAfterReturningAdvice");
		System.out.println("---");

		System.out.println(theAccounts);

		System.out.println("\n");
	}


	private void demoTheBeforeAdvice(AccountDAO theAccountDAO, MembershipDAO theMembershipDAO) {

		// call the business method
		Account myAccount = new Account();
		myAccount.setName("Madhu");
		myAccount.setLevel("Platinum");
	//	theAccountDAO.addAccount(myAccount);
		theAccountDAO.addAccount(myAccount, true);

		theAccountDAO.doWork();

		// call the AccountDAO getter/setter methods
		theAccountDAO.setName("foobar");
		theAccountDAO.setServiceCode("silver");

		String name = theAccountDAO.getName();
		String code = theAccountDAO.getServiceCode();

		// call the membership business method
		theMembershipDAO.addSillyMember();
		theMembershipDAO.goToSleep();

	/*	// do it again!
		System.out.println("\n Call Again!");

		// call the business method again to verify that aspect is being executed.
		theAccountDAO.addAccount();
	 */


	}


}
