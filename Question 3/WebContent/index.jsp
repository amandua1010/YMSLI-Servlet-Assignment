<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Email checker</title>
</head>
<body>

	<form method="post" action="./EmailController">
	
		<input type="radio" id="gmail" name="email" value="gmail">
		<label for="gmail">gMail</label> <br> 
		
		<input type="radio" id="rediff" name="email" value="rediff"> 
		<label for="rediff">Rediff Mail</label> <br> 
		
		<input type="radio" id="yahoo" name="email" value="yahoo"> 
		<label for="yahoo">Yahoo Mail</label> <br> 
		
		<input type="radio" id="hotmail" name="email" value="hotmail"> 
		<label for="hotmail">Hot Mail</label> <br>
		
		<input type="radio" id="unknown" name="email" value="unknown">
		<label for="unknown">Unknown</label> <br> <br>
		
		<input type="submit" value="Submit"/>
			
	</form>

</body>
</html>