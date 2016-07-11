package com.ian.spring.impl;

import org.springframework.beans.factory.InitializingBean;

import com.ian.spring.Axe;
import com.ian.spring.Person;

public class Chinese implements Person, InitializingBean{

	private String name;
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

	public void initial(){
		System.out.println("正在执行初始化方法    initial...");
	}
	
	public void afterPropertiesSet() throws Exception {
		System.out.println("正在执行初始化方法     afterPropertiesSet...");
	}
}
