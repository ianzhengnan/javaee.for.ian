<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>editNew页面</title>
</head>
<body>
	<s:form method="post" action="%{#request.contextPath}/api/article" theme="simple">
		<label for="subject">Subject:</label>
		<s:textfield id="subject" name="subject"/><br/>
		<label for="content">Content:</label>
		<s:textfield id="content" name="content"/><br/>
		<label for="author">Author:</label>
		<s:textfield id="author" name="author"/><br/>
		<s:submit value="创建" />
	</s:form>
	<br/>
	<a href="${pageContext.request.contextPath}/api/article">返回</a>
</body>
</html>