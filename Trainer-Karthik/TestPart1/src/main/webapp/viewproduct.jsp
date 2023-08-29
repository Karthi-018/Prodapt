<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Product List</h1>

<table>
<thead><tr>
<th>Product ID</th>
<th>Product Name</th>
<th>Product Desc</th>
<th>Product Price</th>
<th>Product Qty</th>
<th>Choice</th>
</tr></thead>
<tbody>
<c:forEach var="product" items="${pList}">
<tr>
<td><c:out value="${product.pid}"></c:out></td>
<td><c:out value="${product.pName}"></c:out></td>
<td><c:out value="${product.pDesc}"></c:out></td>
<td><c:out value="${product.pPrice}"></c:out></td>
<td><c:out value="${product.pQty}"></c:out></td>
<td><form action="adminOpr?pid=${product.pid}"> <input type="submit" name="adminChoice" value="EDIT"> <input type="submit" name="adminChoice" value="DELETE"> </form></td>
</tr>
</c:forEach>
</tbody>
</table>

</body>
</html>