<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<script type="text/javascript">
function usersingin()
{
	alert("doing singin");
	document.myform.action="singin";
	document.myform.submit();
	
	}
function usersingup()
{
	alert("doing singup");
	document.myform.action="singup";
	document.myform.submit();
	
	}
	


</script>
</head>
<body>
<form name="myform" >


<center>
<h2>Wel-Come To XYZ LTD</h2>
<input type="button" value="singin" onclick="usersingin()">
<input type="button" value="singup" onclick="usersingup()">

</center>

</form>
</body>
</html>