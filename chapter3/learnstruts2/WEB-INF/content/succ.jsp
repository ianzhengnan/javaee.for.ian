<%@ page contentType="text/html; charset=utf-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
	<title>成功页面</title>
</head>
<body>
<h2>文件上传成功！</h2>
文件标题：<s:property value=" + title"/><br/>
文件为：<img src="<s:property value="'uploadFiles/'
+ uploadFileName"/>"/><br/>
</body>
</html>