<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%@ page import="java.util.*" %>
<%@ page import = "com.example.demo.entity.Products" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Employee List</h1>
<form action="/view">
    <table border="1">
        <tr>
            <th>Product ID</th>
            <th>Product Name</th>
            <th>description</th>
            <th>Price</th>
            <th>Quantity</th>
            <th>Category</th>
        </tr>
       <% List<Products> elist = (ArrayList<Products>)request.getAttribute("products");
       for(Products p : plist) {%>
       <tr>
       		<td><%=p.getPid %></td>
       		<td><%=p.getPname() %></td>
       		<td><%=p.getPdesc() %></td>
       		<td><%=p.getDept() %></td>
       </tr>
       <%} %>
    </table>
</form>    
</body>
</html>