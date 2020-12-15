<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>   
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Dojo Survey</title>
</head>
<body>
	<h1>Submitted Info</h1>
	<c:out value=""/>
	<p>Name : <c:out value="${name}"/></p>
	<br>
	<p>Dojo Location : <c:out value="${dojo}"/></p>
	<br>
	<p>Fav Langauge : <c:out value="${language}"/></p>
	<br>
	<p>Comment : <c:out value="${comment}"/></p>
	<a href ="/">Home</a>
</body>
</html>