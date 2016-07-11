package com.ian.learn.spring.learn.deep;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DeepTest {

	public static void main(String[] args) {
		
		/*ApplicationContext ctx = new ClassPathXmlApplicationContext("deepbean.xml");
		System.out.println("系统获取son1的值：" + ctx.getBean("son1"));
		System.out.println("系统获取son2的值：" + ctx.getBean("son2"));
		System.out.println("系统获取theAge的值：" + ctx.getBean("theAge"));
		System.out.println("系统获取theAge2的值：" + ctx.getBean("theAge2"));*/
		
		/*ApplicationContext ctx = new ClassPathXmlApplicationContext("fieldbean.xml");
		
		Son son = ctx.getBean("son", Son.class);
		
		System.out.println("系统获取son的age的值：" + son.getAge());
		System.out.println("系统获取son的age的值：" + ctx.getBean("theAge"));*/
		
//		ApplicationContext ctx = new ClassPathXmlApplicationContext("methodbean.xml");
		ApplicationContext ctx = new ClassPathXmlApplicationContext("propertybean.xml");
		
//		Son son = ctx.getBean("son2", Son.class);
		
		System.out.println("系统获取person的age的值：" + ctx.getBean("person", Person.class).getAge());
		
//		System.out.println(ctx.getBean("javaVersion"));
	
	}

}
