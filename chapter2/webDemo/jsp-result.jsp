<%@ page contentType="text/html; charset=UTF-8" %>
<!DOCTYPE html>
<html>
<head>
	<title>forward result</title>
</head>
<body>
<%=request.getParameter("age")%>
<%
	String test = (String)request.getAttribute("info");
	out.println(test);
%>
</body>
</html>