package com.ian.struts.sample1;

// import com.opensymphony.xwork2.Action;
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

	public String register() throws Exception{

		ActionContext.getContext().getSession().put("user", getUsername());
		setTip("恭喜您！" + getUsername() + "，您已经注册成功！");
		return SUCCESS;
	}

	public String login() throws Exception{

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
			setTip("tip" + "服务器提示：您已经登录成功！");
			return SUCCESS;
		}else{
			setTip("tip" + "服务器提示：登录失败！");
			return ERROR;
		}
	}
}