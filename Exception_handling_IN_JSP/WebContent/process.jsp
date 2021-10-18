<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page errorPage="error.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Process Page</title>
</head>
<body>
<%String s=request.getParameter("t1");
String s1=request.getParameter("t2");

int x=Integer.parseInt(s);

int y=Integer.parseInt(s1);%>

<%
float f=x/y;
   
    out.println("value is::"+f);
    
    %>
</body>
</html>