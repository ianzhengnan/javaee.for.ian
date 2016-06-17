package com.ian.action.interceptor;

import com.opensymphony.xwork2.interceptor.AbstractInterceptor;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.Action;

import com.ian.action.user.LoginAction;

import java.util.Map;

public class AuthorityInterceptor extends AbstractInterceptor{

	public String intercept(ActionInvocation invocation) throws Exception{

		// LoginAction action = (LoginAction)invocation.getAction();
		ActionContext ctx = invocation.getInvocationContext();
		Map session = ctx.getSession();
		String user = (String)session.get("user");
		if (user != null && user.equals("flks555")) {
			return invocation.invoke();
		}
		ctx.put("tip", "您还没有登录，请先登录！");
		return Action.LOGIN;
	}
}