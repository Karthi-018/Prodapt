<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="java.util.*" %>
    <%@page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%=request.getParameter("uname") %>
<% out.println(request.getParameter("uname")); %>
<%!int n1=10,n2=70; %>
<%=n1+n2 %>
<%
List list=Arrays.asList(1,2,3,4,5); 
Iterator itr=list.iterator();
while(itr.hasNext())
{
%>
<%=itr.next() %>
	
<% } %>
welcome ${uname}
</body>
</html>