<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%
     String message=(String) request.getAttribute("msg");
    
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Confirmation</title>
</head>
<body>
<h3>Updated sucessfully</h3>
<form action="./logout" method="post">
<%=message %><br>
logout<input type="submit" name="submit">
</form>

</body>
</html>