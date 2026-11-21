<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Update Employee</title>
<style type="text/css">
body {
	background-size: cover;
	background-color: #ffc9b9;
}

h1 {
	color: #182000;
}

input, button {
	padding: 10px;
	border-radius: 20px;
}

button {
	background-color: #FEFAE0;
	border: #283618 2px solid;
	cursor: pointer;
}
</style>
</head>
<body>

	<center>
		<a href="createpage"> <button>Create Employee</button> </a>
		<a href="allemployees"> <button>View All Employees</button> </a>
		<a href="search.jsp"> <button>Search Employee</button> </a>
	</center>

	<h1>Update Employee</h1>

	<form action="update" method="get">
		<input type="text" name="id" value="${e.id}" readonly><br><br>
		<input type="text" name="name" value="${e.name}" required><br><br>
		<input type="email" name="email" value="${e.email}" required><br><br>
		<input type="tel" name="phone" value="${e.phone}" required><br><br>
		<input type="text" name="department" value="${e.department}" required><br><br>
		<input type="text" name="position" value="${e.position}" required><br><br>
		<input type="number" name="salary" value="${e.salary}" required><br><br>
		<input type="text" name="address" value="${e.address}" required><br><br>
		<input type="text" name="dateOfJoining" value="${e.dateOfJoining}" required><br><br>
		<button type="submit">Update</button>
	</form>

</body>
</html>
