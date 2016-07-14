<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
	<title>用户注册</title>
</head>

<body>
	<div>
		<form method="post" action="regAction">
			用户名：<input name="person.name" type="text"/><br/>
			年龄：<input name="person.age" type="text"/><br/>
			<input type="submit" value="提交"/>
		</form>
	</div>
</body>

</html>