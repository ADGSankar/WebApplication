<%--<%@page import="java.util.Date"--%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Yahooo from jsp</title>
</head>
<%--
<%
System.out.println("sankar");
System.out.println(request.getParameter("name"));
Date date =new Date();
%>
 --%>
<body>
<form action="/login.do" method="post">
UserName : <input type="text" name="name"/>
Password : <input type="password" name="password"/>
<input type="submit" value="Login"/>
</form>
<p><font color="red">${errorMsg}</font></p>
<%-- 
<p><b>Welcome to JSP</b></p>
<p><b>Username : ${pname}</b></p>
<p><b>Password : ${password}</b></p>
 --%>
<%--<p>current date : <%=date %></p> --%>
<%--
this is for the scriptles which is write above.this is not a good practise --%>
<p><b>current date : ${date}</b></p>
</body>
</html>