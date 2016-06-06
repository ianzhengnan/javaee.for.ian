<%@ page contentType="text/html; charset=utf-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
	<title><s:text name="errorPage"/></title>
</head>
<body>
${requestScope.tip}
<s:property value="tip"/>
</body>
</html>