<%@page contentType="text/html" language="java" pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>CheckBbox Exemple</title>
</head>
<body>
	<h2>User Information</h2>
	<form:form method="post" action="/RadioButtonExemple/addUser">
	<table>
	    <tr>
	    	<td><form:label path="username">User Name:</form:label></td>
	    	<td><form:input path="username"/></td>
	    </tr>
	    <tr>
	    	<td><form:label path="password">PassWord:</form:label></td>
	    	<td><form:password path="password"/></td>
	    </tr>
	    <tr>
	    	<td><form:label path="address">Address:</form:label></td>
	    	<td><form:textarea path="address" rows="5" cols="30"/></td>
	    </tr>
	    <tr>
	    	<td><form:label path="receivePaper">Receive Paper:</form:label></td>
	    	<td><form:checkbox path="receivePaper" value="Sim"/></td>
	    </tr>
	    <tr>
	    	<td><form:label path="favoriteFramework">Favorite Framework:</form:label></td>
	    	<td><form:checkboxes items="${webFrameworkList}" path="favoriteFramework"/></td>
	    </tr>
	    <tr>
	    	<td><form:label path="gender">Gender:</form:label></td>
	    	<td>
	    	<form:radiobutton path="gender" value="M" label="Male"/>
	    	<form:radiobutton path="gender" value="F" label="Female"/>
	    	</td>
	    </tr>
	    <tr>
	    	<td colspan="2"><input type="submit" value="Submit"/></td>
	    </tr>
	</table>
	
	</form:form>
</body>
</html>