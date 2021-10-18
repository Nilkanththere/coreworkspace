<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Third page</title>
</head>
<body>
<form action="third">

First Data:-<%=request.getParameter("fd") %>
<br>
Second Data:-<%=request.getParameter("t2") %>
<br>

Third Data:-<input type="text" name="t3">
<br>

<input type="submit" value="Ok">

</form>
</body>
</html>