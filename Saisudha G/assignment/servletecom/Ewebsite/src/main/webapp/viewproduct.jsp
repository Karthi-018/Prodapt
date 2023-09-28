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

    background-image: url('bk1.jpg');

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

</style>

</head>
<body>
<form>
<h1>PRODUCT LIST</h1>
<table  cellpadding="10">
<style>
 body{
  background-image: url('bk1.jpg');
  background-size:cover;
  background-repeat:no-repeat;
}
</style>
<tr>
<th>PId</th>
<th>PName</th>
<th>Description</th>
<th>Price</th>
<th>Quantity</th>
<th>Action</th>
</tr>



 <c:forEach var="p" items="${view}">
<tr>

<td><c:out value="${p.pid }"></c:out></td>
<td><c:out value="${p.pname }"></c:out></td>
<td><c:out value="${p.pdes }"></c:out></td>
<td><c:out value="${p.pprice }"></c:out></td>
<td><c:out value="${p.pqty }"></c:out></td>
<td><a href="edit.jsp?id=${p.pid}&name=${p.pname}&des=${p.pdes}">Edit</a></td>
<td><a href="DeleteProduct?id=${p.pid}">Delete</a></td>


</tr>
</c:forEach>
</table>
</form>

</body>
</html>