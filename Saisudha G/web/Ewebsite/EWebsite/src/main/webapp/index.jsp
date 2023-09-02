

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!DOCTYPE html>

<html>

<head>

<meta charset="UTF-8">

<title>Admin Dashboard</title>

<style>

  body {

    background-image: url('bk1.jpg');

    background-size: cover;

    background-repeat: no-repeat;

    font-family: Arial, sans-serif;

    margin: 0;

    padding: 0;

    height: 100vh;

    display: flex;

    align-items: center;

    justify-content: center;

  }

 

  form {

    background-color: rgba(255, 255, 255, 0.8);

    padding: 20px;

    border-radius: 5px;

    box-shadow: 0 2px 5px rgba(0, 0, 0, 0.1);

    display: flex;

    flex-direction: column;

    align-items: center;

  }

 

  input[type="submit"] {

    margin: 10px 0;

    padding: 8px 15px;

    background-color: #333;

    color: #fff;

    border: none;

    border-radius: 3px;

    cursor: pointer;

    font-size: 16px;

    transition: background-color 0.3s;

  }

 

  input[type="submit"]:hover {

    background-color: #555;

  }

</style>
</head>
<body>

<form action="Adminchoicecontroller" method="get">

  <input type="submit" name="Admin" value="Add Product">
  <input type="submit" name="Admin" value="View Product">
  <input type="submit" name="Admin" value="UserAcess control">

</form>
</body>
</html>