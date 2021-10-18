<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>

<title>Success Page</title>
<script type="text/javascript">

function update()
{
	alert("Going for Update")
	document.operation.action="edit";
	document.operation.submit();
}
function delete1()
{
	alert("Are you Sure for Delete")
	document.operation.action="delete";
	document.operation.submit();
}
</script>



</head>
<body bgcolor="silver">
<form name="operation">
<center>
<h1><font color="red">Login Successfully</font></h1> 
<table border="1" >
<tr>
<th>User name</th>
<th>Password</th>
<th>Name</th>
<th>Address</th>
<th>Mobile No</th>
<th>Gender</th>
<th>Department</th>
<th>Designation</th>
<th>Salary</th>
<th>Email</th>
</tr>


<c:forEach items="${data }" var="emp">
<tr>
 <td><input type="radio" name="username"  value="${emp.username}">
  
   
   <c:out value="${emp.username}"></c:out></td>
    <td><c:out value="${emp.password}"></c:out></td>
    <td><c:out value="${emp.name}"></c:out> </td>
    <td><c:out value="${emp.addr}"></c:out></td>
    <td><c:out value="${emp.mobno}"></c:out></td>
    <td><c:out value="${emp.gender}"></c:out> </td>
    <td><c:out value="${emp.dept}"></c:out> </td>
    <td><c:out value="${emp.desig}"></c:out></td>
    <td><c:out value="${emp.salary}"></c:out></td>
    <td><c:out value="${emp.email}"></c:out> </td>
    
</tr>
</c:forEach>
</table>
<input type="button" value="Update" onclick="update()">
<input type="button" value="Delete" onclick="delete1()">
</form>
<a href="login.html">Home Page</a>
</body>
</html>