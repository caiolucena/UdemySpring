package com.luv2code.springdemo;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {
	
	String [] data = {
			"Beware of the lion",
			"O idoso é covarde",
			"Meu fiho é minha família 2x"
	};
	private Random myRandom = new Random();
	
	@Override
	public String getFortune() {
		int index = myRandom.nextInt(data.length);
		
		String theFortune = data[index];
		
		return theFortune;
	}

}
