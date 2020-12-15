<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Counter</title>
</head>
<body>
	<h2>You have visited localhost:8080 <c:out value="${count}"/> times!</h2>
	<a href="/">Go Home</a>
	<a href="/clear">Clear Count</a>
</body>
</html>