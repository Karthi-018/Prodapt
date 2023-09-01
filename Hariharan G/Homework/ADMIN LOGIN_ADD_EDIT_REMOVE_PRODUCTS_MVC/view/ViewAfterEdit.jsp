<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<style>
table, th, td {
  border: 1px solid black;
}
</style>

<meta charset="ISO-8859-1">
<title><b>VIEW AFTER EDITING</b></title>
</head>
<body>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
session.getAttribute("viewList");

%>
<%= session.getAttribute("viewList")%>
<table>
<tr>
<th><b>PRODUCT ID</b></th>
<th><b>PRODUCT NAME</b></th>
<th><b>PRODUCT DESCRIPTION</b></th>
<th><b>PRODUCT PRICE</b></th>
<th><b>PRODUCT QUANTITY</b></th>
<th><b>EDIT PRODUCT DETAILS</b></th>
<th><b>DELETE PRODUCT DETAILS</b></th>

</tr>

<c:forEach var="i" items="${viewList }">
<tr>
<td><c:out value="${i.pId}"></c:out></td>
<td><c:out value="${i.pName}"></c:out></td>
<td><c:out value="${i.pDesc}"></c:out></td>
<td><c:out value="${i.pPrice}"></c:out></td>
<td><c:out value="${i.pQuantity}"></c:out></td>\
</tr>
</c:forEach>
</table>
</body>
</html>