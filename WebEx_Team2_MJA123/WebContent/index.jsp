<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta charset="utf-8">
<title>Welcome to Shopping world..</title>
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta name="description" content="">
<!--[if ie]><meta content='IE=8' http-equiv='X-UA-Compatible'/><![endif]-->
<!-- bootstrap -->
<link href="bootstrap/css/bootstrap.min.css" rel="stylesheet">
<link href="bootstrap/css/bootstrap-responsive.min.css" rel="stylesheet">
<link href="themes/css/bootstrappage.css" rel="stylesheet" />
<!-- global styles -->
<link href="themes/css/flexslider.css" rel="stylesheet" />
<link href="themes/css/main.css" rel="stylesheet" />

<!-- scripts -->
<script src="themes/js/jquery-1.7.2.min.js"></script>
<script src="bootstrap/js/bootstrap.min.js"></script>
<script src="themes/js/superfish.js"></script>
<script src="themes/js/jquery.scrolltotop.js"></script>
<!--[if lt IE 9]>			
			<script src="http://html5shim.googlecode.com/svn/trunk/html5.js"></script>
			<script src="js/respond.min.js"></script>
		<![endif]-->

</head>
<body>
	<a href="index.jsp" class="logo pull-left"><img
		src="themes/images/Logo.png" class="site_logo" alt="site-logo"></a>
	<div id="top-bar" class="container">
		<div class="row">
			<div class="span4">
				<form method="POST" class="search_form">
					<input type="text" class="input-block-level search-query"
						Placeholder="Please search here...">
				</form>
			</div>
			<div class="span8">
				<div class="account pull-right">
					<ul class="user-menu">
						<li><a href="cart.html">Your Cart</a></li>
						<li><a href="checkout.html">Checkout</a></li>
						<li><a href="checkout.html">Support</a></li>
						<li><div class="dropdown">
			<a class="dropbtn1">Login/SignUp Type</a>
			<div class="dropdown-content">
				<a href="customerlogin.jsp">Customer</a> <a href="vendorlogin.jsp">Vendor</a> 
			</div>
		</div></li>
					</ul>
				</div>
			</div>
		</div>
	</div>
	<div id="wrapper" class="container">
		<section class="navbar main-menu">
		<div class="navbar-inner main-menu">
			<nav id="menu" class="pull-right">
			<ul>
				<li><a href="./products.html">Medicine</a></li>
				<li><a href="./products.html">Suiting Shirting Sports and
						much more...</a></li>
			</ul>
			</nav>
		</div>
		</section>


	<center>

		<div class="dropdown">
			<button class="dropbtn">Select Your Location</button>
			<div class="dropdown-content">
				<a href="#">Chennai</a> <a href="#">Delhi</a> <a href="#">Banglore</a>
			</div>
		</div>
		</center>
		
		<br><br><br><br>
		<button class="dropbtn1" onclick="playVid()" type="button">Play Video</button>
	<button class="dropbtn1" onclick="pauseVid()" type="button">Pause Video</button>
		<video id="myVideo"  width="100%" height="50%" volume="2">
  <source src="Inspirational Piano Music - Dare to Dream Big.mp4" type="video/mp4" >
  <source src="Inspirational Piano Music - Dare to Dream Big.ogg" type="video/ogg">
  Your browser does not support the video tag.
</video>
<script> 
var vid = document.getElementById("myVideo"); 

function playVid() { 
    vid.play(); 
} 

function pauseVid() { 
    vid.pause(); 
} 
</script> 
</body>
</html>
