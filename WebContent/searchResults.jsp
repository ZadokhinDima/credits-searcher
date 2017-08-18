<%@page import="javax.security.auth.message.callback.PrivateKeyCallback.Request"%>
<%@page import="main.java.controller.SearchController"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Результати пошуку</title>
</head>
<body>
	<%
		int type = Integer.parseInt(request.getParameter("type"));
		int prepayment = 0, expansion = 0;
		if(request.getParameter("prepayment") != null){
		    prepayment = 1;
		}
		if(request.getParameter("expansion") != null){
		    expansion = 1;
		}
		SearchController controller = new SearchController(type, prepayment, expansion);
		out.println(controller.addSearchResults());
	%>
	<br/>
	<br/>
	
	<a href="startPage.jsp">Повернутись назад.</a>
</body>
</html>