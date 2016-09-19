<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>主页</title>
</head>
<body>

<table border="1">
	<tr>
		<th>ID</th>
		<th>NAME</th>
		<th>AGE</th>
	</tr>
	<s:iterator value="list" >
		<tr>
			<td><s:property value="id"/></td>
			<td><s:property value="name"/></td>
			<td><s:property value="age"/></td>
		</tr>
	</s:iterator>
</table>

</body>
</html>