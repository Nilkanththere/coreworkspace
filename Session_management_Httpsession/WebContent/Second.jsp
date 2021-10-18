<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Second Page</title>
</head>
<body>
<form action="second">
<table>
<tr>

<td>First Data:-<%=request.getParameter("t1") %></td>
</tr>



<tr>
<td>Second Data:-<input type="text" name="t2"></td>
</tr>
<tr>
<td><input type="submit" value="ok"></td>
</tr>
</table>
</form>
</body>
</html>