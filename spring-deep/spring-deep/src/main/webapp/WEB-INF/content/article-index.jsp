<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>主页</title>

<script>
	function delete_confirm(id){
	    var r = confirm("Delete it?");
		if(r == true){
		    var xmlHttp = new XMLHttpRequest();
		    
		    xmlHttp.onreadystatechange = function(){
		    	if(xmlHttp.readyState == 4 && xmlHttp.status == 200){
		    	    location.reload();
		    	}    
		    };
		    
		    xmlHttp.open("POST", "article/"+id+"?_method=DELETE", true);
		    xmlHttp.send();
		}
	}

</script>

</head>
<body>
<s:actionmessage />
<br/>
<table border="1">
	<tr>
		<th>ID</th>
		<th>SUBJECT</th>
		<th>CONTENT</th>
		<th>AUTHOR</th>
		<th colspan="2">ACTIONS</th>
	</tr>
	<s:iterator value="list" >
		<tr>
			<td><a href="article/${id}"><s:property value="id"/></a></td>
			<td><s:property value="subject"/></td>
			<td><s:property value="content"/></td>
			<td><s:property value="author"/></td>
			<td><a href="article/${id}/edit">Edit</a></td>
			<td><a href="javascript:delete_confirm(${id});">Delete</a></td>
		</tr>
	</s:iterator>
</table>
<br/>
<a href="${pageContext.request.contextPath}/api/article/new">创建</a>

</body>
</html>