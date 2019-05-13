<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registration</title>
</head>
<body>
	<form:form id="regForm" modelAttribute="subject" action="returnSubjectByDuration" method="post">

		<table align="center">
			<tr>
				<td><form:label path="durationInHours">durationInHours</form:label></td>
				<td><form:input path="durationInHours" name="durationInHours" id="durationInHours" /></td>
			</tr>
			<%-- <tr>
				<td><form:label path="publishDate">PublishDate</form:label></td>
				<td><fmt:formatDate value="${blah.bla}" pattern="dd/MM/yyyy" var="myDate" />
					<form:input path="publishDate" id="publishDate" value="${myDate}" />
				
				</td>
			</tr> --%>

			<tr>
				<td></td>
				<td><form:button id="search" name="search">Search</form:button></td>
			</tr>
			<tr></tr>
			<tr>
				<td></td>
				<td><a href="home.jsp">Home</a></td>
			</tr>
		</table>
	</form:form>

</body>
</html>