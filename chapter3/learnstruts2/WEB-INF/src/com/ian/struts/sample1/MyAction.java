package com.ian.struts.sample1;

import com.opensymphony.xwork2.ActionSupport;

public class MyAction extends ActionSupport{

	private String target;
	private String tip;

	public String getTarget(){
		return target;
	}

	public void setTarget(String target){
		this.target = target;
	}

	public String getTip(){
		return tip;
	}

	public void setTip(String tip){
		this.tip = tip;
	}

	public String execute(){

		setTip("恭喜你！你已经转向成功！");
		return SUCCESS;
	}
}