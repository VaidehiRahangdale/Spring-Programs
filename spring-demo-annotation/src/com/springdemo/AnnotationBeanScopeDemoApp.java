package com.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeDemoApp {

	public static void main(String[] args) {
		
		//load spring config file
		ClassPathXmlApplicationContext context = new
				ClassPathXmlApplicationContext("applicationContext.xml");
				
		//retrieve bean from spring container
		Coach theCoach = context.getBean("tennisCoach", Coach.class) ;
		
		Coach alphaCoach = context.getBean("tennisCoach", Coach.class) ;
		
		//check if they are same
		boolean result = (theCoach == alphaCoach);
		
		//print result
		System.out.println("\n Pointing to the same object: "+ result);
		System.out.println("\n memory location for theCoach "+ theCoach);
		System.out.println("\n memory location for alphaCoach "+ alphaCoach);
		
		//call methods on the bean
		
		//close the context
		context.close();
	}

}
