package com.ian.action.user;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ActionContext;

public class LoginAction extends ActionSupport{

	private String username;
	private String password;
	private String tip;

	public String getTip(){
		return this.tip;
	}
	public void setTip(String tip){
		this.tip = tip;
	}

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

	public String execute() throws Exception{

		if (getUsername().equals("flks555")
			&& getPassword().equals("flks555")) {
			
			ActionContext.getContext().getSession()
				.put("user", getUsername());
			setTip(getText("succTip"));
			return SUCCESS;
		}else{
			setTip(getText("failTip"));
			return ERROR;
		}
	}
}