<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
<title>Insert title here</title>
<link rel="stylesheet" href ="style.css">
 
<script type="text/javascript">
function usersingin()
{
	alert("doing Sales singin");
	document.myform.action="salessingin";
	document.myform.submit();
	
	}
function orderid()
{
	alert("doing singup");
	document.myform.action="customerid";
	document.myform.submit();
	
	}

</script>
<style>


</style>



</head>



<body>
<form name="myform" >





<center>
<h2>Wel-Come To XYZ Grocery Shop</h2>
<input type="button" class="btn btn-primary "value="ProductDetails" onclick="usersingin()">
<input type="button" class="btn btn-primary "value="OrderDetail" onclick="orderid()">


</center>

</form>
</body>
</html>