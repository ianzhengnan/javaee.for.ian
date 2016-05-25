<%@ page contentType="text/html; charset=UTF-8" %>
<!DOCTYPE html>
<html>
<head>
	<title>Redriect from Response object</title>
</head>
<body>
<%
	out.println("========");
	response.sendRedirect("jsp-result.jsp");
%>
</body>
</html>