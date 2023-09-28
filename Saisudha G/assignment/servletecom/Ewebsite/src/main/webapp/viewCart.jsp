<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>

 

<head>
<meta charset="ISO-8859-1">
<title>Your Cart</title>
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
        /* Title bar styles */
        .title-bar {
            background-color: #333;
            padding: 10px;
            text-align: center;
        }

 

        .title-bar a {
            display: inline-block;
            padding: 5px 10px;
            text-decoration: none;
            color: white;
            margin: 0 10px;
        }
</style>
</head>

 

<body>
<div class="title-bar">

<a href="userhomepage.jsp">Home</a>
<a href="Viewcusproductcontroller?uname=${param.uname}&pwd=${param.pwd}">View Product</a>
<input type="text" name="pname" placeholder="Search for products......."> 
<a href="WishListController?uname=${param.uname}&pwd=${param.pwd}">My List</a>
<a href="Viewcartcontroller?uname=${param.uname}">My Cart</a>
<a href="logout.jsp">Logout</a>

</div>
<form>
<h1>Your Cart</h1>
<table cellpadding="10">
<tr>
<th>PId</th>
<th>PName</th>
<th>Price</th>
<th>Quantity</th>
<th>Buy</th>
<th>Remove</th>
</tr>
<c:forEach var="c" items="${cart}">
<tr>
<td><c:out value="${c.pid }"></c:out></td>
<td><c:out value="${c.pname }"></c:out></td>
<td><c:out value="${c.pprice }"></c:out></td>
<td><c:out value="${c.pqty }"></c:out></td>
<td><a href="purchasecontroller?uname=${param.uname}&pid=${c.pid }&pname=${c.pname }&pprice=${c.pprice }&pqty=${c.pqty }">Buy</a></td>
<td><a href="Deletecusproductcontroller?uname=${param.uname}&pid=${c.pid }&pname=${c.pname }&pprice=${c.pprice }&pqty=${c.pqty }">Remove</a></td>
</tr>
</c:forEach>
</table>
</form>
</body>

 

</html>



