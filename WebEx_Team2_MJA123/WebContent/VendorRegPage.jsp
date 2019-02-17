<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Vendor Registration</title>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<style>
.accordion {
	background-color: #eee;
	color: #444;
	cursor: pointer;
	padding: 18px;
	width: 100%;
	border: none;
	text-align: left;
	outline: none;
	font-size: 15px;
	transition: 0.4s;
}

.active,.accordion:hover {
	background-color: #ccc;
}

.panel {
	padding: 0 18px;
	display: none;
	background-color: white;
	overflow: hidden;
}
</style>
</head>
<body>
	<center>
		<h1>VENDOR REGISTRATION</h1>
	</center>

	<button class="accordion"><h4>PERSONAL DETAILS</h4></button>
	<div class="panel">
		<form action="VendorController" method="post">
			<center>
				<table>

					<tr>

						<td><b>FIRST NAME<span style="color:red"><sup>*</sup></span>:</b></td>
						<td><input type="text" name="FirstName" placeholder="First Name" required></td>


						<td><b>LAST NAME<span style="color:red"><sup>*</sup></span>:</b></td>
						<td><input type="text" name="LastName" placeholder="Last Name" required></td>

					</tr>

					<tr>
						<td><b>USERNAME:</b></td>
						<td><input type="text" name="UserName" placeholder="User Name" required></td>



						<td><b>EMAIL ID<span style="color:red"><sup>*</sup></span>:</b></td>
						<td><input type="text" name="EmailId" placeholder="Email Id" required></td>

					</tr>

					<tr>
						<td><b>PASSWORD<span style="color:red"><sup>*</sup></span>:</b></td>
						<td><input type="password" id="psw" name="password" placeholder="Password"
							pattern="(?=.*\d)(?=.*[a-z])(?=.*[A-Z]).{8,}"
							title="Must contain at least one number and one uppercase and lowercase letter, and at least 8 or more characters"
							required></td>


						<td><b>MOBILE NUMBER<span style="color:red"><sup>*</sup></span>:</b></td>
						<td><input type="text" name="MobileNumber" placeholder="Mobile Number" required></td>
						<br>
					</tr>
					<tr>
						<td><b>TIN<span style="color:red"><sup>*</sup></span>:</b></td>
						<td><input type="text" name="Tin"placeholder="TIN" required></td>
					</tr>
				</table>
				
						<button type="submit" value="AddVendor" name="action" >Save</button>
						<button type="reset" value="reset" name="reset" >Reset</button>
						
			</center>
			<br>
			<div id="message">
				<h3>Password must contain the following:</h3>
				<p id="letter" class="invalid">
					A <b>lowercase</b> letter
				</p>
				<p id="capital" class="invalid">
					A <b>capital (uppercase)</b> letter
				</p>
				<p id="number" class="invalid">
					A <b>number</b>
				</p>
				<p id="length" class="invalid">
					Minimum <b>8 characters</b>
				</p>
			</div>
		</form>


	</div>

	<button class="accordion"><h4>SHOP DETAILS</h4></button>
	<div class="panel">
		<form action="VendorController" method="post">

			<center>
				<table>
				<br>
				<br>
					<tr>
					<td><b>USERNAME:</b></td>
						<td><input type="text" name="UserName" placeholder="User Name" required></td>
					
						<td><b>SHOP NAME<span style="color:red"><sup>*</sup></span>:</b></td>
						<td><input type="text" name="Name" placeholder="Name" required></td>
						<td><b>PLOT NO<span style="color:red"><sup>*</sup></span>:</b></td>
						<td><input type="text" name="FlatNo/DoorNo" placeholder="FlatNo/DoorNo" required></td>
						</tr>
						<tr>
						<td><b>AREA/STREET:</b></td>
						<td><input type="text" name="Area/Street"placeholder="Area/Street"></td>
						<td><b>LANDMARK:</b></td>
						<td><input type="text" name="Landmark"placeholder="Landmark"></td>

					</tr>
					<tr>
						<td><b>CITY<span style="color:red"><sup>*</sup></span>:</b></td>
						<td><input type="text" name="City"placeholder="City" required></td>
						<td><b>STATE<span style="color:red"><sup>*</sup></span></td>
						<td><input type="text" name="State" placeholder="State" required></td>
					</tr>
					<tr>
					<td><b>PIN CODE<span style="color:red"><sup>*</sup></span></td>
						<td><input type="text" name="Pincode" placeholder="Pincode" required></td>
						<td><b>TELEPHONE NUMBER<span style="color:red"><sup>*</sup></span></td>
						<td><input type="text" name="TelephoneNumber" placeholder="Telephone Number" required></td>
					</tr>
				</table>
				<button type="submit" value="AddShop" name="action" >Save</button>
				<button type="reset" value="reset" name="reset" >Reset</button>
				<br>
				<br>
			</center>

		</form>
	</div>
		<script>
		var acc = document.getElementsByClassName("accordion");
		var i;

		for (i = 0; i < acc.length; i++) {
			acc[i].addEventListener("click", function() {
				this.classList.toggle("active");
				var panel = this.nextElementSibling;
				if (panel.style.display === "block") {
					panel.style.display = "none";
				} else {
					panel.style.display = "block";
				}
			});
		}
	</script>



	<script>
		var myInput = document.getElementById("psw");
		var letter = document.getElementById("letter");
		var capital = document.getElementById("capital");
		var number = document.getElementById("number");
		var length = document.getElementById("length");

		// When the user clicks on the password field, show the message box
		myInput.onfocus = function() {
			document.getElementById("message").style.display = "block";
		}

		// When the user clicks outside of the password field, hide the message box
		myInput.onblur = function() {
			document.getElementById("message").style.display = "none";
		}

		// When the user starts to type something inside the password field
		myInput.onkeyup = function() {
			// Validate lowercase letters
			var lowerCaseLetters = /[a-z]/g;
			if (myInput.value.match(lowerCaseLetters)) {
				letter.classList.remove("invalid");
				letter.classList.add("valid");
			} else {
				letter.classList.remove("valid");
				letter.classList.add("invalid");
			}

			// Validate capital letters
			var upperCaseLetters = /[A-Z]/g;
			if (myInput.value.match(upperCaseLetters)) {
				capital.classList.remove("invalid");
				capital.classList.add("valid");
			} else {
				capital.classList.remove("valid");
				capital.classList.add("invalid");
			}

			// Validate numbers
			var numbers = /[0-9]/g;
			if (myInput.value.match(numbers)) {
				number.classList.remove("invalid");
				number.classList.add("valid");
			} else {
				number.classList.remove("valid");
				number.classList.add("invalid");
			}

			// Validate length
			if (myInput.value.length >= 8) {
				length.classList.remove("invalid");
				length.classList.add("valid");
			} else {
				length.classList.remove("valid");
				length.classList.add("invalid");
			}
		}
	</script>

</body>

<style>
/* Style all input fields */
input {
	width: 100%;
	padding: 12px;
	border: 1px solid #ccc;
	border-radius: 4px;
	box-sizing: border-box;
	margin-top: 6px;
	margin-bottom: 16px;
}

/* Style the submit button */
input[type=submit] {
	background-color: #4CAF50;
	color: white;
}

/* Style the container for inputs */
.container {
	background-color: #f1f1f1;
	padding: 20px;
}

/* The message box is shown when the user clicks on the password field */
#message {
	display: none;
	background: #f1f1f1;
	color: #000;
	position: relative;
	padding: 20px;
	margin-top: 10px;
}

#message p {
	padding: 10px 35px;
	font-size: 18px;
}

/* Add a green text color and a checkmark when the requirements are right */
.valid {
	color: green;
}

.valid:before {
	position: relative;
	left: -35px;
	content: "?";
}

/* Add a red text color and an "x" when the requirements are wrong */
.invalid {
	color: red;
}

.invalid:before {
	position: relative;
	left: -35px;
	content: "?";
}
</style>
<style>
body {
	background-image:
		url("https://i.pinimg.com/originals/35/3a/28/353a28ff196e08ca47b727a9d62c3677.jpg" );
	background-color: #cccccc;
	background-repeat: no-repeat;
	background-size: 1400px 750px;
}
</style>
</html>