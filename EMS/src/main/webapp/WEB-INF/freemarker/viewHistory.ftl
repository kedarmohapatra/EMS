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
			<th>Start Date</th>
			<th>End Date</th>
			<th>Past Jobs</th>
		</tr>
		<#list history as employeeHistory>
		<tr>
			<td>${employeeHistory.jobHistoryId.employeeId!""}</td>
			<td>${employeeHistory.jobHistoryId.startDate?string.short!""}</td>
			<td>${employeeHistory.endDate?string.short!""}</td>
			<td>${employeeHistory.job.jobTitle!""}</td>
		</tr>
		</#list>
	</table>
</body>
</html>