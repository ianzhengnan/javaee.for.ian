<%@ page contentType="text/html; charset=UTF-8" %>
<!DOCTYPE html>
<html>
<head>
	<title>选择物品购买</title>
</head>
<body>
<form method="post" action="processBuy.jsp">
	书籍：<input type="checkbox" name="item" value="book"/><br/>
	电脑：<input type="checkbox" name="item" value="computer"/><br/>
	汽车：<input type="checkbox" name="item" value="car"/><br/>
	<input type="submit" value="购买"/>
</form>
</body>
</html>