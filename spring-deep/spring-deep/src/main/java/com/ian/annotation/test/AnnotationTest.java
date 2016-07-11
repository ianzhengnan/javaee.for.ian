package com.ian.annotation.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ian.annotation.service.Person;

public class AnnotationTest {

	public static void main(String[] args) {
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("annotationbean.xml");
		System.out.println("----------------" + java.util.Arrays.toString(ctx.getBeanDefinitionNames()));
		
		Person person = ctx.getBean("chinese", Person.class);
		person.useAxe();
		
	}
}
