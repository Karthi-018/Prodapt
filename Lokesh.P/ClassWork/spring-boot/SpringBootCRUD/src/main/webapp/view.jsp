<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="com.example.demo.entity.Person,java.util.List" %>
 <%@ include file="home.jsp" %>

<!DOCTYPE html>

<html>

<head>

<meta charset="ISO-8859-1">

<title>Insert title here</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-C6RzsynM9kWDrMNeT87bh95OGNyZPhcTNXj1NW7RuBCsyN/o0jlpcV8Qyq46cDfL" crossorigin="anonymous"></script>

</head>

<body>
 <table class="table table-bordered table-striped">

		<thead>

			<tr>

				<th>id</th>

				<th>name</th>

				<th>salary</th>

				<th>dept</th>
				<th>action</th>

			</tr>

		</thead>

		<tbody>

			<%

				List<Person> list = (List) request.getAttribute("viewlist");

			%>

 

			<%

				for (Person u : list) {

			%>

			<tr>


				<td><%=u.getId()%></td>

				<td><%=u.getName() %></td>

				<td><%=u.getSalary()%></td>

				<td><%=u.getDept()%></td>
				<td><a href="/">Edit</a>
				<a href="/delete1?id=<%=u.getId()%>">Delete</a></td>

			</tr>

			<%

				}

			%>
			

		</tbody>

	</table>

</body>

</html>