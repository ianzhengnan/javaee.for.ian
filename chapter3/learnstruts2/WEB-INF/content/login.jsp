<%@ page contentType="text/html; charset=utf-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
	<title>新登录页面</title>
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
${requestScope.tip}

<s:form class="uk-form"	id="loginForm">
	<s:textfield name="username" type="text" label="用户名" placeholder="请输入用户名..."/>
	<s:textfield name="password" type="password" label="密码" placeholder="请输入密码..."/>
</s:form>
<br/>
	<button id="loginBn" class="uk-button-primary" type="button">提交</button>

<div id="show" style="display:none;">
	
</div>

<script type="text/javascript">
	$("#loginBn").click(function(){
		$.get("loginPro", $("#loginForm").serializeArray(),
			function(data, statusText){

				$("#show")
					.addClass("uk-alert")
					.addClass("uk-width-1-3")
					.empty();
				$("#show").append("登录结果：" + data + "<br/>");
				$("#show").show(1000);

			}, 
			"html");
	});
</script>

</body>
</html>