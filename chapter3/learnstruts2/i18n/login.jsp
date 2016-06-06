<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
	<title><s:text name="LoginPage"/></title>
</head>
<body>
<s:form action="../user/login">
	<s:textfield name="username" key="user"/>
	<s:textfield name="password" type="password" key="pass"/>
	<s:submit key="login"/>
</s:form>
</body>
</html>