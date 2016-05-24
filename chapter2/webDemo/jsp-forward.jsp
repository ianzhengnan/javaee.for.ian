<%@ page contentType="text/html; charset=UTF-8" %>
<!DOCTYPE html>
<html>
<head>
	<title>forward test</title>
</head>
<body>
<jsp:forward page="jsp-result.jsp" >
	<jsp:param name="age" value="34" />
</jsp:forward>
</body>
</html>