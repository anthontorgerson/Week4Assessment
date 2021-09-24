<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Result</title>
</head>
<body>
	<p>You are currently 
	${userAgeCalc.getAge()} year old! <br/>
		Ages based on future calculations: <br /> 
		In 100 years you will be 
		${userAgeCalc.getAgeIn100Years() }  years old!<br /> 
		In 25 years you will be 
		${userAgeCalc.getAgeIn25Years()} years old! <br />
		In 10 years you will be 
		${userAgeCalc.getAgeIn10Years()} years old! <br />
		In 5 years you will be 
		 ${userAgeCalc.getAgeIn5Years() } years old!<br /> 
		 Next year you will be 
		 ${userAgeCalc.getAgeIn1Year() } years old!<br />
	</p>
	<a href="index.jsp">Enter another age!</a>
</body>
</html>