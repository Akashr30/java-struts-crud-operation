<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Register</title>
	</head>
	<body>
	<html:form action="/SignUp">
        User Name :<html:text property="username"  /></br>
        E-Mail ID :<html:text property="email_id" /><br>
        Password  :<html:password property="password"  /><br>
        <html:submit value="Register" />  
    </html:form>
	<!-- <p> HELLOOOOO !!!!</p> -->
	</body>	
</html>


<%-- <%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="/struts-html" prefix="html" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Signup page</title>
</head>
<body bgcolor="#54FDC5">
<br></br>
<body>
<html:html>
    
	<html:form action="/register" method="get">

		<strong>Enter your First Name:</strong>
		<html:text property="firstName" size="50" /><br><br>
		<div style="color:red">
    		<html:errors property="firstName"/>
    	</div>
    	
		<font>Enter your Last Name:</font>
		<html:text property="lastName" size="50" /><br><br>
		<div style="color:red">
    		<html:errors property="lastName"/>
    	</div>
    	
		Enter your username:
		<html:text property="userName" size="50" /><br><br>
		<div style="color:red">
    		<html:errors property="userName"/>
    	</div>
    	
		Enter your password:
		<html:text property="password" size="30" /><br><br>
		<div style="color:red">
    		<html:errors property="password"/>
    	</div>
    	
		Enter your Email:
		<html:text property="email" size="30" /><br><br>
		<div style="color:red">
    		<html:errors property="email"/>
    	</div>
    	
		Enter your Phone No:
		<html:text property="phone" size="15" /><br><br>
		<div style="color:red">
    		<html:errors property="phone"/>
    	</div>
    	
		<html:submit>Submit</html:submit>
		<br><br>
	</html:form>
</html:html>
</body>
</html> --%>