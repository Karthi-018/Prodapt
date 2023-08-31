<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
	.out{
		display: flex;
		justify-content: center;
	}
	.in{
		align-items: center;
		margin-top: 20px;
	}
</style>
</head>
<body>
<div><center><h2>Login Page</h2></center> </div>
<form action="LoginServlet" method="post">
	<div class="out">
		<div class="in">
			UserName <input type="text" name="name1">
		</div>
	</div>
	<div class="out">
		<div class="in">
			Password <input type="pass" name="pass">
		</div>
	</div>
	<div class="out">
		<div class="in">
			 <input type="submit" name="login" value="login">
			 <input type="reset" name="reset" value="reset">
		</div>
		
	</div>
</form>
</body>
</html>