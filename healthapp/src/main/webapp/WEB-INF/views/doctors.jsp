<%@page import="org.hibernate.internal.build.AllowSysOut"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.techno.dto.Doctors"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <% 
    ArrayList<Doctors> doc= (ArrayList<Doctors>) request.getAttribute("doc");
    
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Doctors</title>
</head>
<body>

<h3>Below are the Doctors available</h3><br>
<form action="./appcon">
<%

  for(Doctors docs:doc){
	
	out.println(docs.getId());
	out.println( docs.getFirstName());
	 out.println(docs.getLastName());
	out.println(docs.getSpecialistIn());
	 out.println(docs.getContactNumber());
	 out.println("Book<input type="+"submit"+" "+ "name="+"submit>");
	 out.println("<br>");
	 
  
  }

%>

</form>


</body>
</html>