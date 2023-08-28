<%-- 
    Document   : first
    Created on : 28 Aug, 2023, 1:03:56 PM
    Author     : Karthikeyan
--%>

<%@page import="java.util.Iterator"%>
<%@page import="java.util.Arrays"%>
<%@page import="java.util.List" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>


<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
      Welcome   <%= request.getParameter("uName") %>
      
      <%! int n1 = 10, n2 = 20; %>
      
      <%= n1 + n2 %>
      <br>
      <% 
            List list = Arrays.asList(1,2,3,4,5);
            
            Iterator itr = list.iterator();
             while(itr.hasNext())
             {  
      %>
      <%= itr.next() %>
      
      <%}%>
      
    </body>
</html>
