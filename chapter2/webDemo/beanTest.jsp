<%@ page contentType="text/html; charset=UTF-8" language="java" errorPage="" %>
<%@ page import="ian.Person" %>
<!DOCTYPE html>
<html>
<head>
	<title>Java Bean 测试</title>
</head>
<body>

<!-- 不可以用HTML注释注释这些动作指令， 应该用jsp注释 -->
<%-- <jsp:useBean id="ian" class="ian.Person" scope="page" />
<jsp:setProperty name="ian" property="name" value="ian" />
<jsp:setProperty name="ian" property="age" value="34" />
<jsp:getProperty name="ian" property="name"/><br/>
<jsp:getProperty name="ian" property="age" /> --%>

<%
	Person ian = new Person();

	pageContext.setAttribute("ian", ian);

	ian.setName("Kaka");
	ian.setAge(23);

%>

<%=ian.getName() %><br/>
<%=ian.getAge() %>


</body>
</html>
