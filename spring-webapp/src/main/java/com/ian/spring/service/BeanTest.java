package com.ian.spring.service;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanTest {

	public static void main(String[] args) {
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("bean.xml");
		
		Person person = ctx.getBean("chinese", Person.class);
		
		person.test();
	}
	
}
