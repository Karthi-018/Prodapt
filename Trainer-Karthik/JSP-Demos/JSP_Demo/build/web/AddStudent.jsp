<%-- 
    Document   : AddStudent
    Created on : 28 Aug, 2023, 4:23:39 PM
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
        <form action="student.jsp">
            
            <table border="0">
            <thead>
                <tr>
                    <th colspan="2">Add Student Details</th>
                </tr>
            </thead>
            <tbody>
                <tr>
                    <td>Student ID</td>
                    <td><input type="text" name="sid" value="" /></td>
                </tr>
                <tr>
                    <td>Student Name </td>
                    <td><input type="text" name="sName" value="" /></td>
                </tr>
                <tr>
                    <td><input type="submit" value="Add Details" /></td>
                    <td><input type="reset" value="Clear" /></td>
                </tr>
            </tbody>
        </table>
        </form>

    </body>
</html>
