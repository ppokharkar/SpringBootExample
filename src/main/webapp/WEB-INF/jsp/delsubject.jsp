<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registration</title>
</head>
<body>
	<form:form id="regForm" modelAttribute="subject" action="deleteSubjectBySubTitle" method="post">

		<table align="center">
			<tr>
				<td><form:label path="subjectId">SubjectId</form:label></td>
				<td><form:input path="subjectId" name="subjectId" id="subjectId" /></td>
			</tr>
			<%-- <tr>
				<td><form:label path="publishDate">PublishDate</form:label></td>
				<td><fmt:formatDate value="${blah.bla}" pattern="dd/MM/yyyy" var="myDate" />
					<form:input path="publishDate" id="publishDate" value="${myDate}" />
				
				</td>
			</tr> --%>

			<tr>
				<td></td>
				<td><form:button id="delete" name="delete">Delete</form:button></td>
			</tr>
			<tr></tr>
		</table>
	</form:form>

</body>
</html>