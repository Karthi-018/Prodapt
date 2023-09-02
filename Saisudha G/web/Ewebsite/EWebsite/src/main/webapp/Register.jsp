<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Registration Form</title>
<style>
        body {
            background-image: url('your-background-image.jpg'); /* Replace with your background image URL */
            background-size: cover;
            background-repeat: no-repeat;
            font-family: Arial, sans-serif;
            color: #333; /* Text color for better readability on the background */
        }

 

        h1 {
            text-align: center;
            background-color: #333;
            color: white;
            padding: 10px;
        }

 

        form {
            margin: 0 auto;
            width: 50%;
            background-color: #fff; /* Form background color */
            padding: 20px;
            border-radius: 10px; /* Rounded corners for the form */
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.2); /* Add a slight shadow to the form */
        }

 

        table {
            width: 100%;
            border-collapse: collapse;
        }

 

        td {
            padding: 15px;
        }

 

        label {
            font-weight: bold;
        }

 

        input[type="text"],
        input[type="date"],
        input[type="password"] {
            width: 100%;
            padding: 10px;
            margin-bottom: 10px;
            border: 1px solid #ddd; /* Add a border to input fields */
            border-radius: 5px; /* Rounded corners for input fields */
        }

 

        input[type="submit"],
        input[type="reset"] {
            width: 48%;
            padding: 10px;
            background-color: #007bff; /* Button background color */
            color: white;
            border: none;
            cursor: pointer;
            border-radius: 5px; /* Rounded corners for buttons */
        }

 

        input[type="submit"]:hover,
        input[type="reset"]:hover {
            background-color: #0056b3; /* Button color on hover */
        }

 

        center {
            text-align: center;
        }

 

        /* Title bar styles */
        .title-bar {
            background-color: #333;
            padding: 10px;
            text-align: center;
        }

 

        .title-bar a {
            display: inline-block;
            padding: 5px 10px;
            text-decoration: none;
            color: white;
            margin: 0 10px;
        }
</style>
</head>
<body>

<div class="title-bar">
<a href="homejsp.jsp">Home</a>
<a href="Register.jsp">Register</a>
<a href="login.jsp">Login</a>
</div>

 
<h1>REGISTRATION</h1>

<form action="RegisterController" method="get">

<table>
<tr>
<td><label>Name</label></td>
<td><input type="text" name="name" value="" placeholder="Enter Your First Name" /></td>
</tr>

<tr>
<td><label>DOB</label></td>
<td><input type="date" name="dob" value="" placeholder="Enter Your DOB" /></td>
</tr>

<tr>
 <td><label>Email</label></td>
<td><input type="text" name="email" value="" placeholder="Enter Your email id" /></td>
</tr>

<tr>
<td><label>Phone No</label></td>
<td><input type="text" name="phno" value="" placeholder="Enter Your Phone no" /></td>
</tr>

<tr><td><label>Address</label></td>
<td><input type="text" name="add" value="" placeholder="Enter Your Address" /></td>
</tr>

<tr><td><label>Password</label></td>
<td><input type="password" name="pwd" value="" placeholder="Enter Your Password" /></td>
</tr>

</table>
<br>
<center>

<input type="submit" value="REGISTER" />
<input type="reset" value="RESET" />

</center>
</form>
</body>
</html>

