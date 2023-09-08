<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add products</title>
</head>
<body>
<center>
<h1> Welcome </h1>
<form action="ProductController">
<table>
<tr>
<td>Product ID </td>
<td> <input type="text" name="pid" ></td>
</tr>
<tr>
<td> Product Name</td> 
<td><input type="text" name="pname" ></td>
</tr>
<tr>
<td>Product Description </td> 
<td><input type="text" name="pdesc" ></td>
</tr>
<tr>
<td>Product Price </td> 
<td><input type="text" name="price"></td>
</tr>
<tr>
<td>Product Quantity </td> 
<td><input type="text" name="pquantity" ></td>
</tr>
<tr>
<td><input type="submit" value = "ADD"> </td>

</tr>
 </center> 

</table>
</form>
</html>
</body>
</html>