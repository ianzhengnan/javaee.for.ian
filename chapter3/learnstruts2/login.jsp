<%@ page contentType="text/html; charset=utf-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
	<title>登录页面</title>
	<link rel="stylesheet" type="text/css" href="css/uikit.min.css"/>
	<script src="js/jquery.js"></script>
	<script src="js/uikit.min.js"></script>
	<script type="text/javascript">
		function register(){
			targetForm = document.forms[0];
			targetForm.action = "registerAction";
		}
	</script>
</head>
<body>
<!-- <form action="user/login" method="post">
	<input name="username" type="text" />
	<input name="password" type="password" />
	<input type="submit" value="提交"/>
	<input type="submit" value="注册" onclick="register();" />
</form> -->

<s:form action="user/login" class="uk-form"	>
	<s:textfield name="username" type="text" label="用户名" placeholder="请输入用户名..."/>
	<s:textfield name="username" type="password" label="密码" placeholder="请输入密码..."/>
	<s:submit value="提交"/>
	<s:submit value="注册" onclick="register();"/>
</s:form>

</body>
</html>