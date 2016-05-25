<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="java.util.*" %>
<!DOCTYPE html>
<html>
<head>
	<title>获取请求头/请求参数</title>
</head>
<body>
<%
	for(Enumeration<String> rehead = request.getHeaderNames();rehead.hasMoreElements();){

		String headerName = rehead.nextElement();
		out.println(headerName + "-->" + request.getHeader(headerName) + "<br/>");
	}

	out.println("<br/>");
	request.setCharacterEncoding("UTF-8");
	String name = request.getParameter("name");
	String gender = request.getParameter("gender");
	String[] hobby = request.getParameterValues("hobby");

%>

name: <%=name%>
gender: <%=gender%>
hobby: <% for(String hob : hobby){ 
	out.println(hob + " "); } %><br/>

<% request.setAttribute("info", "你好"); %>


<%
	request.getRequestDispatcher("/jsp-result.jsp").forward(request, response);
%>

</body>
</html>