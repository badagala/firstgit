<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update</title>
</head>
<h3>Update Profile</h3>
<body>
<h1>Please fill the details to update</h1>
<form action="./updateDoc" method="post">
Enter the id:<input type="text" name="id"><br>
Update the FirstName:<input type="text" name="firstName"><br>
Update the LastName:<input type="text" name="lastName"><br>
Update the SpecialistIn:<input type="text" name="specialistIn"><br>
Update the Contact Details:<input type="text" name="contactNumber"><br>
Update the Password:<input type="text" name="password"><br>
<input type="submit" name="submit">


</form>
</body>
</html>