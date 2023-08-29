<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="editProduct">
	
	<label>Price</label>
	<input type="text" name="price">
	<label>Quantity</label>
	<input type="text" name="quantity">
	
	<% session.setAttribute("productid",request.getParameter("id")); %>
	<input type="submit">
</form>
</body>
</html>