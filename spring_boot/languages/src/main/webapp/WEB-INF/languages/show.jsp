<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title> <c:out value="${language.name}"/></title>
</head>
<body>
	<a href = "/languages">Dashboard</a>
	<h1><c:out value="${language.name }"/></h1>
	<p><c:out value="${language.creator}"/></p>
	<p><c:out value="${language.currentVersion}"/></p>
	<a href="/laguages/${language.id}/edit">Edit</a>
	<form action="/languages/${language.id}" method="post">
	    <input type="hidden" name="_method" value="delete">
	    <input type="submit" value="Delete">
	</form>
</body>
</html>