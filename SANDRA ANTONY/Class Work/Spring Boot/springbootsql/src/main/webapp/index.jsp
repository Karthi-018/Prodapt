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
<form action="/add">
<input type="text" placeholder="Enter your Name" name="ename"><br>
<input type="text" placeholder="Enter your ID" name="eid"><br>
<input type="text" placeholder="Enter your Salary" name="salary"><br>
<input type="text" placeholder="Enter your Department" name="dept"><br>
<input type="submit" value="add"><br>
<input type="reset" value="clear">
</form>
</body>
</html>