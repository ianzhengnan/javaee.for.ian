package com.ian.annotation.impl;

import org.springframework.stereotype.Component;

import com.ian.annotation.service.Axe;

@Component
public class SteelAxe implements Axe{

	public String chop(){
		return "钢斧砍柴好快";
	}
}
