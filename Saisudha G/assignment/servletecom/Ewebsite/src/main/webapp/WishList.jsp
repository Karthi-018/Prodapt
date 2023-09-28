<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>/* Title bar styles */
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
        }</style>
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
<h1>WISHLIST</h1>
<form>
<table  cellpadding="10">
<tr>
<th>ProductName</th>
<th>Price</th>
<th>Quantity</th>

</tr>
<c:forEach var="w" items="${wish}">
<tr>

<td><c:out value="${w.pname }"></c:out></td>
<td><c:out value="${w.pprice }"></c:out></td>
<td><c:out value="${w.pqty }"></c:out></td>


</tr>
</c:forEach>
</table>
</form>


</body>
</html>