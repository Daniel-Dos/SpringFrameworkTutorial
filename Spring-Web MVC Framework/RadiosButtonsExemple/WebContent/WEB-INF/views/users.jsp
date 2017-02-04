<%@page contentType="text/html" language="java" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>CheckBox Exemple</title>
</head>
<body>
		<h2>Submited User informantion</h2>
		<table>
			<tr>
				<td>UserName</td>
				<td>${username}</td>
			</tr>
			<tr>
				<td>PassWord</td>
				<td>${password}</td>
			</tr>
			<tr>
				<td>Address</td>
				<td>${address}</td>
			</tr>
			<tr>
				<td>Subscribed to NewsLetter</td>
				<td>${receivePaper != "Sim" ? "Sim" : "Não"}</td>
			</tr>
			<tr>
				<td>Favorite Frameworks</td>
				<c:forEach items="${favoriteFrameworks}" var="framework">
				<td>${framework}</td>
				</c:forEach>
			</tr>
			<tr>
				<td>Gender</td>
				<td>${(gender == "M" ? "Male" : "Female")}</td>
			</tr>
			<tr>
				<td>Number Favorite</td>
				<td>${favoriteNumber}</td>
			</tr>
		</table>
</body>
</html>