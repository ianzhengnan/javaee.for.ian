package com.ian.annotation.impl;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.DependsOn;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import com.ian.annotation.service.Axe;
import com.ian.annotation.service.Person;

@DependsOn({"stoneAxe"})
@Lazy(true)
@Component
public class Chinese implements Person{

	private String name;
	@Resource(name = "steelAxe")
//	@Qualifier("steelAxe")
	private Axe axe;
	
	@Autowired
	private Axe[] axes;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public Axe getAxe() {
		return axe;
	}

	public void setAxe(Axe axe) {
		this.axe = axe;
	}

	public void useAxe(){
		System.out.println(name + "  " + axe.chop());
		System.out.println(axes);
		
	}
	
//	@PostConstruct
//	public void initial(){
//		System.out.println("正在执行初始化方法    initial...");
//	}
//	
//	@PreDestroy
//	public void close(){
//		System.out.println("正在执行关闭方法   close...");
//	}
	
	public String sayHello(String name){
		System.out.println("sayHello方法被执行了");
		return name + " Hello , Spring AOP";
	}
	
	public void eat(String food){
		System.out.println("我正在吃：" + food);
	}
}
