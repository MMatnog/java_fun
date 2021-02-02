<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%> 
<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Hello World</title>
</head>
<body>
	<h1>All Dojos</h1>
	<table>
		<thead>
			<tr>
				<th>Dojo</th>
				<th>Number of Students</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${dojos}" var = "dojo">
				<tr>
					<td><a href = "/dojos/${dojo.getId()}"><c:out value="${dojo.getName()}" /></a></td>
					<td><c:out value = "${dojo.getNinjas().size()}"/></td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</body>
</html>