<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Successfully Signed Up</title>
</head>
<body>
	<h2>Account created !!</h2>
	<button onclick="goToLogIn()">GO TO LOGIN PAGE</button>
</body>

	<script>
		function goToLogIn(){
		 var url = "http://localhost:8080/LoginUsingStruts/login.jsp";
		 window.location = url;
		}
	</script>
</html>