<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>

 

<head>
<meta charset="UTF-8">
<title>Purchase Page</title>
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

 

        h2 {
            color: #333;
            margin-top: 20px;
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

 

        input[type="text"], textarea {
            width: 100%;
            padding: 8px;
            margin-bottom: 10px;
            border: 1px solid #ccc;
            border-radius: 3px;
            box-sizing: border-box;
        }

 

        input[type="checkbox"] {
            margin-top: 5px;
        }

 

        input[type="submit"] {
            padding: 8px 15px;
            background-color: #333;
            color: #fff;
            border: none;
            border-radius: 3px;
            cursor: pointer;
            font-size: 16px;
            transition: background-color 0.3s;
        }

 

        input[type="submit"]:hover {
            background-color: #555;
        }

 

        label {
            display: block;
            font-weight: bold;
            margin-top: 10px;
        }

 

        pre {
            white-space: pre-wrap;
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

 

    <h1>Purchase Page</h1>

 

    <h2>Available Products:</h2>

 

    <form action="thankyou.html" >
<table border="1">
<tr>
<th>Product ID</th>
<th>Product Name</th>

<th>Price</th>
<th>Quantity</th>
<th>Select</th>

</tr>
<c:forEach var="c" items="${cart}">
<tr>
<td>${c.pid}</td>
<td>${c.pname}</td>

<td>${c.pprice}</td>
<td>${c.pqty}</td>

<td><input type="checkbox" name="selectedProducts" value="${c.pid}">
</td>

</c:forEach>


<tr>
<td></td>
<td>Total</td>
<td>28000</td>
<td>3</td>

</table>

 

        <h2>Payment and Shipping Information:</h2>

 

        <label for="cardNumber">Card Number:</label>
<input type="text" id="cardNumber" name="cardNumber" required><br>

 

        <label for="expirationDate">Expiration Date:</label>
<input type="text" id="expirationDate" name="expirationDate" placeholder="MM/YYYY" required><br>

 

        <label for="shippingAddress">Shipping Address:</label>
<textarea id="shippingAddress" name="shippingAddress" rows="4" cols="50" required></textarea><br>

 

        
        
<label for="pqty">Total Quantity:</label>
       
        <input type="submit" value="Purchase">
    </form>
    

 

</body>

 

</html>


