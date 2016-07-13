package com.ian.spring.struts.service.impl;

import com.ian.spring.struts.service.MyService;

public class MyServiceImpl implements MyService{

	public boolean valid(String username, String password){
		
		if (username.equals("ian") && password.equals("kaka")) {
			return true;
		}else{
			return false;
		}
	}
}
