<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.ArrayList"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<style>
footer {
	position: fixed;
	left: 0;
	bottom: 0;
	width: 100%;
	color: blue;
	text-align: center;
}

h1 {
	text-align: center;
	text-transform: uppercase;
	color: #4CAF50;
}

p {
	text-indent: 50px;
	text-align: center;
	letter-spacing: 3px;
}

a {
	text-decoration: none;
	color: #008CBA;
}
</style>

<title>Result</title>
<center>
<body >
<a align="left" href="index.jsp" class="logo pull-left"><img
		src="themes/images/Logo.png" class="site_logo" alt="site-logo"></a>
	<h3 align="left" class="h1"> Welcome to WebEx</h3>
	<br>
	<br>

	<p class="p">
		<font color="green"><%=request.getAttribute("message")%></font>
	</p>
	<br>
	<br>
	<br>
	<br>
	<br>
	<br>

	
	<p class="p">
	
	<p align="center"><a href="index.jsp">Home</a></p><br>
		<p align="center"><a href="regCustomer.jsp">Goto SignUp page </a></p><br>
			<p align="center"><a href="customerlogin.jsp">Login here</a></p><br>
	
		
		<footer class="footer"> &copy;contact inforormation ::
		+917905384377 <br>
		copyright@2018 Anurag Pathak |<a href="aboutme.jsp">about
			developer</a> </footer>
	</p>
	</center>
</body>
</html>
