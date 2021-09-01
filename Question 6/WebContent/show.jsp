<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>    
<!DOCTYPE html>

<html>
<head>
<meta charset="ISO-8859-1">
<title>Main App</title>
</head>
<body>
	
	<table>
		<thead>
			<tr>
				<th>Student Id</th>
				<th>Student Name</th>
				<th>Stream</th>
				<th>Percentage</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${students}" var="student">
				<tr>
					<td>${student.stud_Id}</td>
					<td>${student.stud_Name}</td>
					<td>${student.stream}</td>
					<td>${student.percentage}</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
	
	<br/>
	<a href="index.jsp">Add a new Student</a>
	
</body>
</html>