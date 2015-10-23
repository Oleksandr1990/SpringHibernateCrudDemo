<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ include file="/WEB-INF/jsp/includes.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Management</title>
</head>
<body>
<h1>Manager month salary</h1>
<form:form action="manager.do" method="POST" commandName="manager">
	<table>
		<tr>
			<td>Manager ID</td>
			<td><form:input path="managerId" /></td>
		</tr>
		<tr>
			<td>First name</td>
			<td><form:input path="firstName" /></td>
		</tr>
		<tr>
			<td>Last name</td>
			<td><form:input path="lastName" /></td>
		</tr>
		<tr>
			<td>Year Level</td>
			<td><form:input path="monthSalary" /></td>
		</tr>
		<tr>
			<td colspan="2">
				<input type="submit" name="action" value="Add" />
				<input type="submit" name="action" value="Edit" />
				<input type="submit" name="action" value="Delete" />
				<input type="submit" name="action" value="Search" />
			</td>
		</tr>
	</table>
</form:form>
<br>
<table border="1">
	<th>ID</th>
	<th>First name</th>
	<th>Last name</th>
	<th>Month Salary</th>
	<c:forEach items="${managerList}" var="manager">
		<tr>
			<td>${manager.managerId}</td>
			<td>${manager.firstName}</td>
			<td>${manager.lastName}</td>
			<td>${manager.monthSalary}</td>
		</tr>
	</c:forEach>
</table>
</body>
</html>
