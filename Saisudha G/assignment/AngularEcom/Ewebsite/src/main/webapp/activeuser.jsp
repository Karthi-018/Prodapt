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
<form>
<h1>CUSTOMER LIST</h1>
<table cellpadding="10">
<thead>
<tr>
<th>Customer Name</th>
<th>DOB</th>
<th>Email Id</th>
<th>Phone no</th>
<th>Address</th>
<th>Action</th>
</tr>
</thead>
<tbody>
<c:forEach var="c1" items="${control1}">
<tr>
<td>${c1.name}</td>
<td>${c1.dob }</td>
<td>${c1.email}</td>
<td>${c1.phno}</td>
<td>${c1.add}</td>
<td>
<input type="hidden" name="name" value="${c1.name}">
<a href="Deapprovecontroller?Name=${c1.name}">DEACTIVATE</a>
<a href="RemoveController?Name=${c1.name}">REMOVE</a>
</td>
</tr>
</c:forEach>
</tbody>
</table>
</form>
</body>
</html>


