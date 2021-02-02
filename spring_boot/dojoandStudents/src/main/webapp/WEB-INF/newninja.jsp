<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%> 
<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>New Ninja</title>
</head>
<body>
	<h1>New Ninja</h1>
	<form:form method = "POST" action = "/ninjas/new" modelAttributes = "dojo">
		<p>
			<form:label path="firstName">First Name :</form:label>
			<form:input path="firstName"/>
		</p>
		<p>
			<form:label path="lastName">Last Name :</form:label>
			<form:input path="lastName"/>
		</p>
		<p>
			<form:label path="age">Age : </form:label>
		</p>
	</form:form>
</body>
</html>