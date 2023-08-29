<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/sql" %>
<%@ taglib prefix="p" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="f" uri="http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="edit">
	
	<p:forEach items="${products}" var="product">
		<p:out value="${product}"></p:out>
		
		<a href="editproduct.jsp?id=${product.id}">Edit</a>
		<a href="deleteproduct.jsp?id=${product.id}">Delete</a>
		<br>
	</p:forEach>
	
	</form>
</body>
</html>