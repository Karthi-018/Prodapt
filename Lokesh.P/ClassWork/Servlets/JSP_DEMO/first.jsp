<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import ="java.util.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
out.println(request.getParameter("name"));%> <br>
<%= "welcome " + request.getParameter("name")%> <br>
<%! int n1=10, n2=20; %>
<%= n1+n2 %> <br>
<% List list=Arrays.asList(1,2,3,4,5); 
Iterator itr=list.iterator();
while(itr.hasNext())
{
	//instead of this out.println(itr.next());
	%>
	<%= itr.next() %>
	
<%} %>


</body>
</html>