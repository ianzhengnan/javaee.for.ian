<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="ian" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
	<title>表达式语言 - 自定义函数</title>
</head>
<body>
<h2>表达式语言 - 自定义函数</h2>
<form action="useFunctions.jsp" method="post">
	字符串 = <input type="text" name="name" value="${param['name']}">
	<input type="submit" value="提交">
</form>

<table border="1" bgcolor="#aaaadd">
	<tr>
		<td><b>表达式语言</b></td>
		<td><b>计算结果</b></td>
	</tr>
	<tr>
		<td>\${param["name"]}</td>
		<td>${param["name"]}&nbsp;</td>
	</tr>
	<tr>
		<td>\${ian:reverse(param["name"])}</td>
		<td>${ian:reverse(param["name"])}&nbsp;</td>
	</tr>
	<tr>
		<td>\${ian:reverse(ian:reverse(param["name"]))}</td>
		<td>${ian:reverse(ian:reverse(param["name"]))}&nbsp;</td>
	</tr>
	<tr>
		<td>\${ian:countChar(param["name"])}</td>
		<td>${ian:countChar(param["name"])}&nbsp;</td>
	</tr>
</table>

</body>
</html>