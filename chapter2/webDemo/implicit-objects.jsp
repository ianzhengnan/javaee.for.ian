<%@ page contentType="text/html; charset=UTF-8" %>
<!DOCTYPE html>
<html>
<head>
	<title>表达式语言 - 内置对象</title>
</head>
<body>
<h2>表达式语言 - 内置对象</h2>
请输入你的名字：
<form action="implicit-objects.jsp" method="post">
	<input type="text" name="name" value="${param['name']}"/>
	<input type="submit" value="提交" />
</form>

<%
	session.setAttribute("user", "Ian");
	Cookie c = new Cookie("name", "Ian Zheng");
	c.setMaxAge(24 * 3600);
	response.addCookie(c);
%>

<table border="1" width="660" bgcolor="#aaaadd">
	<tr>
		<td width="170"><b>功能</b></td>
		<td width="200"><b>表达式语言</b></td>
		<td width="300"><b>计算结果</b></td>
	</tr>
	<tr>
		<td>取得请求参数值</td>
		<td>\${param.name}</td>
		<td>${param.name}&nbsp;</td>
	</tr>
	<tr>
		<td>取得请求参数值</td>
		<td>\${param["name"]}</td>
		<td>${param["name"]}&nbsp;</td>
	</tr>
	<tr>
		<td>取得请求头</td>
		<td>\${header.host}</td>
		<td>${header.host}</td>
	</tr>
	<tr>
		<td>取得请求头</td>
		<td>\${header["accept"]}</td>
		<td>${header["accept"]}</td>
	</tr>
	<tr>
		<td>取得初始化参数值</td>
		<td>\${initParam["url"]}</td>
		<td>${initParam["url"]}</td>
	</tr>
	<tr>
		<td>取得session的属性</td>
		<td>\${sessionScope["user"]}</td>
		<td>${sessionScope["user"]}</td>
	</tr>
	<tr>
		<td>取得指定的Cookie的值</td>
		<td>\${cookie["name"].value}</td>
		<td>${cookie["name"].value}</td>
	</tr>
</table>

</body>
</html>