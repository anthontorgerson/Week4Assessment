<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Week 4 Assessment - Java II</title>
</head>
<body>
	<h1>Calculate Future Age</h1>
	<form action="getNewAgeServlet" method="post">
		How old are you now?: <input type="text" name="userAge" size="10">
		<input type="submit" value="Calculate Age" />
	</form>
</body>
</html>