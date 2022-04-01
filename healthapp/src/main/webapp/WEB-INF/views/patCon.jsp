<%@page import="com.techno.dto.Patients"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <% 
      String msg=(String) request.getAttribute("msg");
    Patients pat=(Patients)request.getAttribute("pat");
    
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Confirmation</title>
</head>
<body>
<%=msg %><br>
<h6>Below are the details you enetered</h6>
<%=pat.getAadharNumber() %><br>
<%=pat.getFirstName() %><br>
<%=pat.getLastName() %><br>
<%=pat.getContactNumber() %><br>
<%=pat.getPassword() %><br>

<h5>Thanks for visiting</h5><br>
<form action="./logout" method="post">
Logout<input type="submit" name="logout">
</form>



</body>
</html>


