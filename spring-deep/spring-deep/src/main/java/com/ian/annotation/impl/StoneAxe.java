package com.ian.annotation.impl;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Component;

import com.ian.annotation.service.Axe;

@Component
public class StoneAxe implements Axe{

	@PostConstruct
	public void init(){
		System.out.println("正在初始化stoneAxe...");
	}
	
	public String chop(){
		return "石斧砍柴好慢";
	}
}
