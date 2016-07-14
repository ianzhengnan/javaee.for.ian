package com.ian.spring.app.action;

import com.ian.spring.app.domain.Person;
import com.ian.spring.app.service.AuthService;
import com.opensymphony.xwork2.Action;

public class RegistAction implements Action{

	private Person person;
	private String tip;
	private AuthService authService;
	
	public void setAuthService(AuthService authService){
		this.authService = authService;
	}
	
	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	public String getTip() {
		return tip;
	}

	public void setTip(String tip) {
		this.tip = tip;
	}

	public String execute() throws Exception {
		
		if (authService.regist(person)) {
			return SUCCESS;
		}else{			
			return ERROR;
		}
	}

}
