<%@page import="com.servlet.model.Student"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Success Page</title>
</head>
<body bgcolor="silver">
	<table border="1">
		<tr>
			<th>User name:</th>
			<th>Password:</th>
			<th>Name:</th>
			<th>Address:</th>
			<th>Phone No:</th>
			<th>Email:</th>
		</tr>
		<tr>
			<%
				List<Student> l = (List) request.getAttribute("data");

				for (Student stu : l) {
			%>
			<td><%=stu.getUsername()%></td>
			<td><%=stu.getPassword()%></td>
			<td><%=stu.getName()%></td>
			<td><%=stu.getAddr()%></td>
			<td><%=stu.getPhno()%></td>
			<td><%=stu.getEmail()%></td>
		</tr>
		<%
			}
		%>


	</table>




</body>
</html>