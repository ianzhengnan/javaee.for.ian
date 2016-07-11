package com.ian.annotation.impl;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

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
	private Axe axe;
	
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
	}
	
	@PostConstruct
	public void initial(){
		System.out.println("正在执行初始化方法    initial...");
	}
	
	@PreDestroy
	public void close(){
		System.out.println("正在执行关闭方法   close...");
	}
}
