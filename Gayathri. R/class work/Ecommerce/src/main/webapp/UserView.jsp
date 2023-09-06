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
<h1 align="center" style="color: olive;">#***user display***#</h1>
<%-- out.println(request.getAttribute("userlist")); --%>
<table align="center" style="color:maroon; ;">
<c:forEach var="user" items="${userlist}">
<tr>
<td><c:out value="${user.name}"></c:out></td>
<td><c:out value="${user.dob}"></c:out></td>
<td><c:out value="${user.email}"></c:out></td>
<td><c:out value="${user.mobNo}"></c:out></td>
<td><c:out value="${user.password}"></c:out></td>

<td><c:out value="${user.gender}"></c:out></td>
<td><c:out value="${user.status}"></c:out></td>

<td><form action="./editing">
<input type="submit" name="edit" value="Approve" onclick="window.location.href='uservalidate.jsp'">
<input type="hidden" name="email" value="${user.email}">
<input type="submit" name="edit" value="Not-Approved" onclick="window.location.href='uservalidate.jsp'">
</form></td>
</tr>
</c:forEach>

</table>
</body>
</html>