<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<style>
        body {
            font-family: Arial, sans-serif;
            margin: 0;
            padding: 0;
            background-color: #f0f0f0;
        }

 

        #title-bar {
            background-color: #333;
            color: #fff;
            text-align: center;
            padding: 20px;
        }

 

        #nav-bar {
            background-color: #444;
            color: #fff;
            text-align: center;
            padding: 10px;
        }

 

        #nav-bar ul {
            list-style-type: none;
            padding: 0;
        }

 

        #nav-bar ul li {
            display: inline;
            margin-right: 10px;
        }

 

        #nav-bar ul li a {
            text-decoration: none;
            color: #fff;
            padding: 5px 10px;
            border: 1px solid #fff;
            border-radius: 5px;
        }

 

        #content {
            padding: 20px;
            text-align: center;
        }
</style>
</head>
<body>
<div id="title-bar">
<h1>Welcome to Our Online Store</h1>
</div>

<div id="nav-bar">
<form action="SearchproductController" method="get">

<ul>
<li><a href="userhomepage.jsp">Home</a></li>
<li><a href="Viewcusproductcontroller?uname=${param.uname}&pwd=${param.pwd}">View Product</a></li>
<li><input type="text" name="pname" placeholder="Search for products......."> </li>
<li><a href="WishListController?uname=${param.uname}&pwd=${param.pwd}">My List</a></li>
<li><a href="Viewcartcontroller?uname=${param.uname}">My Cart</a></li>
<li><a href="logout.jsp">Logout</a></li>
</ul>
</form>
</div>

 

    <div id="content">
<!-- Your main content goes here -->
<p>Welcome to our online store! Browse our products, add them to your cart, and enjoy shopping.</p>
</div>

</body>
</html>