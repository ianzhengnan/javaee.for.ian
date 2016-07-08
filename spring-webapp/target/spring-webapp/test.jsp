<%@page import="org.springframework.web.context.support.WebApplicationContextUtils"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ page import="org.springframework.web.context.*" %>
<%@ page import="com.ian.spring.web.Person" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Testing scope request</title>
</head>
<body>
<%
	WebApplicationContext ctx = WebApplicationContextUtils.getWebApplicationContext(application);

	Person p1 = (Person)ctx.getBean("p");
	Person p2 = (Person)ctx.getBean("p");
	out.println(p1 == p2);
	out.println(p1);
	out.println("kaka");
%>
</body>
</html>