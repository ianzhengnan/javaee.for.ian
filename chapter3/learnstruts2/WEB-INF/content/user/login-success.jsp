<%@ page contentType="text/html; charset=utf-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
	<title><s:text name="succPage"/></title>
</head>
<body>
${sessionScope.user}, 您已经登录！<br/>
${requestScope.tip} <br/>
<s:property value="tip"/>
</body>
</html>