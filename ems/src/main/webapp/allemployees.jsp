<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>All Employees</title>
<style type="text/css">
body {
	background-size: cover;
	background-color: #ffc9b9;
}

h1 {
	color: #182000;
}

table {
	width: 100%;
	border-collapse: collapse;
}

table, th, td {
	border: 1px solid #283618;
}

th, td {
	padding: 10px;
	text-align: center;
}

button {
	background-color: #FEFAE0;
	padding: 10px;
	border: #283618 2px solid;
	border-radius: 20px;
	cursor: pointer;
}

a {
	padding: 10px;
}

.center {
	text-align: center;
}

form {
	background-color: #000;
	padding: 10px;
	border-radius: 20px;
}
</style>
</head>
<body>

	<center>
		<a href="createpage"> <button>Create Employee</button> </a>
		<a href="allemployees"> <button>View All Employees</button> </a>
		<a href="search.jsp"> <button>Search Employee</button> </a>
	</center>

	<h1>All Employees</h1>

	<table>
		<tr>
			<th>ID</th>
			<th>Name</th>
			<th>Email</th>
			<th>Phone</th>
			<th>Department</th>
			<th>Position</th>
			<th>Salary</th>
			<th>Address</th>
			<th>Date of Joining</th>
			<th>Action</th>
		</tr>

		<c:forEach var="e" items="${employees}">
			<tr>
				<td>${e.id}</td>
				<td>${e.name}</td>
				<td>${e.email}</td>
				<td>${e.phone}</td>
				<td>${e.department}</td>
				<td>${e.position}</td>
				<td>${e.salary}</td>
				<td>${e.address}</td>
				<td>${e.dateOfJoining}</td>
				<td><a href="updatepage?id=${e.id}"><button>Update</button></a> 
				    <a href="delete?id=${e.id}"><button>Delete</button></a></td>
			</tr>
		</c:forEach>
	</table>

</body>
</html>
