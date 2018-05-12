<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://www.springframework.org/tags/form" prefix="spring"%>
<!DOCTYPE html >
<html>
<head>
<script async defer src="https://maps.googleapis.com/maps/api/js?key=AIzaSyBDbaCjQT4nlYTaN6s_yCV6zhhVrMaLbV8&callback=initMap">
</script>
<script type="text/javascript" src="https://ajax.googleapis.com/ajax/libs/jquery/1.7.2/jquery.min.js"></script>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h3 align="center">${requestScope.msg}</h3>
	<table style="margin: auto">
		<spring:form modelAttribute="transaction" method="post">
		<tr>
				<td>Enter BillId</td>
				<td>"${requestScope.BillId}"/></td>
			</tr> 
			<tr>
				<td>Choose Services </td>
				<tr><td><spring:checkbox path="mechanical_fault"/>MECHANICAL_FAULT</td></tr>
				<tr><td><spring:checkbox path="battery_jump_start" />BATTERY_JUMP_START</td></tr>
				<tr><td><spring:checkbox path="flat_tyre"/>FLAT_TYRES</td></tr>
				<tr><td><spring:checkbox path="key_lock"/>KEY_LOCKER</td></tr>
				<tr><td><spring:checkbox path="towing"/>TOWING</td></tr>
				<tr><td><spring:checkbox path="fuel"/>FUEL</td></tr>
				<tr><td><spring:checkbox path="vehicle_service"/>FUEL</td></tr>
			
			<tr>
				<td>Enter lat</td>
			<td><spring:hidden path="lat"/></td>
			<td><spring:errors path="lat"/></td>
			</tr> 
			<tr>
			<td>Enter Lng </td>
			<td><spring:hidden path="lng"/></td>
			<td><spring:errors path="lng"/></td>
			</tr>
			<tr>
				<td><input type="submit" value="submit" /></td>
			</tr>
			</spring:form>
			
			</table>
			<div id="divMap" style='height:600px;width:600px;'>
 			Select Location
			</div>
</body>
<script type="text/javascript" src="/Cdac_project/JavaScript/location.js">
</script>
</html>
