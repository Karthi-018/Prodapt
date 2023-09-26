<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<center>
<h4>To search employee based on Department</h4>
<form action="/search">
<input type="text" name="dept" placeholder="enter department">
<input type="submit" value="search">
</form><br>
<form action="/searchid">
<input type="text" name="eid" placeholder="enter id">
<input type="submit" value="search">
</form>
</center>
</body>
</html>