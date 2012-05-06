<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<#import "/spring.ftl" as spring>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Update Employee</title>
</head>
<body>
	<form action="update.do">
	<table border="0">
		<tr>
			<th>First Name</th>
			<td><@spring.bind command.firstName/> <input type="text" name="${spring.status.expresssion}" value="${spring.status.value}" />
			</td>
		</tr>
		<tr>
			<th>Last Name</th>
			<td><@spring.bind command.lastName/> <input name="${spring.status.expresssion}" value="${spring.status.value}" />
			</td>
		</tr>
		<tr>
			<th>Email</th>
			<td><@spring.bind command.email/> <input name="${spring.status.expresssion}" value="${spring.status.value}" />
			</td>
		</tr>
		<tr>
			<th>Phone Number</th>
			<td><@spring.bind command.phoneNumber/> <input name="${spring.status.expresssion}" value="${spring.status.value}" />
			</td>
		</tr>
		<tr>
			<th>Hire Date</th>
			<td><@spring.bind command.hireDate/> <input name="${spring.status.expresssion}" value="${spring.status.value}" />
			</td>
		</tr>
		<tr>
			<th>Job</th>
			<td><@spring.bind command.job.jobId/> <input name="${spring.status.expresssion}" value="${spring.status.value}" />
			</td>
		</tr>
		<tr>
			<th>Salary</th>
			<td><@spring.bind command.salary/> <input name="${spring.status.expresssion}" value="${spring.status.value}" />
			</td>
		</tr>
		<tr>
			<th>Commission Pct</th>
			<td><@spring.bind command.commissionPct/> <input name="${spring.status.expresssion}" value="${spring.status.value}" />
			</td>
		</tr>
		<tr>
			<th>Manager</th>
			<td><@spring.bind command.manager.empId/> <input name="${spring.status.expresssion}" value="${spring.status.value}" />
			</td>
		</tr>
		<tr>
			<th>Department</th>
			<td><@spring.bind command.department.departmentId/> <input name="${spring.status.expresssion}" value="${spring.status.value}" />
			</td>
		</tr>
	</table>
	</form>
</body>
</html>