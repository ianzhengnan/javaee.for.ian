<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="java.util.*" %>

<%
	Map<String, Integer> itemMap = (Map<String, Integer>)session.getAttribute("itemMap");

	if (itemMap == null) {
		
		itemMap = new HashMap<String, Integer>();
		itemMap.put("书籍", 0);
		itemMap.put("电脑", 0);
		itemMap.put("汽车", 0);
	}

	String[] buys = request.getParameterValues("item");
	for (String item : buys) {
		
		if(item.equals("book")){
			int num = itemMap.get("书籍").intValue();
			itemMap.put("书籍", num + 1);
		}else if(item.equals("computer")){
			int num = itemMap.get("电脑").intValue();
			itemMap.put("电脑", num + 1);
		}else if(item.equals("car")){
			int num = itemMap.get("汽车").intValue();
			itemMap.put("汽车", num + 1);
		}
	}
	request.removeAttribute("item");
	session.setAttribute("itemMap", itemMap);

%>
<!DOCTYPE html>
<html>
<head>
	<title>购物车</title>
</head>
<body>
您所购买的物品：<br/>
书籍：<%=itemMap.get("书籍")%>本<br/>
电脑：<%=itemMap.get("电脑")%>台<br/>
汽车：<%=itemMap.get("汽车")%>辆<br/>
</body>
</html>