package com.ian.spring.dao;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TxTest {

	public static void main(String[] args) {
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("txbean.xml");
		
		NewsDao dao = (NewsDao)ctx.getBean("newsDao", NewsDao.class);
		
		dao.insert("疯狂Java1", "轻量级javaee企业应用实战");
	}
}
