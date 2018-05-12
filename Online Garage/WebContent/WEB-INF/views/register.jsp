<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="spring"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3 align="center">${requestScope.msg}</h3>
	<table style="margin: auto">
		<spring:form modelAttribute="member" method="post">
			
	
			<tr>
				<td>Enter FirstName</td>
				<td><spring:input path="firstName" /></td>
				<td><spring:errors path="firstName" /></td>
			</tr>
			<tr>
				<td>Enter LastName</td>
				<td><spring:input path="lastName" /></td>
				<td><spring:errors path="lastName" /></td>
			</tr>
			<tr>
				<td>Enter Email</td>
				<td><spring:input path="email" /></td>
				<td><spring:errors path="email" /></td>
			</tr>
			<tr>
				<td>Enter password</td>
				<td><spring:password path="password" /></td>
				<td><spring:errors path="password" /></td>
			</tr>
			<tr>
				<tr>
				<td>Enter PhoneNumber</td>
				<td><spring:input path="phone" /></td>
				<td><spring:errors path="phone" /></td>
			</tr>
			
			<tr>
				<tr>
				<td>Enter AlterPhoneNumber</td>
				<td><spring:input path="alterphone" /></td>
				<td><spring:errors path="alterphone" /></td>
			</tr>
			
			<tr>
				<td>Enter MemberType</td>
				<td><spring:radiobutton path="memberShipType" value="yearly"/>Yearly</td>
				<td><spring:radiobutton path="memberShipType" value="HalfYearly"/>HalfYearly</td>
			</tr>
			<h2>Enter User Address details</h2>
			<tr>
			
			<td>Enter User HouseNumber</td>
			<td><spring:input path="addressInfo.housenumber"/></td>
			<td><spring:errors path="addressInfo.housenumber"/></td>
			</tr>
			<tr>
			<td>Enter User city</td>
			<td><spring:input path="addressInfo.city"/></td>
			<td><spring:errors path="addressInfo.city"/></td>
			</tr>
			<tr>
			<td>Enter User country</td>
			<td><spring:input path="addressInfo.country"/></td>
			<td><spring:errors path="addressInfo.country"/></td>
			</tr>
			<tr>
			<td>Enter User state</td>
			<td><spring:input path="addressInfo.state"/></td>
			<td><spring:errors path="addressInfo.state"/></td>
			</tr>
			<tr>
			<td>Enter User Streetname</td>
			<td><spring:input path="addressInfo.streetname"/></td>
			<td><spring:errors path="addressInfo.streetname"/></td>
			</tr>
			<tr>
			<td>Enter User Zipcode</td>
			<td><spring:input path="addressInfo.zipcode"/></td>
			<td><spring:errors path="addressInfo.zipcode"/></td>
			</tr> 
			<tr>
				<td><input type="submit" value="submit" /></td>
			</tr>
		</spring:form>
	</table>
</body>
</html>