<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta http-equiv="refresh" content="5;url=${pageContext.request.contextPath }">
<title>Insert title here</title>
</head>
<body>
<h3>Hello MemberId :${sessionScope.memberLogin.getMemberId()} you have successfully loggedOut</h3>
<h4 align="center">Redirecting to home page in 5 seconds...</h4>
</body>
</html>