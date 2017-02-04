<%@page contentType="text/html" language="java" pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>File Upload Example</title>
</head>
<body>
		<form:form method="post" modelAttribute="fileUpload" enctype="multipart/form-data">
		Please select a file to upload:
		<input type="file" name="file"/>
		<input type="submit" value="upload"/>
		</form:form>
</body>
</html>