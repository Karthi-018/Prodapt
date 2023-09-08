<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration</title>
</head>
<br>
<center>
<h1> Welcome </h1>
<form action="reg" method="post">
<style>
body {
  background-image: url('https://images.unsplash.com/photo-1613684379901-697f0330c239?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D&auto=format&fit=crop&w=1374&q=80');
  background-repeat: no-repeat;
  background-attachment: fixed; 
  background-size: 100% 100%;
}
</style>
<table>
<tr>
<td><strong>First Name </td>
<td> <input type="text" name="fname" placeholder="First Name" ></td>
</tr>
<tr>
<td><strong>Last Name </td> 
<td><input type="text" name="lname" placeholder="Last Name" ></td>
</tr>
<tr>
<td><strong>Email </td> 
<td><input type="text" name="email" placeholder="Email" ></td>
</tr>
<tr>
<td><strong>Phone </td> 
<td><input type="text" name="phone" placeholder="Phone" ></td>
</tr>
<tr>
<td><strong>Password </td> 
<td><input type="text" name="pwd" placeholder="Password" ></td>
</tr>
<tr>
<td><input type="submit" value = "Register"> </td>
<td><input type="reset" value ="Reset"></td>
</tr>
   

</table>
</form>
</html>