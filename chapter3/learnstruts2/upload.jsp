<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
	<title>上传文件</title>
	<link rel="stylesheet" type="text/css" href="css/uikit.min.css"/>
	<script src="js/jquery.js"></script>
	<script src="js/uikit.min.js"></script>
</head>
<body>

<s:form action="uploadPro" enctype="multipart/form-data">
	<s:textfield name="title" label="文件标题"/>
	<s:file name="upload" label="选择文件"/>
	<s:submit value="上传"/>
</s:form>
</body>
</html>