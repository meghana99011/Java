<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Search Employee</title>
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

	<h1>Search Employee</h1>

	<form action="search" method="get">
		<input type="text" name="sq" placeholder="Type here to search by Name or Department">
		<button type="submit">Search</button>
	</form>

</body>
</html>
