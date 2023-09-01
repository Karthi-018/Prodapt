<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="addProducts" method="post">
<center>
<label><b>ADMIN ADD PRODUCT PAGE </b></label>
<br><br>
<table>
<tr>
<td>ENTER PRODUCT ID</td>
<td><input type="text" name="pid" placeholder="PRODUCT ID"></td>
</tr>
<tr>
<td>ENTER PRODUCT NAME</td>
<td><input type="text" name="pname" placeholder="PRODUCT NAME"></td>
</tr>
<tr>
<td>ENTER PRODUCT DESCRIPTION</td>
<td><input type="text" name="pdesc" placeholder="PRODUCT DESCRIPTION"></td>
</tr>
<tr>
<td>ENTER PRODUCT PRICE</td>
<td><input type="text" name="pprice" placeholder="PRODUCT PRICE"></td>
</tr>
<tr>
<td>ENTER PRODUCT QUANTITY</td>
<td><input type="text" name="pquantity" placeholder="PRODUCT QUANTITY"></td>
</tr>

</table>
<br><br>
<input type="submit" value="ADD PRODUCT">
<br><br>
<input type="reset" value="RESET VALUES">
<br><br>
<a href="Admin_home.jsp">GO TO ADMIN HOME PAGE</a>
</center>
</form>
</body>
</html>