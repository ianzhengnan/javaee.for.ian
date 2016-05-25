<%@ page contentType="text/html; charset=UTF-8" %>
<!DOCTYPE html>
<html>
<head>
	<title>Getting Cookie</title>
</head>
<body>
<%
	// String name = request.getParameter("name");

	// Cookie c = new Cookie("usertext", name);

	// c.setMaxAge(24 * 3600);

	// response.addCookie(c);

	Cookie[] cookies = request.getCookies();
	for (Cookie ck : cookies) {
		if(ck.getName().equals("username")){
			out.println(java.net.URLDecoder.decode(ck.getValue(), "utf-8"));
		}
	}
%>
</body>
</html>