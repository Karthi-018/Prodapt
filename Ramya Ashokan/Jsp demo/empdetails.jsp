<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>  
 <%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<jsp:useBean id="e" class="edu.training.dao.Employee"></jsp:useBean>
<jsp:setProperty property="*" name="e"/>

<sql:setDataSource var="db"  driver="com.mysql.cj.jdbc.Driver" url="jdbc:mysql://localhost:3306/prodapt" user="root" password="root"/>

<sql:update var="temp" dataSource="${db}">insert into employee values(<jsp:getProperty property="eid" name="e"/>,'<jsp:getProperty property="ename" name="e"/>','<jsp:getProperty property="salary" name="e"/>','<jsp:getProperty property="dep" name="e"/>')</sql:update>

<sql:query var="result" dataSource="${db}">select * from employee where eid=12</sql:query> 

<table>
<thead>
<tr>
<th>ID</th>
<th>Name</th>
<th>Salary</th>
<th>Dept</th>
</tr>
</thead>
<tbody>
<c:forEach var="emp" items="${result.rows}">
<tr>
<td><c:out value="${emp.eid }"></c:out><jsp:setProperty property="eid" name="e" value="${emp.eid }"/></td>
<td><c:out value="${emp.ename }"></c:out><jsp:setProperty property="ename" name="e" value="${emp.ename }"/></td>
<td><c:out value="${emp.salary }"></c:out><jsp:setProperty property="salary" name="e" value="${emp.salary }"/></td>
<td><c:out value="${emp.dep }"></c:out><jsp:setProperty property="dep" name="e" value="${emp.dep }"/></td>
</tr>

</c:forEach>
</tbody>
</table>

<c:out value="${e }"></c:out>
</body>
</html>