<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<style type="text/css">


body{

 
   background-image: url("C:/Users/india/Desktop/image16.jpg");
   
   background-size:cover;
}




</style>


<title >Login Page....!</title>
</head>
<center>
<body>
<form action="log">
<div class="login-box">
  <h1><font color="red">Login</font></h1>
  
  <div class="textbox">
    <i class="fas fa-user"></i>
    <input type="text" placeholder="name" name="name">
  </div>

  <div class="textbox">
    <i class="fas fa-lock"></i>
    <input type="password" placeholder="mobileno" name="mobno">
  </div>

  <input type="submit" class="btn" value="Sign in">
</div>


<a href="register.jsp">click for newUser</a>


</form>
</body>
</html>