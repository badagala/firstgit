<%@page import="com.techno.dto.Patients"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%
    ArrayList<Patients> pat= (ArrayList<Patients>) request.getAttribute("pat");

    
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>PatientList</title>
</head>
<h3>Below are the Patients Waiting list</h3><br>

<body>
<form action="./conapp">
<%
  for(Patients pats:pat){
	
	
	  out.println(pats.getAadharNumber());
	  out.println(pats.getFirstName());
	  out.println(pats.getLastName());
	  out.println(pats.getContactNumber());
	  out.println("Confirm Appointment<input type="+"submit"+" "+ "name="+"submit>");
		 out.println("<br>");
  }

%>

</form>
</body>

</html>