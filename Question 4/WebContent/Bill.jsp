<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Bill</title>
</head>
<body>

	<%
		Integer flowerQuantity = (Integer) request.getSession().getAttribute("flowerQuantity");
		
		Integer cardQuantity = (Integer) request.getSession().getAttribute("cardQuantity");
		
		out.println("Quantity of Flowers: " + flowerQuantity);
		out.println();
		out.println("Quantity of Cards: " + cardQuantity);
	%>

</body>
</html>