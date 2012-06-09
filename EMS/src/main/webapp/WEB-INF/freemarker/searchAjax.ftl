<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<#import "/spring.ftl" as spring>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Search Employee</title>
<script type="text/javascript" src="http://ajax.googleapis.com/ajax/libs/jquery/1/jquery.min.js"/>
<script type="text/javascript">
	   $("#empId").change(function() {
	     alert("dasd");
	     $.post("searchAjax.do", {rating: $(this).text()}, function(xml) {
	       // format and output result
	       $("#ajaxResults").html(xml);
	     });
	   });
</script>
</head>
<body>
	<form action="search.do">
		Name (min 3 characters): <input type="text" name="name" size="20" id="empId"/> <input
			type="submit" value="Search" />
		<div id="ajaxResults"></div>
	</form>
</body>
</html>