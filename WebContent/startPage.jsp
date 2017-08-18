<%@page import="main.java.controller.StartPageLoader"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Пошук кредитів</title>
</head>
<body>
	<form action = "searchResults.jsp">
		<%! StartPageLoader loader = new StartPageLoader(); %>
		<table>
			<tr>
				<td>	
					Тип кредиту:       
					<select name = "type">
						<%= loader.creditTypesToHtmlSelect() %>
					</select>             
				</td>
			</tr>
			<tr>
				<td>
					<input type = "checkbox" name = "prepayment"> Із можливістю дострокового погашення.	
				</td>
			</tr>
			<tr>
				<td>
					<input type = "checkbox" name = "expansion"> Із можливістю розширення кредитної лінії.	
				</td>
			</tr>
			<tr>
				<td align = "right">
					<input type = "submit" value = "Пошук">
				</td>
			</tr>
		</table>
	</form>
</body>
</html>