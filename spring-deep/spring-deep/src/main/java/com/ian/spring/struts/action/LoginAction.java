package com.ian.spring.struts.action;

import com.ian.spring.struts.service.MyService;
import com.opensymphony.xwork2.Action;

public class LoginAction implements Action{

	private String username;
	private String password;
	
	private MyService myService;
	
	public void setMyService(MyService myService){
		this.myService = myService;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}


	public String execute() throws Exception {
		
		if (myService.valid(username, password)) {
			return SUCCESS;
		}else{
			return ERROR;
		}
	}

}
