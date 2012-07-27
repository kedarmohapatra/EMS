<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<#import "/spring.ftl" as spring>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Search Employee</title>
</head>
<body>
	<form action="search.do" method="post">
		Name (min 3 characters): <input type="text" name="name" size="20" /> <input
			type="submit" value="Search" />
	</form>
</body>
</html>