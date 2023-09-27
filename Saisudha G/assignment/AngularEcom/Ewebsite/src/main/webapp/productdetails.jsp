<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Product Details</title>
<style>
        /* Define your CSS styles here */
        h1 {
            text-align: center;
        }

 

        table {
            width: 100%;
            border-collapse: collapse;
            margin: 20px auto;
        }

 

        th, td {
            border: 1px solid #ddd;
            padding: 8px;
            text-align: left;
        }

 

        th {
            background-color: #f2f2f2;
        }
</style>
</head>
<body>
<h1>Product Details</h1>
<c:forEach var="g" items="${gp}">
<table>
<tr>
<th>Product Name</th>
<th>Product Description</th>
<th>Product Price</th>
</tr>
<tr>
<td>${g.pname}</td>
<td>${g.pdes}</td>
<td>${g.pprice}</td>
</tr>
</table>
</c:forEach>
</body>
</html>


