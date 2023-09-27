<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>

  body {

    

    background-size: cover;

    background-repeat: no-repeat;
    margin:0
    font-family: Arial, sans-serif;

  }

  

  
h1{

            text-align: center;
            margin-top: 20px;

}
  table{
  width:100%;
  border-collapse:collapse;
  margin-top: 20px;
  
  }
  th,td{
  padding:10px;
  text-align:left;
  border-bottom:1px solid #ddd;
  }
th{
background-color:#f2f2f2;
}
th:hover{
background-color:#f5f5f5;
}
  a{
  text-decoration:none;
  color:#007bff;
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
<form action="AddtoCart" method="get">
<h1>PRODUCT LIST</h1>
<table  cellpadding="10">
<tr>
<th>PId</th>
<th>ProductName</th>
<th>Price</th>
<th>Quantity</th>
<th>WishList</th>
<th>AddtoCart</th>
<th>Buy</th>
</tr>
<%session.setAttribute("name",request.getParameter("name"));%>
<%session.setAttribute("email",request.getParameter("email")); %>
<c:forEach var="c" items="${control1 }">

<input type="hidden" name="name" value="${c.name }">
<input type="hidden" name="email" value="${c.email }">
</c:forEach>

 <c:forEach var="p1" items="${view1}">
<tr>
<td><c:out value="${p1.pid }"></c:out></td>
<td><a href="productdetailscontroller?pid=${p1.pid}">${p1.pname}</a> </td>
<td><c:out value="${p1.pprice }"></c:out></td>
<!--  <td><c:out value="${p1.pqty }"></c:out></td>-->
<td><input type="number" name="qty" min="1" max="${p1.pqty }"></td>
<td><a href="WishListController?uname=${param.uname}&pwd=${param.pwd}&pid=${p1.pid}&pname=${p1.pname}&pprice=${p1.pprice}&pqty=${p1.pqty}">WishList</a></td>
<td><a href="AddtoCart?uname=${param.uname}&pwd=${param.pwd}&pid=${p1.pid}&pname=${p1.pname}&pprice=${p1.pprice}&pqty=${1}">AddtoCart</a></td>
<td><a href="purchasecontroller?uname=${param.uname}&pwd=${param.pwd}&pid=${p1.pid}&pname=${p1.pname}&pprice=${p1.pprice}&pqty=${1}">Buy</a></td>

</tr>
</c:forEach>
</table>
</form>

</body>
</html>