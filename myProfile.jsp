<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Update</title>
	</head>
	<body>
			
		<html:form action="/myProfile" method ="post">
        User Name :<html:text property="username"  /></br>
        E-Mail ID :<html:text property="email_id" /><br>
        Password  :<html:password property="password"  /><br>
        <html:submit value="Update" />  
    </html:form>	
	</body>
</html>