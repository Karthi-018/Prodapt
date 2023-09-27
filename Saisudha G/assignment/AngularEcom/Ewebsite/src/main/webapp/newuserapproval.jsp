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
            background-color: #f2f2f2;
            margin: 0;
            padding: 0;
        }

 

        h1 {
            background-color: #007BFF;
            color: #fff;
            padding: 10px;
        }

 

        table {
            width: 100%;
            border-collapse: collapse;
            background-color: #fff;
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
<c:forEach var="c" items="${control}">
<tr>
<td>${c.name}</td>
<td>${c.dob}</td>
<td>${c.email}</td>
<td>${c.phno}</td>
<td>${c.add}</td>
<td>
<input type="hidden" name="name" value="${c.name}">
<a href="ApproveController?Name=${c.name}">APPROVE</a>
<a href="RemoveController?Name=${c.name}">REMOVE</a>
</td>
</tr>
</c:forEach>
</tbody>
</table>
</form>

 

</body>

 

</html>


