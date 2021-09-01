<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Index Page</title>
</head>
<body>
	
	<form action="addStudent" method="post">
	
		Input Student Id : <input type="text" name="stud_Id"/> <br/>
		Input Student Name : <input type="text" name="stud_Name"/> <br/>
		Input Student stream : <input type="text" name="stream"/> <br/>
		Input Student percentage : <input type="text" name="percentage"/> <br/> <br/>
		
		<input type="submit" value="Submit" />
		
	</form>
	
</body>
</html>