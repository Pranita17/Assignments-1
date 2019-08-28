<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Employee Details</title>
</head>
<body>
<h2>Employee Details</h2>
<br>
<form action="DisplayEmployeeServlet" method="post">
<table>
	<tr>
		<td>Id</td>
		<td><% out.print(request.getAttribute("EmployeeID").toString()); %></td>
	</tr>
	<tr>
		<td>Name</td>
		<td colspan="0"><input type = "text" name = "employee-name" value = "<% out.print(request.getAttribute("EmployeeName")); %>"></td>
	</tr>
	<tr>
		<td>Gender</td>
		<td><label for="gender"><input type = "radio" name = "gender" value="Male" <% if(request.getAttribute("EmployeeGender").equals("Male")) out.print("checked");%>>Male</label></td>
		<td><label for="gender"><input type = "radio" name = "gender" value="Female" <% if(request.getAttribute("EmployeeGender").equals("Female")) out.print("checked");%>>Female</label></td>
	</tr>
	<tr>
		<td>Date of Birth</td>
		<td><input type = "text" name = "dob" value='<fmt:formatDate pattern = "dd/MM/yyyy" value="${EmployeeDOB}"/>'></td>
	</tr>
	<tr>
		<td>Fulltime Employee</td>
		<td><input type = "checkbox" name = "fulltimeEmployee"  <% if(request.getAttribute("EmployeeFTE").toString().equals("true")) out.print("checked"); %> ></td>
	</tr>
	<tr>
		<td>Department</td>
		<td colspan="0"><select name="department">
			<c:forEach items="${EmployeeDepartment}" var="dept">
				<option value='${dept}'>${dept}</option>
			</c:forEach>
			</select>
		</td>
	</tr>
	<tr>
		<td>Salary</td>
		<td><input type = "text" name = "salary" value='<% out.print(request.getAttribute("EmployeeSalary")); %>'></td>
	</tr>
</table>
<input type = "submit" value="submit">
</form>
</body>
</html>