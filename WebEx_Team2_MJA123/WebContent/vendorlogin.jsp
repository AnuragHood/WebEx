<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
        <jsp:include page="admin.css"/>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login/SignUp</title>
</head>
<body>
<div class="container">

    <form id="signup" action="VendorController" method="post"  >

        <div class="header">
        
            <h3>Vendor LogIn</h3>
            
            <p>You want to fill out this form</p>
            
        </div>
        
        <div class="sep"></div>

        <div class="inputs">
        
            <input type="text" placeholder="User Name" autofocus name="userId" required />
        
            <input type="password" placeholder="Password" name="password" required/>
            
            <div class="checkboxy">
                <input name="cecky" id="checky" value="1" type="checkbox" checked="checked" required/><label class="terms" checked>I accept the terms of use</label>
            </div>
            <label>
        <input type="checkbox" checked="checked" name="remember"> Remember me
      </label>
            <div>
 <button  type="button" name="Cancel" value="Cancel" onclick="window.location = 'index.jsp' ">Cancel</button>   
     <span >Forgot <a href="#">password?</a></span>
    </div>
            
            <button id="submit" type="submit"  name="action" value="login">SIGN IN</button>
            <p align=center>or</p>
             <a id="submit" href="VendorRegPage.jsp">SIGN UP NOW</a>
              </div>
              </form>      			
	
                    
        </div>
</body>
</html>