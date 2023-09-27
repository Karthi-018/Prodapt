<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style> body { background-image: url('bk1.jpg'); 
background-size: cover; 
background-repeat: no-repeat; 
font-family: Arial, sans-serif; 
margin: 0;
 padding: 0; } 
 center { margin-top: 100px; } 
 form { background-color: #f2f2f2;
  padding: 20px;
   border-radius: 10px; 
   width: 50%; } 
   h1 { text-align: center;
    color: #007bff; } 
    table { width: 100%; } 
    td { padding: 10px; } 
    input[type="text"] 
    { width: 100%; 
    padding: 5px; 
    border: 1px solid #ccc;
     border-radius: 5px; } 
     input[type="submit"] 
     { background-color: #007bff; 
     color: white; 
     padding: 10px 20px; 
     border: none;
     border-radius: 5px; 
     cursor: pointer; } 
     </style>
</head>
<body>
<center>
<form action="editproduct" method="get">

<%request.setAttribute("price1", request.getParameter("Pprice"));
  request.setAttribute("qty1",request.getParameter("Pqty"));
 %>

<h1>EditProductList</h1>
<table>

<tr><td><label>Product Id</label></td>
<tr><%session.setAttribute("id1",Integer.parseInt(request.getParameter("id")));
      out.println(request.getParameter("id"));
      %>
 </tr>

<tr><td><label>Product Name</label></td>
<td><c:out value="${param.name }"></c:out></td></tr>
<tr><input type="hidden" name="name1" value="${param.name }"></tr>


<tr><td><label>Product Description</label></td>
<td><c:out value="${param.des }"></c:out></td></tr>
<tr><input type="hidden" name="des1" value="${param.des }"></tr>

<tr><td><label>Price</label></td>
<td><input type="text" name="price1" value="" placeholder="Enter updated Price"></td></tr>

<tr><td><label>Quantity</label></td>
<td><input type="text" name="qty1" value="" placeholder="Enter Quantity"></td></tr>

</table>
<input type="submit" value="Edit">
</form>
</center>
</body>
</html>