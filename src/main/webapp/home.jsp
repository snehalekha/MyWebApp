<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome</title>
</head>
<body>
	<form action="/calculate" method="get">
		Number 1:<br>
		<input type="text" name="a"/><br>
		Number 2:<br>
		<input type="text" name="b"/><br>
		<input type="submit" name="Submit" value="Add"/>
		<input type="submit" name="Submit" value="Subtract"/>
		<input type="submit" name="Submit" value="Multiply"/>
	</form>
</body>
</html>