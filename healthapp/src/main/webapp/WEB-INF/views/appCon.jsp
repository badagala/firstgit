<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%
       String msg=(String) request.getAttribute("msg");
    
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>AppointmentConfirmation</title>
</head>
<body>
<%=msg %>

<h3>Thank you visiting</h3><br>
<form action="./homePage">
logout<input type="submit" name="submit">
</form>

</body>
</html>