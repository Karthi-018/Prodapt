<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>LOGIN PAGE</title>
</head>
<body>
<center>
<b>LOGIN PAGE</b>
<form action="LoginController" method="post"><br>
<table>
<tr>
<th>USERNAME</th>
<td><input type="text" name="username" placeholder="ENTER USERNAME"></td>
</tr>
<tr>
<th>PASSWORD</th>
<td><input type="text" name="password" placeholder="ENTER PASSWORD"></td>
</tr>

</table>
<br>
<input type="submit" name="login" value="LOGIN"><br><br>
<a href="Register.jsp">NEW USER?</a>
</form>
</center>

</body>
</html>