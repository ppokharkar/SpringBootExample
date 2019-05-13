<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registration</title>
</head>
<body>
	<form:form id="regForm" modelAttribute="subject" action="addSubject" method="post">

		<table align="center">
			<tr>
				<td><form:label path="subjectId">SubjectId</form:label></td>
				<td><form:input path="subjectId" name="subjectId" id="subjectId" /></td>
			</tr>
			<tr>
				<td><form:label path="subtitle">Sub Title</form:label></td>
				<td><form:input path="subtitle" name="subtitle" id="title" /></td>
			</tr>
			<tr>
				<td><form:label path="durationInHours">DurationInHours</form:label></td>
				<td><form:input path="durationInHours" name="durationInHours" id="durationInHours" /></td>
			</tr>
			<tr>
				<td></td>
				<td><form:button id="add" name="add">Add</form:button></td>
			</tr>
			<tr></tr>
		</table>
	</form:form>

</body>
</html>