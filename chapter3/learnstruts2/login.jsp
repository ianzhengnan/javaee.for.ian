<%@ page contentType="text/html; charset=utf-8" %>
<!DOCTYPE html>
<html>
<head>
	<title>登录页面</title>
	<script type="text/javascript">
		function register(){
			targetForm = document.forms[0];
			targetForm.action = "registerAction";
		}
	</script>
</head>
<body>
<form action="user/login" method="post">
	<input name="username" type="text" />
	<input name="password" type="password" />
	<input type="submit" value="提交"/>
	<input type="submit" value="注册" onclick="register();" />
</form>
</body>
</html>