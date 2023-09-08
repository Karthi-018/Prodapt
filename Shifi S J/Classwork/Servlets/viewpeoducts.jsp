<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
<meta charset="ISO-8859-1">
<title>View products</title>
</head>
<h1>Products List</h1>
<table>
<style>
table, th, td {
  border:0.5px solid black;
}
</style>
<thead><tr>
<table style="width:100%">
<th>Product ID</th>
<th>Product Name</th>
<th>Product Description</th>
<th>Product Price</th>
<th>Product Quantity</th>
<th colspan="2">Choice</th>
</tr></thead>
<tbody>
<c:forEach var="product" items="${pList}">
<tr>
<td><c:out value="${product.pid}"></c:out></td>
<td><c:out value="${product.pname}"></c:out></td>
<td><c:out value="${product.pdesc}"></c:out></td>
<td><c:out value="${product.price}"></c:out></td>
<td><c:out value="${product.pquantity}"></c:out></td>
<!--  <td><form action="adminopr?pid=${product.pid}&pname=${product.pname}"> -->
<td><a href="editproduct.jsp?pid=${product.pid }">Edit</a></td>

<td><a href="DeleteProductController?deleteid=${product.pid}">Delete</a></td>

</tr>

</c:forEach>

</table><br><br>

<a href="AdminHome.jsp"><i>Go back to Admin menu</i></a>
 </form></td>
</tr>
</tbody>
</table>

</body>
</html>