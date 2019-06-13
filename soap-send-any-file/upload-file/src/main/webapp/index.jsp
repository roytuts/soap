<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Upload and Send File using SOAP Webservice - Servlet
	Example</title>
</head>
<body>
	<div style="width: 600px;">
		<c:if test="${!empty error}">
			<p style="color: red;">
				<c:out value="${error}" />
			</p>
		</c:if>
		<c:if test="${!empty success}">
			<p style="color: green;">
				<c:out value="${success}" />
			</p>
		</c:if>
		<form method="post" action="Upload" enctype="multipart/form-data">
			<fieldset>
				<legend>Upload File</legend>
				<p>
					<label>Select File</label><br /> <input type="file" name="file"
						id="file" />
				</p>
				<p>
					<input type="submit" name="uploadFile" value="Upload File" />
				</p>
			</fieldset>
		</form>
	</div>
</body>
</html>