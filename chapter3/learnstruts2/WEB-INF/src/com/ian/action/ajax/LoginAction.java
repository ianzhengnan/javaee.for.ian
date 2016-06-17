package com.ian.action.ajax;

import com.opensymphony.xwork2.Action;

import java.io.InputStream;
import java.io.ByteArrayInputStream;

public class LoginAction implements Action{

	private String username;
	private String password;

	private InputStream inputStream;

	public String getUsername(){
		return this.username;
	}
	public void setUsername(String username){
		this.username = username;
	}

	public String getPassword(){
		return this.password;
	}
	public void setPassword(String password){
		this.password = password;
	}

	public InputStream getResult(){
		return inputStream;
	}

	public String execute() throws Exception{

		inputStream = username.equals("flks555") && password.equals("flks555")
			? new ByteArrayInputStream("恭喜你，登录成功！".getBytes("UTF-8"))
			: new ByteArrayInputStream("对不起，用户名，密码不匹配！".getBytes("UTF-8"));

		return SUCCESS;
	}

}