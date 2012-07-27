<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<#import "/spring.ftl" as spring>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Update Employee</title>
</head>
<body>
	<form action="" method="post">
	<@spring.formHiddenInput "command.empId"/>
	<table border="0">
		<tr>
			<th>First Name</th>
			<td><@spring.formInput "command.firstName"/>
			</td>
		</tr>
		<tr>
			<th>Last Name</th>
			<td><@spring.formInput "command.lastName"/>
			</td>
		</tr>
		<tr>
			<th>Email</th>
			<td><@spring.formInput "command.email"/>
			</td>
		</tr>
		<tr>
			<th>Phone Number</th>
			<td><@spring.formInput "command.phoneNumber"/>
			</td>
		</tr>
		<tr>
			<th>Hire Date</th>
			<td><@spring.formInput "command.hireDate"/>
			</td>
		</tr>
		<tr>
			<th>Job</th>
			<td><@spring.formInput "command.job.jobId"/>
			</td>
		</tr>
		<tr>
			<th>Salary</th>
			<td><@spring.formInput "command.salary"/>
			</td>
		</tr>
		<tr>
			<th>Commission Pct</th>
			<td><@spring.formInput "command.commissionPct"/>
			</td>
		</tr>
		<tr>
			<th>Manager</th>
			<td><@spring.formInput "command.manager.empId"/>
			</td>
		</tr>
		<tr>
			<th>Department</th>
			<td><@spring.formInput "command.department.departmentId"/>
			</td>
		</tr>
	</table>
	<input type="submit" value="update" />
	</form>
</body>
</html>