<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1> Adding new Product Details </h1>

<table>
<thead>
<tr>
<th colspan="2" style="text-align: center;">Product Details</th>
</tr>
</thead>
<tbody>
<form action="createProduct" method="post">
<tr><td>Product ID</td><td><input type="text" name="pid" value="" placeholder="Enter the Product ID"></td></tr>
<tr><td>Product Name</td><td><input type="text" name="pname" value="" placeholder="Enter the Product Name"></td></tr>
<tr><td>Product Description</td><td><input type="text" name="pdesc" value="" placeholder="Enter the Product Description"></td></tr>
<tr><td>Product Price</td><td><input type="text" name="pPrice" value="" placeholder="Enter the Product Price"></td></tr>
<tr><td>Product Quantity</td><td><input type="text" name="pQty" value="" placeholder="Enter the Product Quantity"></td></tr>
<tr><th colspan="2"><input type="submit" value="Create Product"> <input type="reset" value="Clear Feilds"></th></tr>
</form>
</tbody>
</table>

</body>
</html>