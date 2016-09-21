<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>show页面</title>
</head>
<body>

<table border="1">
	<tr>
		<th>ID</th>
		<th>SUBJECT</th>
		<th>CONTENT</th>
		<th>AUTHOR</th>
	</tr>
	<s:iterator value="article" >
		<tr>
			<td><s:property value="id"/></td>
			<td><s:property value="subject"/></td>
			<td><s:property value="content"/></td>
			<td><s:property value="author"/></td>
		</tr>
	</s:iterator>
</table>
<br/>
<a href="${pageContext.request.contextPath}/api/article">返回</a>
</body>
</html>