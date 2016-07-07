package com.ian.learn.spring.learn.service;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PersonServiceTest {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("springbean.xml");
		
		System.out.println(context);
		
		PersonService personService = context.getBean("personService", PersonService.class);
		
		personService.info();
	}
}
