<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
	<title>LoginPage</title>
	</head>
	<body>
		<html:form action="/Login" method="post" >
        User Name :<html:text  property="username" /></br>
        Password  :<html:password  property="password" /><br>
        <html:submit value="Login" />
        <INPUT Type="BUTTON" Value="SignUp" Onclick="signUp()">
    </html:form>
    <script>
    	function signUp(){
    		var url = "http://localhost:8080/LoginUsingStruts/signUp.jsp";
    		window.location = url;
    	}
    </script>
	</body>
</html> 
