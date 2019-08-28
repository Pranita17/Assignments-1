<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Employee Details</title>
<style>
td,th
{
	text-align : left;
    padding:0 15px 0 15px;
}
table 
{
	border-collapse:separate;
	border-spacing:0 15px; 
	
}
</style>
</head>
<body>
<h1>Employee Details Verification</h1>
<table>
<tr>
	<th>Id</th>
	<th>Name</th>
	<th>Gender</th>
</tr>
<tr>
	<td><% out.print(request.getAttribute("EmployeeID")); %></td>
	<td><% out.print(request.getAttribute("EmployeeName")); %></td>
	<td><% out.print(request.getAttribute("EmployeeGender")); %></td>
</tr>
<tr>
	<th>Date of Birth</th>
	<th>Fulltime Employee</th>
	<th>Department</th>
</tr>
<tr>
	<td><fmt:formatDate pattern = "d/M/yyyy" value="${EmployeeDOB}"/></td>
	<td><% if(request.getAttribute("EmployeeFTE").toString().equals("true")) out.print("Yes"); else { out.print("No");} %></td>
	<td><c:forEach items="${EmployeeDepartment}" var="dept">${dept}</c:forEach></td>
</tr>
<tr>
	<th>Salary</th>
</tr>
<tr>
	<fmt:setLocale value = "en_IN"/>
	<td><fmt:formatNumber type="currency" value="${EmployeeSalary}"/></td>
</tr>
</table>
</body>
</html>