<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
	<title>Double list</title>
</head>
<body>

<s:set var="bs" value="#{'Ian': {'struts2权威指南','轻量级javaee开发指南','疯狂java讲义'}
,'kaka':{'轻量级javaee开发指南','疯狂java讲义'}
,'flks555':{'企业级javaee开发指南','疯狂Ajax讲义'}}" />

<s:form action="x">
	<s:doubleselect 
		label="请选择你喜欢的图书："
		name="author" list="{'Ian', 'kaka'}"
		doubleList="top == 'Ian' ? {'struts2权威指南','轻量级javaee开发指南','疯狂java讲义'}:{'javascript:The js guide'}"
		doubleName="book"/>
</s:form>

${requestScope.bs}<br/>

<s:form action="xt">
	<s:doubleselect
		label="请选择你喜欢的图书："
		name="author" list="#bs.keySet()"
		doubleList="#bs[top]"
		doubleName="book2"/>
</s:form>
</body>
</html>