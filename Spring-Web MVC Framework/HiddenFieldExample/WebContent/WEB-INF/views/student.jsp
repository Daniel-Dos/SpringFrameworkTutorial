<%@page contentType="text/html" language="java" pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Hidden Exemple</title>
</head>
<body>
		<h2>Student Information</h2>
		<form:form method="post" action="/HiddenFieldExample/addStudent">
			<table>
					<tr>
						<td><form:label path="name">Name:</form:label></td>
						<td><form:input path="name"/></td>
					</tr>
					<tr>
						<td><form:label path="age">Age:</form:label></td>
						<td><form:input path="age"/></td>
					</tr>
					<tr>
						<td></td>
						<td><form:hidden path="id" value="1"/></td>
					</tr>
					<tr>
						<td colspan="2"><input type="submit" value="Submit"/></td>
					</tr>
			</table>
		</form:form>
</body>
</html>