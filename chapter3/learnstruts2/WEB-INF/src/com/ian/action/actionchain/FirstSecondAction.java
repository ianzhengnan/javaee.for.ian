package com.ian.action.actionchain;

import com.opensymphony.xwork2.ActionSupport;

public class FirstSecondAction extends ActionSupport{

	private String tip;

	public String getTip(){
		return tip;
	}
	public void setTip(String tip){
		this.tip = tip;
	}

	public String execute() throws Exception{

		System.out.println("This is the second action");
		setTip("第二个action的提示信息！");
		return SUCCESS;
	}
}