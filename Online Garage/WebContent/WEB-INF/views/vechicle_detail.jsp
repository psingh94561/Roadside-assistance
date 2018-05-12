<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h3 align="center">On Details page</h3> 
Your Vehicle Registration number is ${requestScope.vehicle_reg}
<h3>Vehicle details is${sessionScope.addVehicleSession}</h3> 
<h3>Click <a href="index.jsp">here </a>to go to Profile page </h3>
</body>
</html>