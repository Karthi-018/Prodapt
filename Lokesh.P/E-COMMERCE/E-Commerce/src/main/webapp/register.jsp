<!DOCTYPE html>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
	.outer{
		
		margin-top: 30px;
	}
	.inner{
		display: grid;
		justify-content: center;
		align-items: center;
		
	}

</style>
</head>
<body>
	<c:if test="${not empty registrationError}">
        <p style="color: red;">${registrationError}</p>
    </c:if>
	<div> <center><h1> Register Page </h1></center></div>
	<form action="login" method="post">
		<div class="outer">
			<div class="inner">
				First Name <input type="text" name="name1" placeholder="Enter name" >
			</div>
		</div>
		<div class="outer">
			<div class="inner">
				Last Name <input type="text" name="name2" placeholder="Enter second name">
			</div>
		</div>
		<div class="outer">
			<div class="inner">
				Mail<input type="email" name="mail" placeholder="Enter Mail">
			</div>
		</div>
		<div class="outer">
			<div class="inner">
				Mobile Number <input type="text" name="mobile" placeholder="Enter mobile">
			</div>
		</div>
		<div class="outer">
			<div class="inner">
				Password <input type="password" name="password" placeholder="Enter pass">
			</div>
		</div>
		<div class="outer">
			<div class="inner">
				 <input type="submit" value="submit">
				 <input type="reset" value="clear">
			</div>
		</div>
	</form>

</body>
</html>