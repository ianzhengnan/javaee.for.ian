<%@ page contentType="text/html; charset=utf-8" %>
<!DOCTYPE html>
<html>
<head>
	<title>成功页面</title>
</head>
<body>
本网站访问的次数为：${applicationScope.counter}<br/>
${sessionScope.user}, 您已经登录！<br/>
${requestScope.tip}
</body>
</html>