package com.ian.struts.sample1;

import com.opensymphony.xwork2.ActionSupport;

public class PlainTextAction extends ActionSupport{

	private String username;

	public String getUsername(){
		return this.username;
	}
	public void setUsername(String username){
		this.username = username;
	}

}