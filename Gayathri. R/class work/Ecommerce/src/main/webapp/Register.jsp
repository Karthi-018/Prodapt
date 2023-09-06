<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body >
<h1 style="color:yellow;" align="center">welcome :))REGISTRATION PAGE:)) page</h1>
<form action="./registerpage" style="background-color: lavender;">
<table align="center" style="background-color: orange;">
<tr><td><label>Name</label></td></tr>
<tr><td><input type="text" name="cname"  placeholder="enter your name"></td></tr>
<tr><td><label>DOB</label></td></tr>
<tr><td><input type="date" name="dob"  placeholder="enter your dob"></td></tr>
<tr><td><label>EMAIL</label></td></tr>
<tr><td><input type="text" name="email"  placeholder="enter your email"></td></tr>
<tr><td><label>MOBILENO</label></td></tr>
<tr><td><input type="text" name="mbn"  placeholder="enter your mobileno"></td></tr>
<tr><td><label>PASSWORD</label></td></tr>
<tr><td><a >minimum of 8 characters</a></td></tr>
<tr><td><input type="password" name="pw"  placeholder="enter your password"></td></tr>
<tr><td><label>GENDER</label></td></tr>
<tr><td><input type="radio" id="male" name="gender" value="male" >  
  <label for="male">Male</label>
<input type="radio" id="female" name="gender" value="female" >
    <label for="female">feMale</label>
</td></tr>
<tr><td><input type="submit" value="Register" onclick=<%out.println("wait for sometime"); %>>
<input type="reset" value="clear"> </td></tr>

</table>
</form>
</body>
</html>