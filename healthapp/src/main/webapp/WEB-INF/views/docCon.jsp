<%@page import="com.techno.dto.Doctors"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%
     String msg=(String) request.getAttribute("msg");
         Doctors doc= (Doctors) request.getAttribute("doc");
    
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Confirmation</title>
</head>
<body>
<form action="./logout" method="post">
<h3><%=msg %></h3><br>
<%=doc.getId() %><br>
<%=doc.getFirstName() %><br>
<%=doc.getLastName() %><br>
<%=doc.getSpecialistIn() %><br>
<%=doc.getContactNumber() %><br>
<%=doc.getPassword() %><br>
<h5>Thanks for visisting</h5><br>
Logout<input type="submit" name="logout">
</form>

</body>
</html>