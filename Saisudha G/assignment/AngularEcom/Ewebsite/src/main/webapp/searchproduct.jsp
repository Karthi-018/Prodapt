<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<iframe src="titlebar.jsp" frameborder="0" width="100%" height="100"></iframe>
<form action="SearchproductController" method="get">
<input type="text" name="pname" placeholder="Search for products.......">
<input type="submit" value="search">
</form>
</body>
</html>