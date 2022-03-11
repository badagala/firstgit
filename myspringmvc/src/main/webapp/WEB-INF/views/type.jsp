<%@page import="com.te.dtolayer.Users"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
   <%
  
  Users access = (Users)request.getAttribute("getting");
   
        
   
   
   
   %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Fetching Data</title>
</head>
<body>
<h1>below are the details which u have requested</h1>
<%= access%>

</body>
</html>