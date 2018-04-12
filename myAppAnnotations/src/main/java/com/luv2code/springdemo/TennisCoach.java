package com.luv2code.springdemo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {

	@Autowired	
	@Qualifier("randomFortuneService")
	FortuneService fortuneService;
//	
//	@Autowired
//	public TennisCoach(FortuneService theFortuneService) {
//		this.fortuneService = theFortuneService;
//	}
	public TennisCoach() {
		System.out.println(">>To no Construtor");
	}
	
	//definir o metodo init
	@PostConstruct
	public void doMyStartupStuff() {
		System.out.println(">TennisCoach dentro do startup");
	}
	
	@PreDestroy
	public void doMyCleanupStuff() {
		System.out.println(">>TennisCoach dentro do cleanup");
	}
	
	//definir um método setter
//	@Autowired
//	public void setFortuneService(FortuneService theFortuneService) {
//		System.out.println(">>To no setter setFortuneService");
//		this.fortuneService = theFortuneService;
//	}
	
	@Override
	public String getDailyWorkout() {
		return "practice your backhand volley";
	}

	@Override
	public String getDailyFortune() {
		
		return fortuneService.getFortune();
	}

}
