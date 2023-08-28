<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
welcome <%=request.getParameter("uName")%><br>
<%! int n1=10,n2=10; %>
<%= n1+n2 %>
</body>
</html>