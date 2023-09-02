

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!DOCTYPE html>

<html>

<head>

<meta charset="UTF-8">

<title>Add Product</title>

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

    width: 300px;

  }

 

  h1 {

    color: #333;

    margin-bottom: 20px;

  }

 

  label {

    font-weight: bold;

    margin-bottom: 5px;

  }

 

  input[type="text"] {

    width: 100%;

    padding: 8px;

    margin-bottom: 10px;

    border: 1px solid #ccc;

    border-radius: 3px;

    box-sizing: border-box;

  }

 

  input[type="submit"] {

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

<form action="Productcontroller">

  <h1>ADD PRODUCT</h1>

  <label>Product Id</label>

  <input type="text" name="Pid" value="" placeholder="Enter Product Id">

  <label>Product Name</label>

  <input type="text" name="Pname" value="" placeholder="Enter Product Name">

  <label>Description</label>

  <input type="text" name="Pdes" value="" placeholder="Enter Product Description">

  <label>Product Price</label>

  <input type="text" name="Pprice" value="" placeholder="Enter Product Price">

  <label>Quantity</label>

  <input type="text" name="Pqty" value="" placeholder="Enter Product Quantity">

  <input type="submit" value="Submit">

</form>

</body>

</html>