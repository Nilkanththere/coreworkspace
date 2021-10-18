<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login Page</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</head>
<center>
<body>
<h4>Login here....!!</h4>
<h2><font color="red"><%String s=(String)request.getAttribute("msg"); %> </font></h2>
<%if(s!=null) 
    out.println(s);%>

<form action="log">
<table  class="table table-bordered">
<tr><td>UserName</td>
<td><input type ="text" name="uname"></td>
</tr>



<tr><td>password</td>
<td><input type ="password" name="pass"></td>
</tr>

</table>


<center>
<button type ="submit" class="btn btn-primary " >login </button>
<a href="main.jsp">Home page</a>
</center>

</form>


</body>
</html>