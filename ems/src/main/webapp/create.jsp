<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Create Employee</title>
<style type="text/css">
body {
	background-size: cover;
	background-color: #ffc9b9;
}

h1 {
	color: #182000;
}

a, form {
	padding: 10px;
	margin-left: 25px;
	margin-right: 25px;
}

form {
	background-color: #000;
	padding: 10px;
	border-radius: 20px;
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

	<h1>Create Employee...</h1>

	<form action="save">
		<input type="text" name="name" placeholder="Enter Name" required><br><br>
		<input type="email" name="email" placeholder="Enter Email" required><br><br>
		<input type="tel" name="phone" placeholder="Enter Phone" required><br><br>
		<input type="text" name="department" placeholder="Enter Department" required><br><br>
		<input type="text" name="position" placeholder="Enter Position" required><br><br>
		<input type="number" name="salary" placeholder="Enter Salary" required><br><br>
		<input type="text" name="address" placeholder="Enter Address" required><br><br>
		<input type="text" name="dateOfJoining" placeholder="Enter Date of Joining" required><br><br>
		<button type="submit">Save</button>
	</form>

</body>
</html>
