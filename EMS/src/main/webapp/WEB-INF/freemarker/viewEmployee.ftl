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
			<td>${employee.empId}</td>
		</tr>
		<tr>
			<th>First Name</th>
			<td>${employee.firstName}</td>
		</tr>
		<tr>
			<th>Last Name</th>
			<td>${employee.lastName}</td>
		</tr>
		<tr>
			<th>Email</th>
			<td>${employee.email}@gmail.com</td>
		</tr>
		<tr>
			<th>Phone Number</th>
			<td>${employee.phoneNumber}</td>
		</tr>
		<tr>
			<th>Hire Date</th>
			<td>${employee.hireDate?string.full}</td>
		</tr>
		<tr>
			<th>Job id</th>
			<td>${employee.job.jobTitle}</td>
		</tr>
		<tr>
			<th>Salary</th>
			<td>${employee.salary}</td>
		</tr>
		<tr>
			<th>Commission Pct</th>
			<td>${employee.commissionPct!"0.0"}</td>
		</tr>
		<tr>
			<th>Department</th>
			<td><a href="/EMS/department/${employee.department.departmentId}.do">${employee.department.departmentId}</td>
		</tr>
		<tr>
			<th>Manager</th>
			<td><a href="${employee.manager.empId}.do">${employee.manager.firstName} ${employee.manager.lastName}</td>
		</tr>
	</table>
</body>
</html>