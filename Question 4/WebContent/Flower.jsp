<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Flower Page</title>
</head>
<body>
	
	<h3>Flowers Page</h3>
	
	<p>Input Flower Quantity: </p>
	
	<form action="./FlowerPgController" method="POST">
		<input type="number" name="flowerQuantity" value="0"/> 
		<input type="submit" value="Submit" />
	</form>
	
</body>
</html>