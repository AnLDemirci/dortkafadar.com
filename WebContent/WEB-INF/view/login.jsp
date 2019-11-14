<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
<title>Login</title>
</head>
<body>
<link href="resources/css/login-style.css" rel="stylesheet" />
<div class="container">
        <div class="login-form">
            <h1>LOGIN</h1>
            <form name='f' action="/login" method='POST'>
                <input type="text" name='userName' id="" placeholder="Username">
                <input type="password" name='userPassword' id="" placeholder="Password">
                <input type="submit" value="Login">
                <!-- <a href="#">Register</a> -->
<!--                 <a href="#">Forget Password</a> -->
            </form>
        </div>
    </div>
  
</body>
</html>