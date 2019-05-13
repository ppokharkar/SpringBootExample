<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registration</title>
</head>
<body>
	<form:form id="regForm" modelAttribute="book" action="addBook" method="post">

		<table align="center">
			<tr>
				<td><form:label path="bookId">BookId</form:label></td>
				<td><form:input path="bookId" name="bookId" id="bookId" /></td>
			</tr>
			<tr>
				<td><form:label path="title">Title</form:label></td>
				<td><form:input path="title" name="title" id="title" /></td>
			</tr>
			<tr>
				<td><form:label path="price">Price</form:label></td>
				<td><form:input path="price" name="price" id="price" /></td>
			</tr>
			<tr>
				<td><form:label path="volume">volume</form:label></td>
				<td><form:input path="volume" name="volume" id="volume" /></td>
			</tr>
			<tr>
				<td><form:label path="publishDate">PublishDate</form:label></td>
					<td><form:input path="publishDate" name="publishDate" id="publishDate" /></td>
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