<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <% String username =(String) request.getAttribute("name");
     String usernumber =(String) request.getAttribute("mobileno");
     String userarea=(String) request.getAttribute("area");  
    
    
    %>
   
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
You entered name:
<%= username%><br>
You entered mobileno:
<%=usernumber %><br>
You entered area:
<%=userarea %><br>
</body>
</html>