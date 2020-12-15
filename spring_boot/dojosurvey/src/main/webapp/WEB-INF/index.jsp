<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>    

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>The Form</title>
</head>
<body>
	<h1>Dojo Form</h1>
	<form action = "/submit" method = "POST">
		<br>
		Name : <input type = "text" name = "name"/>
		<br>
		Dojo Location : <select name = "dojo">
			<option value = "Burbank">Burbank</option>
			<option value = "San Jose">San Jose</option>
			<option value = "Seattle">Seattle</option>
		</select>
		<br>
		Fav Language : <select name ="language">
			<option value = "Python">Python</option>
			<option value = "Javascript">Javascript</option>
			<option value = "Java">Java</option>
		</select>
		<br>
		Comment :
		<br>
		<textarea name = "comment"></textarea>
		<br>
		<input type="submit" value="Submit"/>
	</form>
</body>
</html>