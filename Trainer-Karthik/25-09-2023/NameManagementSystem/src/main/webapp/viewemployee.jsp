<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<p style="text-align: center;width: 100%"><%@ include file="menu.jsp" %></p>
<table>
<thead>
<tr>
<th>Name</th>
</tr>
</thead>
<tbody>
<% List<String> nList = (List)request.getAttribute("eList");
	for(String name : nList)
	{
%>
<tr>
<td>
<%= name %>
</td>
</tr>
<% } %>
</tbody>
</table>
</body>
</html>