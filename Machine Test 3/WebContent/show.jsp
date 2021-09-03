<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%> 	

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Trainee Mgt App</title>
</head>
<body>

	<table>
		
		<thead>
			<tr>
				<th>Trainee Id</th>
				<th>Trainee Name</th>
				<th>Branch</th>
				<th>Percentage</th>
			</tr>
		</thead>
		
		<tbody>
		
			<c:forEach items="${trainees}" var="trainee">
				<tr>
					<td>${trainee.trainee_Id}</td>
					<td>${trainee.trainee_Name}</td>
					<td>${trainee.branch}</td>
					<td>${trainee.percentage}</td>
				</tr>
			</c:forEach>
			
		</tbody>
		
	</table>

	<br/>
	<a href="index.jsp">Want to Add a new Trainee ?</a>

</body>
</html>