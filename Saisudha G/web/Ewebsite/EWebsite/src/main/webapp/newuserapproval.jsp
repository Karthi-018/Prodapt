<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="Approvedcontroller"  method="get">
<h1>CUSTOMER LIST</h1>
<table  cellpadding="10">
<tr>
<th>Customer Name</th>
<th>DOB</th>
<th>Email Id</th>
<th>Phone no</th>
<th>Address</th>
<th>Action</th>
</tr>

 <c:forEach var="c" items="${control}" varstatus="loop">
<tr>

<td><c:out value="${c.name }"></c:out></td>
<td><c:out value="${c.dob }"></c:out></td>
<td><c:out value="${c.email }"></c:out></td>
<td><c:out value="${c.phno }"></c:out></td>
<td><c:out value="${c.add}"></c:out></td>
<td>
<input type="hidden" name="userIndex" value="${loop.index }">
<input type="submit" name="user" value="APPROVE"></td>
<td><input type="submit" name="userIndex" value="${loop.index}">
<input type="submit" name="user" value="REMOVE"></td>
</tr>
</c:forEach>
</table>
</form>


</body>
</html>