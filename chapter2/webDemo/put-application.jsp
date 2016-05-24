<%@ page contentType="text/html; charset=UTF-8" %>
<!DOCTYPE html>
<html>
<head>
	<title>put value to application object</title>
</head>
<body>
<!-- jsp declare -->
<%! 
	int i;
%>
<%
	application.setAttribute("counter", String.valueOf(++i));
%>

<%=i %>

</body>
</html>