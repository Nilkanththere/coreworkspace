<%@page import="com.mvc.model.Bank"%>

<%@page import="java.util.List"%>
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
<title>Success Page</title>

</head>
<script type="text/javascript">
function deleteRecord()
{
	alert("are you sure");
	document.myform.action="delt";
	document.myform.submit();
	
	}
function updateRecord()
{
	alert("Update record");
	document.myform.action="edit";
	document.myform.submit();
	
	}
	
function addRecord()
{
	alert("Add Record");
	document.myform.action="register.jsp";
	document.myform.submit();
	
	}

</script>
<center>
<body bgcolor="silver">
<form name="myform">
<table border="1" class="table table-dark">
<tr>
<th>Sr No</th>
<th>IFSCCODe</th>
<th>Name</th>
<th>MobileNo</th>
<th>Email</th>
<th>AddressId</th>
<th>AreaName</th>
<th>CityName</th>
<th>PincodeNo</th>

</tr>

<%List<Bank>slist=(List)request.getAttribute("data");
for(Bank s:slist)
   { %>
<tr>
<td><input type="radio" name="rollno" value="<%=s.getIfsc() %>"></td>
<td><%=s.getIfsc() %></td>
<td><%=s.getName() %></td>
<td><%=s.getAddr() %></td>
<td><%=s.getCstr()%></td>

</tr>

	
    <%} %>
</table>

<div class="btn-group">
 
<input type="button" class="btn btn-primary" value="Delete" onclick="deleteRecord()">
<input type="button" class="btn btn-primary" value="update" onclick="updateRecord()">
<input type="button" class="btn btn-primary" value="Add" onclick="addRecord()">
</div>
</form>
</body>
</html>