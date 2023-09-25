<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<p style="text-align: center;width: 100%"><%@ include file="menu.jsp" %></p>

<h5>Creating Name List</h5>
<form action="addName">
<input type="text" name="uname" placeholder="Enter your Name">
<input type="submit" value="Create">
</form>
</body>
</html>