<%@ page contentType="text/html; charset=UTF-8" language="java" errorPage="" %>

<!DOCTYPE html>
<html>
<head>
	<title>欢迎</title>
</head>
<body>
欢迎学习Java web知识
<p>现在的时间是：
<% out.println(new java.util.Date()); %></p>
<br/>

<%!
	public int count;

	public String info(){

		return "Hello";
	}
%>

<%	
	for (int i = 0; i < 7 ; i++) {
		out.println("<font size='" + i + "'>");
%>
疯狂Java训练营</font>
<br/>
<% }
	out.println(++count);
	out.println(info());
%>

<br/>
<%=count%>
<br/>
<%=info()%>
<%-- 增加的注释 --%>

</body>
</html>