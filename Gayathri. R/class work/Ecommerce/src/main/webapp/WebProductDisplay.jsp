<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Products</title>
<div class="header"><jsp:include page="head.jsp" /></div>
</head>
<body>
<h1 align="center" style="color: olive;">#***product display***#</h1>
<%--  out.println(request.getAttribute("productlist")); --%>
<table align="center" style="color:maroon; column-span: 3;">
<c:forEach var="product" items="${productlist}">
<tr>
<td><c:out value="${product.pname}"></c:out></td>
<td><c:out value="${product.pdes}"></c:out></td>
<td><c:out value="${product.price}"></c:out></td>


<td><form action="./userprocess"id=${product.pid}>
<input type="submit" name="opr" value="BUY">
<input type="hidden" name="id" value="${product.pid}">
<input type="submit" name="opr" value="AddCart">
<input type="submit" name="opr" value="AddWishList">
</form></td>
</tr>
</c:forEach>

</table>


</body>
</html>