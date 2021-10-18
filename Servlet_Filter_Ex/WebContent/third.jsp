
<html>
<head>

<title>Third Page</title>
</head>
<body>
<form action="third.do">
<%---- 
<input type="hidden" name="t1" value="<%=request.getParameter("t1") %>">

<input type="hidden" name="t2" value="<%=request.getParameter("t2") %>">

--%>

First Data:<%=session.getAttribute("fd") %><br>

Second Data:<%=request.getParameter("t2") %><br>

Third Data:<input type="text" name="t3"><br>

<input type="submit" value="OK">

</form>
</body>
</html>