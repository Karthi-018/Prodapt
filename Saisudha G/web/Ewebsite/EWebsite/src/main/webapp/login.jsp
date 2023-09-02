<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!DOCTYPE html>

<html>

<head>

<meta charset="UTF-8">

<title>Login Page</title>

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
<h1>LOGIN</h1>

<center>
<form action="LoginvalidationFilter">

<label>Username</label>
<input type="text" name="uname" value="" placeholder="Enter your username">
<label>Password</label>
<input type="password" name="pwd" value="" placeholder="Enter your password">
<input type="submit" value="Submit">
<input type="reset" value="Reset">

</form>
</center>
</body>
</html>

