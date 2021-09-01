<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Card Page</title>
</head>
<body>
	
	<h2>Cards Page</h2>
	
	<p>Input Card Quantity: </p>
	
	<form action="./CardPgController" method="POST">
		<input type="number" name="cardQuantity" value="0"/> 
		<input type="submit" value="Submit" />
	</form>
	
</body>
</html>