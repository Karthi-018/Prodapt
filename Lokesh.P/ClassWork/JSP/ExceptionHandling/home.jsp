<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" errorPage="error.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Hello Programmer Let's Code</h1>
<!-- Declaration tag -->
<%! int x=3; %>
<!--  Directive tag-->
<%@page import="java.util.Scanner" %>
<!-- Scriptlet tag (part of service method) -->
<% 
out.println(7+5);%>
<!-- Expression tag-->
<%= x %>
<% int k=7/0; %>
</body>
</html>