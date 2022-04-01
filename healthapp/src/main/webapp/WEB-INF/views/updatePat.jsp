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

<form action="./logout" method="post">
<h3><%=message %></h3><br>
logout<input type="submit" name="submit">
</form>

</body>
</html>