package com.ian.annotation.impl;

import org.springframework.stereotype.Component;

import com.ian.annotation.service.Axe;

@Component
public class StoneAxe implements Axe{

	public String chop(){
		return "石斧砍柴好慢";
	}
}
