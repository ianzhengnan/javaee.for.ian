package com.ian.struts.sample1;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionContext;

public class LoginAction implements Action{

	private String username;
	private String password;

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

		ActionContext ctx = ActionContext.getContext();

		Integer counter = (Integer)ctx.getApplication().get("counter");

		if (counter == null) {
			counter = 1;
		}else{
			counter++;
		}

		ctx.getApplication().put("counter", counter);

		ctx.getSession().put("user", getUsername());

		if (getUsername().equals("ian") && getPassword().equals("kaka")) {
			ctx.put("tip", "服务器提示：您已经登录成功！");
			return SUCCESS;
		}else{
			ctx.put("tip", "服务器提示：登录失败！");
			return ERROR;
		}
	}
}