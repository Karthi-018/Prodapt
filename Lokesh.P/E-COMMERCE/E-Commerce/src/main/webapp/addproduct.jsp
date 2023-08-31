<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
.outer{
display:flex;
justify-content: center;}
.inner{
display:grid;
gap:20px;}</style>
</head>
<body>
<div><h1>Add Products</h1>
<form action="ProductController" method="post">
<div class="outer">
<div class="inner">
<label>Product Id</label>
<input type="text" name="Product_id">
</div>
</div>
<div class="outer">
<div class="inner">
<label>Product Name</label>
<input type="text" name="Product_Name">
</div>
</div>
<div class="outer">
<div class="inner">
<label>Product Desc</label>
<input type="text" name="Product_Desc">
</div>
</div>
<div class="outer">
<div class="inner">
<label>Product Price</label>
<input type="text" name="Product_price">
</div>
</div>
<div class="outer">
<div class="inner">
<label>Product Quantity</label>
<input type="text" name="Quantity">
</div>
</div>
<div class="outer">
<div class="inner">
<input type="submit" name="submit" value="add it">
<input type="reset" name="reset" value="clear">
</div>
</div>


</form>
</div>
</body>
</html>