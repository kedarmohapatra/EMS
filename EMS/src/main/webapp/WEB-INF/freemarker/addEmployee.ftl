<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<#import "/spring.ftl" as spring>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Update Employee</title>
</head>
<body>
	<form action="addSuccess.do">
	<table border="0">
		<tr>
			<th>First Name</th>
			<td><input name="firstName" type="text"/>
			</td>
		</tr>
		<tr>
			<th>Last Name</th>
			<td><input name="lastName" type="text"/>
			</td>
		</tr>
		<tr>
			<th>Email</th>
			<td><input name="email" type="text"/>
			</td>
		</tr>
		<tr>
			<th>Phone Number</th>
			<td><input name="phoneNumber" type="text"/>
			</td>
		</tr>
		<tr>
			<th>Hire Date</th>
			<td><input name="hireDate" type="text"/>
			</td>
		</tr>
		<tr>
			<th>Job</th>
			<td>
			<select name="job">
				<#list jobs as job>
					<option name="${job.jobId}" value="${job.jobId}" >${job.jobTitle}</option>
				</#list>
			</select>
			</td>
		</tr>
		<tr>
			<th>Salary</th>
			<td><input name="salary" type="text"/>
			</td>
		</tr>
		<tr>
			<th>Commission Pct</th>
			<td><input name="commissionPct" type="text"/>
			</td>
		</tr>
		<tr>
			<th>Manager</th>
			<td>
				<select name="manager">
					<#list managers as manager>
						<option name="${manager.empId}" value="${manager.empId}">${manager.firstName} ${manager.lastName}</option>
					</#list>
				</select>
			</td>
		</tr>
		<tr>
			<th>Department</th>
			<td>
				<select name="department">
					<#list departments as department>
						<option name="${department.departmentId}" value="${department.departmentId}">${department.departmentName}</option>
					</#list>
				</select>
			</td>
		</tr>
		<tr><input type="submit" name="submit"></tr>
	</table>
	</form>
</body>
</html>