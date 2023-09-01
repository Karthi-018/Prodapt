<%@page import="org.apache.taglibs.standard.tag.el.sql.SetDataSourceTag"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%@taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
int pid=Integer.parseInt(request.getParameter("editid"));
session.setAttribute("editid",request.getParameter("editid"));
%>
<sql:setDataSource var="db"

            driver="com.mysql.cj.jdbc.Driver"

            url="jdbc:mysql://localhost:3306/prodapt"

            user="root"

            password="root"/>
<sql:query dataSource = "${db}" var = "rs">
        select * from products where pId=<%=  pid %>
      </sql:query>
      
      
<center>

<label><b>EDIT PRODUCT DETAILS</b></label>

<!-- <table>
<tr>
<th>Edit product price</th>
<td><input type="submit" name="choice" value="EDIT PRODUCT PRICE" ></td>
</tr>
<tr>
<th>Edit product quantity</th>
<td><input type="submit" name="choice" value="EDIT PRODUCT QUANTITY"></td>
</tr>
</table>
 -->


<form action="EditProductController" method="post">
<table border = "1" width = "100%">
         <tr>
            <th>Product ID</th>
            <th>Product Name</th>
            <th>Product Description</th>
            <th>Product Price</th>
            <th>Product Quantity</th>
            
         </tr>
        
         <c:forEach var = "row" items = "${rs.rows}">
         
            <tr>
               <td> <c:out value = "${row.pId}"/></td>
               <td> <c:out value = "${row.pName}"/></td>
               <td> <c:out value = "${row.pDesc}"/></td>
               <td><input type="text" name="editPrice" value="${row.pPrice}"> </td>
               <td><input type="text" name="editQuantity" value="${row.pQuantity}"> </td>
               
              <%--  <td> <c:out value = "${row.pPrice}"/></td>
               <td> <c:out value = "${row.pQuantity}"/></td> --%>
               
            </tr>
         </c:forEach>
      </table>
      <input type="submit" value="EDIT">
      







</form>
</center>
</body>
</html>