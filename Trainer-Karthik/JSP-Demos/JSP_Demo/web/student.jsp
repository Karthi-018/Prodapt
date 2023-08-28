<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%-- 
    Document   : student
    Created on : 28 Aug, 2023, 4:18:39 PM
    Author     : Karthikeyan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
      <%--   <jsp:useBean id="s" scope="page" class="edu.training.Student" />
         <jsp:setProperty name="s" property="*"/> 
        <jsp:setProperty name="s" property="sid" />
        <jsp:setProperty name="s" property="sName" />
        
        
        <jsp:getProperty name="s" property="sid" />
        <jsp:getProperty name="s" property="sName" />
        --%>
        
    <c:forEach var="li" items="${list}">
        <c:out value="${li}"></c:out><br>
    </c:forEach>
        
        
    </body>
</html>
