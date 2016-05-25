<%@ page contentType="text/html; charset=UTF-8" %>
<!DOCTYPE html>
<html>
<head>
	<title>Form</title>
</head>
<body>

<form id="form1" method="get" action="request-handler.jsp">
	user:<br/>
	<input type="text" name="name" /><br/>
	sex:<br/>
	Male:<input type="radio" name="gender" value="男" />
	Female:<input type="radio" name="gender" value="女" /><br/>
	Hobby:<br/>
	Basketball: <input type="checkbox" name="hobby" value="篮球">
	Football: <input type="checkbox" name="hobby" value="足球">
	<br/>
	<input type="submit" value="提交">
	<input type="reset" value="重置">

</form>

</body>
</html>