<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
  <style type="text/css">
  body{
  background-image: url("C:/Users/india/Desktop/image1.jpg");
  background-size: cover;
  
  }
  
  </style>
  
</head>
<center>
<body bgcolor="silver">
<h4><font color="red">Product Register here...!</font></h4>
<form action="reg">
<table border="1">

<tr>
<td>ProductId:-</td>
<td><input type="text"  name="id"></td>
</tr>

<tr>
<td>ProductName:-</td>
<td><input type="text"  name="name"></td>
</tr>

<tr>
<td>BatchNumber-</td>
<td><input type="text" name="bname"></td>
</tr>

<tr>
<td>Manufacturing Date:-</td>
<td><input type="date" name="mfd"></td>
</tr>

<tr>
<td>ExpiryDate:-</td>
<td><input type="date" name="expd"></td>
</tr>

<tr>
<td>BatchId:-</td>
<td><input type="text" name="batchid"></td>
</tr>

<tr>
<td>ProductType:-</td>
<td><input type="text" name="ptype"></td>
</tr>

<tr>

<td><input  type="submit" class="btn btn-primary "value="Register"></td>

</tr>

</table>
</form>


</body>
</html>