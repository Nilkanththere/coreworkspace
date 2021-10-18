<%@page import="com.wcs.webapp.model.Employee"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Update Page</title>
</head>
<body bgcolor="silver">
<table border="1">
<tr>
<th>User name:</th>
<th>Password:</th>
<th>Name:</th>
<th>Address:</th>
<th>Mobile NO:</th>
<td>Gender:</td>
<td>Department</td>
<td>Designation:</td>
<td>Salary:</td>
<th>Email:</th>
</tr>

<tr>
<%Employee emp=(Employee)request.getAttribute("data"); %>
   <td><%=emp.getUsername() %></td>
   <td><%=emp.getPassword() %></td>
   <td><%=emp.getName() %></td>
   <td><%=emp.getAddr() %></td>
   <td><%=emp.getMobno() %></td>
   <td><%=emp.getGender() %></td>
   <td><%=emp.getDept() %></td>
   <td><%=emp.getDesig() %></td>
   <td><%=emp.getSalary() %></td>
   <td><%=emp.getEmail()%></td>
</tr>

</table>
<center><a href="login.html">Home Page</a></center>

</body>
</html>