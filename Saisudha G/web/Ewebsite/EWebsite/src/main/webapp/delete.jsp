<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>

  body {

    background-image: url('bk1.jpg');

    background-size: cover;

    background-repeat: no-repeat;

    font-family: Arial, sans-serif;

    margin: 0;

    padding: 0;

  }

  form {

    background-color: #f2f2f2;

    padding: 20px;

    border-radius: 10px;

    width: 50%;

    margin: 100px auto;

  }

  h1 {

    text-align: center;

    color: #007bff;

  }

  table {

    width: 100%;

  }

  td {

    padding: 10px;

  }

  input[type="submit"] {

    background-color: #007bff;

    color: white;

    padding: 10px 20px;

    border: none;

    border-radius: 5px;

    cursor: pointer;

  }

</style>
</head>
<body>
<form action="DeleteProduct" method="get">
<h1>EditProductList</h1>
<table>
<tr><td><label>Product Id</label></td>
<td><c:out value="${param.id }"></c:out></td></tr>
<tr><input type="hidden" name="id1" value="${param.id}"></tr>
</table>
<input type="Submit" value="Delete">
</form>

</body>
</html>