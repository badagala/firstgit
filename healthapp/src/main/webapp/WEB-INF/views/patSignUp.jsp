<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>signup</title>
</head>
<body> 
<form action="./patSign" method="post">
<h3>Please fill the below details</h3><br>
Enter the AadharNumber:<input type="text" name="aadharNumber"><br>
Enter the FirstName:<input type="text" name="firstName"><br>
Enter the LastName:<input type="text" name="lastName"><br>
Enter the Contact Number:<input type="text" name="contactNumber"><br>
Enter the Password:<input type="text" name="password"><br>
<input type="submit" name="signup">
</form>

</body>
</html>