<%@ page contentType="text/html; charset=UTF-8" session="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="java.util.List" %>
<!DOCTYPE html>
<html>
<head>
	<title>测试异步Servlet</title>
</head>
<body>
	
	
	<%
		out.println("<ul>");
		for (String item : (List<String>)request.getAttribute("books")) {
			out.println("<li>" + item + "</li>");
		}
		out.println("</ul>");

		out.println("业务调用结束的时间：" + new java.util.Date());
		request.getAsyncContext().complete();
	%>


</body>
</html>