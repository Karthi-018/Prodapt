<%@ page language="java" contentType="text/html; charset=ISO-8859-1"

    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>

<html>

<head>

<meta charset="ISO-8859-1">

<title>Insert title here</title>

</head>

<body>

<%

String a=request.getParameter("fname");

String b=request.getParameter("lname");

out.println("Hello"+" "+a+" "+b);

System.out.println(a+" "+b);

%>

<br>

<%=a+" "+b %>

 

</body>

</html>
<%-- <%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<%! page import="java.util.*" %>
<title>JSP PAGES</title>
</head>
<body>
Welcome <%= request.getParameter("uName") %>
<%! int n1=10,n2=20; %>
<%=n1+n2 %>
<br>
<%
List list =Arrays.asList(1,2,3,4,5);
Iterator itr=list.iterator();
while(itr.hasNext()){%>
<%= itr.next() %>
<%} %>

</body>
</html> --%>