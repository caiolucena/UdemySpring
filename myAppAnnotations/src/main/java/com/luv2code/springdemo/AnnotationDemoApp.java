package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

	public static void main(String[] args) {
		//ler o config
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		
		//pegar o bean do container
		
		Coach theCoach = context.getBean("tennisCoach",Coach.class);
		
		//cahamr o metodo  no bean
		
		System.out.println(theCoach.getDailyWorkout());

		//chamar os metodos
		
		System.out.println(theCoach.getDailyFortune());
		
		//fechar o contexto
		context.close();
		
		
	}
}
