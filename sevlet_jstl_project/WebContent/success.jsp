<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Success page</title>
</head>
<body>
<h1>Success page</h1>

<c:forEach items="${data}" var="stu">
<table border="1">

<tr><th>Roll no:</th><td><c:out value="${stu.rollno}"></c:out></td>
<th>Name:</th><td><c:out value="${stu.name}"></c:out></td>
<th>Address:</th><td><c:out value="${stu.addr}"></c:out></td></tr>

</table>
<br>
</c:forEach>

</body>
</html>