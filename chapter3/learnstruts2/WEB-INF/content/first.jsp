<%@ page contentType="text/html; charset=utf-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
	<title>测试Json插件</title>
	<script src="js/prototype-1.6.1.js"></script>
	<script type="text/javascript">
		
	function gotClick(){
		var url = 'jsonexample.action';
		var params = Form.serialize('form1');
		var myAjax = new Ajax.Request(url, {
			method: 'post',
			parameters: params,
			onComplete: processResponse,
			asynchronous:true
		});
	}

	function processResponse(request){
		var res = request.responseText.evalJSON();
		for(var propName in res){
			$("show").innerHTML += propName + " ---> "
				+ res[propName] + "<br/>";
		}
	}

	</script>
</head>
<body>

<s:form id="form1">
	<s:textfield name="field1" label="Field 1"/>
	<s:textfield name="field2" label="Field 2"/>
	<s:textfield name="field3" label="Field 3"/>
	<tr><td colspan="2">
	<input type="button" value="提交" onclick="gotClick();"/>
	</td></tr>
</s:form>

<div id="show">
</div>
</body>
</html>