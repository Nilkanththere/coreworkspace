<%@page import="com.mvc.model.Student"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
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
	document.myform.action="register";
	document.myform.submit();
	
	}

</script>
<center>
<body bgcolor="silver">
<form name="myform">
<table border="1">
<tr>

<th>ID</th>
<th>UserName</th>
<th>Password</th>
<th>Name</th>
<th>Address</th>
<th>MobileNo</th>
<th>Email</th>
</tr>

<%List<Student>slist=(List)request.getAttribute("data");
for(Student s:slist)
   { %>
<tr>
<td><input type="radio" name="id" value="<%=s.getId() %>"></td>
<td><%=s.getUname() %></td>
<td><%=s.getPass() %></td>
<td><%=s.getName() %></td>
<td><%=s.getAddr() %></td>
<td><%=s.getMobno() %></td>
<td><%=s.getEmail()%></td>
</tr>

	
    <%} %>
</table>
<input type="button" value="Delete" onclick="deleteRecord()">
<input type="button" value="update" onclick="updateRecord()">
<input type="button" value="Add" onclick="addRecord()">

</form>
</body>
</html>