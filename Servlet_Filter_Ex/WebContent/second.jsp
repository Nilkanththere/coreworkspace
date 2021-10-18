
<html>
<head>

<title>Second page</title>
</head>
<body>
<form action="second.do">
First Data:<%=request.getParameter("t1") %>
<%----
<input type=""hidden: name="t1" value="<%=request.getParameter("t1") %>"> --%><br>



Second Data:<input type="text" name="t2"><br>


<input type="submit" value="Ok">
</form>
</body>
</html>