package com.springdemo;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
//Add component annotation to this java class.
//theSillyCoach is the bean id. Spring will register this bean.
	//@Component("thatSillyCoach")

//remove explicit bean id to see Default bean id working
@Component

public class TennisCoach implements Coach {
	@Autowired
	//Field Injection.
	//Spring will set this value by calling default constructor and inject 
	//FortuneService directly into the class (Reflection)
	
	//Give the name of the bean id we want spring to use. first letter lower case
	@Qualifier("randomFortuneService")
	
	private FortuneService fortuneService;
	
	//define a default constructor for diagnostic message
	public TennisCoach() {
		System.out.println("TennisCoach:inside the default constructor");
	}
	
	/*@Autowired
	//Inject dependencies by calling ANY method. just @Autowired.
	//Once defined as autowired, spring will use this method for dependency injection.
	public void doSomeCrazy(FortuneService theFortuneService) {
		System.out.println("TenniseCoach-:inside the doSomeCrazy method");
		fortuneService = theFortuneService;
	}*/
	
	/*@Autowired
	//define a setter method for dependencies injection and autowire this dependency
	public void setFortuneService(FortuneService theFortuneService) {
		System.out.println("TenniseCoach-setFortuneService:inside the setter method");
		fortuneService = theFortuneService;
	}*/
	
	/*@Autowired
	//create a constructor for injection.
	//spring will scan for the component that will implement FortuneService interface.
	public TennisCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}*/
	
	@Override
	public String getDailyWorkout() {
		
		return "Practice your backhand volley";
		
	}

	@Override
	public String getDailyFortune() {
		
		return fortuneService.getFortune();
	}

}
