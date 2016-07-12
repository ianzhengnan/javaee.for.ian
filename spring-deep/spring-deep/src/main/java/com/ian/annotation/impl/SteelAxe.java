package com.ian.annotation.impl;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Component;

import com.ian.annotation.service.Axe;

@Component
public class SteelAxe implements Axe{

//	@PostConstruct
//	public void init(){
//		System.out.println("正在初始化steelAxe...");
//	}
	
	public String chop(){
		return "钢斧砍柴好快";
	}
}
