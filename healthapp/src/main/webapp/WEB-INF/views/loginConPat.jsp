<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%  
      String msg=(String) request.getAttribute("msg");
    
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h3><%=msg %></h3><br>
<form action="./listDoctors">
Book Appointment:<input type="submit" name="book"><br>
</form>
<form action="./updatepatform">
Update Profile:<input type="submit" name="update"><br>
</form>
<form action="./logout" method="post">
Logout:<input type="submit" name="logout"><br>
</form>

</body>
</html>