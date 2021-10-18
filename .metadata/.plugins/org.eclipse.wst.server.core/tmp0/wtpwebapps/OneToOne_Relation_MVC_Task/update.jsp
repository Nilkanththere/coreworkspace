<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Update Page</title>
</head>
<center>
<body bgcolor="silver">
<form action="update">
<input type="hidden" name="rollno" value=${s.rollno}>
<table border="1">


<tr>
<td>Name</td>
<td><input type="text" name="name" value=${s.name}></td>
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
<td>AddressId</td>
<td><input type="text" name="addr.aid" value=${s.addr.aid}></td>
</tr>

<tr>
<td>AreaName</td>
<td><input type="text" name="addr.areaname" value=${s.addr.areaname}></td>
</tr>


<tr>
<td>CityName</td>
<td><input type="text" name="addr.cityname" value=${s.addr.cityname}></td>
</tr>

<tr>
<td>PinCode</td>
<td><input type="text" name="addr.pincode" value=${s.addr.pincode}></td>
</tr>

<tr>

<td><input type="submit"  value="update"></td>
</tr>

</table>

</form>
</body>
</html>