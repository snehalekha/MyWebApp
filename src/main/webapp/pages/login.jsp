<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
</head>
<body>
	<form name="login" action="/login" method="get" accept-charset="utf-8">  
    <ul>
    	<li><label for="id">Id</label>  
        <input type="text" name="id" placeholder="Id" required></li>    
        <li><label for="usermail">Email</label>  
        <input type="email" name="username" placeholder="yourname@email.com" required></li>  
        <li><label for="password">Password</label>  
        <input type="password" name="password" placeholder="password" required></li>  
        <li>  
        <input type="submit" value="Login"></li>  
    </ul>  
	</form> 
</body>
</html>