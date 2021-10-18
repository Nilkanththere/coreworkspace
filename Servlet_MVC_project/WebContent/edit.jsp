
<%@page import="com.wcs.webapp.model.Employee"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Edit Page</title>
</head>
<body bgcolor="silver">
	<h1>
		<font color="red">Update Information</font>
	</h1>
	<form action="update">
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
				<%
					Employee emp = (Employee) request.getAttribute("data");
				%>
				<td><input type="hidden" name="username"
					value=<%=emp.getUsername()%>></td>
				<td><input type="password" name="password"
					value=<%=emp.getPassword()%>></td>
				<td><input type="text" name="name" value=<%=emp.getName()%>></td>
				<td><input type="text" name="addr" value=<%=emp.getAddr()%>></td>
				<td><input type="text" name="mobno" value=<%=emp.getMobno()%>></td>
				<td><input type="text" name="gender"
					value=<%=emp.getGender()%>></td>
				<td><input type="text" name="dept" value=<%=emp.getDept()%>></td>
				<td><input type="text" name="desig" value=<%=emp.getDesig()%>></td>
				<td><input type="text" name="salary"
					value=<%=emp.getSalary()%>></td>
				<td><input type="text" name="email" value=<%=emp.getEmail()%>></td>

			</tr>

			<tr>
				<td><input type="submit" value="Update"></td>
			</tr>

		</table>
	</form>



</body>
</html>