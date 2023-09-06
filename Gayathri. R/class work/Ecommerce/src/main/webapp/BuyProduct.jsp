<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>PURCHASE</title>
<div class="header"><jsp:include page="head.jsp" /></div>
</head>
<body>
<h3 align="center" style="color: olive;">Product Buyed successfull</h3>
<%--  out.println(request.getAttribute("productlist")); --%>
<table align="center" style="color:maroon; ;">
<c:forEach var="product" items="${buylist}">
<tr>
<td><c:out value="${product.pname}"></c:out></td>
<td><c:out value="${product.pdes}"></c:out></td>
<td><c:out value="${product.price}"></c:out></td>
</tr>
</c:forEach>

</table>


</body>
</html>