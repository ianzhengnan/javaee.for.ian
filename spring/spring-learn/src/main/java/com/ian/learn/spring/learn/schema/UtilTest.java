package com.ian.learn.spring.learn.schema;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ian.learn.spring.learn.schema.impl.Chinese;

public class UtilTest {

	public static void main(String[] args) {
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("utilbean.xml");
		Chinese chinese = ctx.getBean("chinese", Chinese.class);
		chinese.useAxe();
		System.out.println(ctx.getBean("test"));
		System.out.println(ctx.getBean("confTest"));
	}
}
