<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://www.springframework.org/tags/form" prefix="spring"%>
<!DOCTYPE html >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h3 align="center">${requestScope.msg}</h3>
`  	
	<table style="margin: auto">
		<spring:form modelAttribute="vehicle" method="post">	
			<tr>
				<td>Enter VehicleName</td>
				<td><spring:input path="vehiclename" /></td>
				<td><spring:errors path="vehiclename" /></td>
			</tr>
			<tr>
				<td>Enter Model</td>
				<td><spring:input path="model" /></td>
				<td><spring:errors path="model" /></td>
			</tr>
			<tr>
				<td>Enter Vehicle Version</td>
				<td><spring:input path="version" /></td>
				<td><spring:errors path="version" /></td>
			</tr>
			<tr>
				<td>Enter Company Name</td>
				<td><spring:input path="company" /></td>
				<td><spring:errors path="company" /></td>
			</tr>
			<tr>
				<tr>
				<td>Enter YearOfManufacturing</td>
				<td><spring:input path="yearOfManufacturing" /></td>
				<td><spring:errors path="yearOfManufacturing" /></td>
			</tr>
			
			
			<tr>
				<td><input type="submit" value="submit" /></td>
			</tr>
		</spring:form>
	</table>
</body>
</html>