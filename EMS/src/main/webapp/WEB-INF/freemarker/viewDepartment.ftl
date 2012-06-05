<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<#import "/spring.ftl" as spring>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Search Employee</title>
</head>
<body>
	<table border="0">
		<tr>
			<th>Id</th>
			<td>${department.departmentId}</td>
		</tr>
		<tr>
			<th>Department Name</th>
			<td>${department.departmentName}</td>
		</tr>
		<tr>
			<th>Manager</th>
			<td><a href="/EMS/employee/${department.manager.empId}.do">${department.manager.firstName} ${department.manager.lastName}</a></td>
		</tr>
		<tr>
			<th>Location</th>
			<td>${department.location.streetAddress}<br>${department.location.postalCode}<br>${department.location.city}<br>${department.location.stateProvince}<br>${department.location.country.countryName}</td>
		</tr>
		<tr>
			<th>Total Employees</th>
			<td>${totalEmployees}</td>
		</tr>
	</table>
</body>
