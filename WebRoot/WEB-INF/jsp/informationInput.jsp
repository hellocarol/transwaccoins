<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt"  prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>输入转账信息</title>

</head>
<body> 
	<form id="itemForm" action="${pageContext.request.contextPath }/transCoin.action" method="post">
	
		输入转账信息信息：
		<table width="100%" border=1>
		<tr>
			<td>转账地址</td>
			<td><input type="text" name="address" value=""/></td>
		</tr>
		<tr>
			<td>转账金额</td>
			<td><input type="text" name="price" value=""/></td>
		</tr>
	
	
		<tr>
		<td colspan="2" align="center"><input type="submit" value="提交"/>
		</td>
		</tr>
		</table>
	
	</form>
</body>

</html>