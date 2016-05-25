<%@ page contentType="text/html; charset=UTF-8" %>
<!DOCTYPE html>
<html>
<head>
	<title>Cookie test</title>
</head>
<body>
<%
	// String name = request.getParameter("name");
	String name = "郑楠";

	Cookie c = new Cookie("username", java.net.URLEncoder.encode(name, "utf-8"));

	c.setMaxAge(24 * 3600);

	response.addCookie(c);

%>
</body>
</html>