<%@ page contentType="text/html; charset=UTF-8" %>

<!DOCTYPE html>
<html>
<head>
	<title>页面配置1</title>
</head>
<body>
下面是表达式语言输出：<br/>
${1 + 2} <br/>
\${1 lt 2} : 
${1 < 2}
<br/>
<%
	out.println("这里是jsp script 输出！");
%>
</body>
</html>