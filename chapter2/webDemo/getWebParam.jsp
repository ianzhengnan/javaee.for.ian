<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="java.sql.*" %>
<!DOCTYPE html>
<html>
<head>
	<title>测试读取web.xml中的参数</title>
</head>
<body>
<%
	String driver = application.getInitParameter("driver");
	String url = application.getInitParameter("url");
	String user = application.getInitParameter("user");
	String pass = application.getInitParameter("pass");

	Class.forName(driver);
	Connection conn = DriverManager.getConnection(url, user, pass);
	Statement stmt = conn.createStatement();

	ResultSet rs = stmt.executeQuery("select author, text from comments");
%>

<table bgcolor="#9999dd" border="1" width="480">
	<%
		while(rs.next()){
	%>
	<tr>
		<td><%=rs.getString(1)%></td>
		<td><%=rs.getString(2)%></td>
	</tr>
	<%
		}
	%>
</table>
</body>
</html>