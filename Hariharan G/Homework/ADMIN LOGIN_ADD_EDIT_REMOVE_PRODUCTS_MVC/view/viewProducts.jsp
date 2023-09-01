<%@page import="java.util.ArrayList"%>
<%@page import="org.apache.jasper.tagplugins.jstl.core.ForEach"%>
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
<title>Insert title here</title>
</head>
<body>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:useBean id="product" class="edu.training.model.Product"></jsp:useBean>
<%--  <% ArrayList<Product> list=(ArrayList<Product>)request.getAttribute("viewList"); %>--%>
<center>
<label><b>VIEW PRODUCTS</b></label>
<%-- <%
HttpSession session=request.getSession();
session.setAttribute("editid",request.getParameter(""))
%> --%>
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
<td><c:out value="${i.pQuantity}"></c:out></td>
<td><a href="Edit.jsp?editid=${i.pId }">Edit</a></td>
<td><a href="DeleteProductController?deleteid=${i.pId }">Delete</a></td>
</tr>
</c:forEach>

</table>
<a href="Admin_home.jsp"><i>Go back to admin menu</i></a>

</center>

</body>
</html>