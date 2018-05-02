package com.springdemo;

import org.springframework.stereotype.Component;

//Add component annotation so that spring can register it
@Component
public class HappyFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		
		return "Today is our lucky day!";
	}

}
