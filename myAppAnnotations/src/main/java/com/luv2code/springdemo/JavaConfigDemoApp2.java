package com.luv2code.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class JavaConfigDemoApp2 {

	public static void main(String[] args) {
		//ler o config
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(SportConfig.class);
		
		//pegar o bean do container		
		Coach theCoach = context.getBean("tennisCoach",Coach.class);
		
		//chamar o metodo  no bean
		System.out.println(theCoach.getDailyWorkout());

		//chamar os metodos
		System.out.println(theCoach.getDailyFortune());
		
		//fechar o contexto
		context.close();
		
		
	}
}
