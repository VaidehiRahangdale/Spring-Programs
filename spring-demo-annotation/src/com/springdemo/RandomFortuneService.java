package com.springdemo;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {

	//create an array of strings
	private String[] data = {
			"I am awesome",
			"I am in love",
			"I live in San Francisco",
			"I love NetFlix"
			};
	
	//create a random number generator
	private Random myRandom = new Random();
	
	@Override
	public String getFortune() {
		
		//pick a random fortune out of that array
		int index = myRandom.nextInt(data.length);
		String theFortune = data[index];
		
		return theFortune;
		
	}

}
