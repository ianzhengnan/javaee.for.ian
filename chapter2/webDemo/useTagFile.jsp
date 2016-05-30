<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="java.util.*" %>
<%@ taglib prefix="ian" tagdir="/WEB-INF/tags" %>
<!DOCTYPE html>
<html>
<head>
	<title>tag file test</title>
</head>
<body>
<h2>迭代器tag file</h2>
<%
	List<String> a = new ArrayList<String>();
	a.add("hello");
	a.add("world");
	a.add("java");
	request.setAttribute("a", a); 
%>
<ian:iterator bgColor="#99dd99" cellColor="#9999cc" 
	title="迭代器标签" bean="a" />

</body>
</html>