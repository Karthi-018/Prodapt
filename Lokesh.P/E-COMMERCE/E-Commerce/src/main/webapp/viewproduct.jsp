<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page import="edu.training.Model.ProductPojo" %>
<%@page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Hello</title>
</head>
<body>
<h1>Product List</h1>
<table>
<thead><tr>
<th>Product_id</th>
<th>Product Name</th>
<th>Product Desc</th>
<th>Product Price</th>
<th>Product Quantity</th>
<th>PERFORM</th>
</tr>
</thead>
<tbody>
<c:forEach  var="product" items="${products}">
<tr>
<td><c:out value="${product.product_id}"></c:out></td>

<td><c:out value="${product.product_Name}"></c:out></td>

<td><c:out value="${product.product_Desc}"></c:out></td>

<td><c:out value="${product.product_price}"></c:out></td>

<td><c:out value="${product.quantity}"></c:out></td>

<td><form action="choice" method="get"> <input type="hidden" name="Product_id" value="${product.product_id}"><input type="submit" name="choose" value="Edit"> <input type="submit" name="choose" value="Delete"> </form></td>
</tr>
</c:forEach>
</tbody>

</table>

</body>
</html>