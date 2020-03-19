<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="../users/new" method="post">
		<table>
			<tr>
				<td>Username:</td>
				<td><input type="text" id="username" name="username" /></td>
			</tr>
			<tr>
				<td>Password:</td>
				<td><input type="password" id="password" name="password" /></td>
			</tr>
			<tr>
				<td>Name:</td>
				<td><input type="text" id="name" name="name" /></td>
			</tr>
			<tr>
				<td>Surname:</td>
				<td><input type="text" id="surname" name="surname" /></td>
			</tr>
			<tr>
				<td><input type="submit" id="add" name="add" value="Add user" /></td>
			</tr>

			<tr>
				<td><c:out value="${requestScope.errorMessage}"></c:out></td>
				<td><c:out value="${requestScope.validationError}"></c:out></td>
			</tr>

		</table>
	</form>

</body>
</html>