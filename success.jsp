<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Successful Login Page</title>
	</head>
	<body>
		<%-- <html:form action="/login" > --%>
		<div>
			 CLICK HERE<html:submit value="LogOut" onclick = "logOut()" /> 
			<a href="myProfile.jsp">Profile</a>&nbsp;
			<a href="deleteProfile.jsp">De-Activate the Account</a>
		</div>
		<hr/>	
		
	<center><h1>Welcome <strong><%=session.getAttribute("userName") %></strong></h1></center><br>
	<%--  </html:form> --%>
	</body>
	
	<script>
	function logOut(){
	
		
	}
	</script>
</html>