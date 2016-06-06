package com.ian.action.actionchain;

import com.opensymphony.xwork2.ActionSupport;

public class FirstAction extends ActionSupport{

	private String tip;

	public String getTip(){
		return tip;
	}
	public void setTip(String tip){
		this.tip = tip;
	}

	public String execute() throws Exception{

		System.out.println("This is the first action.");
		setTip("第一个action的提示信息！");
		return "second";
	}
}