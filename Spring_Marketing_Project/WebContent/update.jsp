<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Update Page</title>
</head>
<body bgcolor="silver">
<form action="update">
<input type="hidden" name="id" value=${s.id}>
<table border="1">
<tr>
<td>UserName</td>
<td><input type="text" name="uname" value=${s.uname}></td>
</tr>
<tr>
<td>Password</td>
<td><input type="password" name="pass" value=${s.pass}></td>
</tr>
<tr>
<td>Name</td>
<td><input type="text" name="name" value=${s.name}></td>
</tr>

<tr>
<td>Address</td>
<td><input type="text" name="addr" value=${s.addr}></td>
</tr>

<tr>
<td>MobileNo</td>
<td><input type="text" name="mobno" value=${s.mobno}></td>
</tr>

<tr>
<td>Email</td>
<td><input type="text" name="email" value=${s.email}></td>
</tr>

<tr>

<td><input type="submit"  value="update"></td>
</tr>

</table>








</form>
</body>
</html>