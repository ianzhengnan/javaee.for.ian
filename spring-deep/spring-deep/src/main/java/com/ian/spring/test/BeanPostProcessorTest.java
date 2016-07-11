package com.ian.spring.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ian.spring.Person;

public class BeanPostProcessorTest {

	public static void main(String[] args) {
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("bean.xml");
		
		Person person = ctx.getBean("chinese", Person.class);
		
		person.useAxe();
	}
}
