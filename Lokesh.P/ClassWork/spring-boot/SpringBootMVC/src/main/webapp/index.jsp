<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Hello Welcome to LCU AND SPRING MVC </h1>

<form action="add">
<label>Employee Id</label>
<input type="text" name="eid"><br>
<label>Employee Name</label>
<input type="text" name="ename"><br>
<label>Salary</label>
<input type="text" name="salary">
<br>
<label>Department</label>
<select name="dept">
<option>HR</option>
<option>IT</option>
<option>Developer</option>
<option>Admin</option></select><br>
<input type="submit" name="add" value="ADD">
<input type="reset" name="clear" value="CLEAR">
</form>



<form action="/view">
<input type="submit" value="view">
</form> 


${o }
</body>
</html>