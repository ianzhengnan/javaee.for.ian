package com.ian.annotation.impl;

import javax.annotation.Resource;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

import com.ian.annotation.service.Axe;
import com.ian.annotation.service.Person;

@Component
public class Chinese implements Person, InitializingBean{

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

	public void initial(){
		System.out.println("正在执行初始化方法    initial...");
	}
	
	public void afterPropertiesSet() throws Exception {
		System.out.println("正在执行初始化方法     afterPropertiesSet...");
	}
}
