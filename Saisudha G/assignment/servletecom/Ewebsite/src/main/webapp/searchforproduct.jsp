<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>

 

<head>
<meta charset="UTF-8">
<title>Customer List</title>
<style>
        body {
            font-family: Arial, sans-serif;
        }

 

        h1 {
            background-color: #007BFF;
            color: #fff;
            padding: 10px;
        }

 

        table {
            width: 100%;
            border-collapse: collapse;
        }

 

        th, td {
            padding: 10px;
            border: 1px solid #ddd;
            text-align: left;
        }

 

        th {
            background-color: #007BFF;
            color: #fff;
        }

 

        tr:nth-child(even) {
            background-color: #f2f2f2;
        }

 

        a {
            text-decoration: none;
            padding: 5px 10px;
            margin-right: 5px;
            border: 1px solid #007BFF;
            color: #007BFF;
            border-radius: 3px;
        }

 

        a:hover {
            background-color: #007BFF;
            color: #fff;
        }
</style>
</head>

 

<body>
<iframe src="titlebar.jsp" frameborder="0" width="100%" height="100"></iframe>
<form>

<c:if test="${not empty search}">

<table>

<tr>

<th>ProductId</th>

<th>ProdctName</th>

<th>Description</th>

<th>Price</th>

<th>Quantity</th>

</tr>

<c:forEach var="s" items="${search}">

<tr>

<td>${s.pid}</td>

<td>${s.pname}</td>

<td>${s.pdes }</td>

<td>${s.pprice}</td>

<td>${s.pqty}</td>

</tr>

</c:forEach>

 

</table>

</c:if>

<c:if test="${empty search}">

<p>No Products found for the given search</p>

</c:if>