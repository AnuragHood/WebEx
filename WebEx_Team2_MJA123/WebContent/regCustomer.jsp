<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <jsp:include page="admin.css"/>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="icon" href="/image/dota2logo.jpg">
<title>WebEx</title>
</head>
<body>
<div class="container">
<form action="CustomerController" method="post" id="signup">
<div class="header">
        
            <h3>Sign Up</h3>
            
            <p>You want to fill out this form</p>
            
        </div>
        
        <div class="sep"></div>

        <div class="inputs">

		<table align="center" border="0" width="40%">
			<tr>	
				<td align="left" width="30%" >Enter UserId</td>
				<td align="left" width="60%" >
					<input type="text" name="userId" required>
				</td>
			</tr>
		
			<tr>	
				<td align="left" width="30%" >FisrtName</td>
				<td align="left" width="60%" >
					<input type="text" name="FisrtName" required>
				</td>
			</tr>
			<tr>	
				<td align="left" width="30%" >LastName </td>
				<td align="left" width="60%" >
					<input type="text" name="LastName" required>
				</td>
			</tr>
			<tr>	
				<td align="left" width="30%" >Email </td>
				<td align="left" width="60%" >
					<input type="text" name="email" required>
				</td>
			</tr>
			<tr>	
				<td align="left" width="30%" >Contact no </td>
				<td align="left" width="60%" >
					<input type="text" name="contactno" pattern="[0-9]{10}" title="invalid mobile number">
				</td>
			</tr>
			<tr>	
				<td align="left" width="30%" >Password</td>
				<td align="left" width="60%" >
					<input type="password" placeholder="Password" name="Password" pattern=".{6,}" title="Six or more characters">
					
				</td>
			</tr>
						
			<tr>	
				<td align="center" colspan="2">
					<input type="submit" name="action" value="AddCustomer">
					
				</td>
			</tr>
		</table>
		</div>
	</form>
	</div>
	<br><br>
	
	<p align="center"><a href="index.jsp">Home</a></p><br>
		<p align="center"><a href="regCustomer.jsp">Goto SignUp page </a></p><br>
			<p align="center"><a href="customerlogin.jsp">Login here</a></p><br>
	
	<br><br>
	<p align="center">&copy;TCS 2018-19</p>
</body>
</html>