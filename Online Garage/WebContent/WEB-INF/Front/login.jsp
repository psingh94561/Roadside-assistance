<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib uri="http://www.springframework.org/tags/form" prefix="spring" %>
<!DOCTYPE html>
<html lang="en">
<head>
	<title>Login</title>
	<meta charset="utf-8"> 
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<link rel="stylesheet" href="bootstrap-3.3.7-dist/bootstrap-3.3.7-dist/css/bootstrap.min.css">
  <script src="bootstrap-3.3.7-dist/bootstrap-3.3.7-dist/js/jquery.min.js"></script>
  <script src="bootstrap-3.3.7-dist/bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>
  <link rel="stylesheet" type="text/css" href="stylesheet/mystylesheet.css">
  <link rel='stylesheet prefetch' href='http://fonts.googleapis.com/css?family=Open+Sans:600'>
  <style type="text/css">
  	body{
	margin:0;
	color:#6a6f8c;
	background:white;
	font:600 16px/18px 'Open Sans',sans-serif;
}
*,:after,:before{box-sizing:border-box}
.clearfix:after,.clearfix:before{content:'';display:table}
.clearfix:after{clear:both;display:block}
a{color:inherit;text-decoration:none}

.login-wrap{
	width:100%;
	margin:auto;
	min-height:670px;
	position:relative;
}
.login-html{
	width:100%;
	height:100%;
	position:absolute;
	padding:90px 70px 50px 70px;
	
}
.login-html .sign-in-htm,
.login-html .sign-up-htm{
	top:0;
	left:0;
	right:0;
	bottom:0;
	position:absolute;
	-webkit-transform:rotateY(180deg);
	        transform:rotateY(180deg);
	-webkit-backface-visibility:hidden;
	        backface-visibility:hidden;
	-webkit-transition:all .4s linear;
	transition:all .4s linear;
}
.login-html .sign-in,
.login-html .sign-up,
.login-form .group .check{
	display:none;
}
.login-html .tab,
.login-form .group .label,
.login-form .group .button{
	text-transform:uppercase;
}
.login-html .tab{
	font-size:22px;
	margin-right:15px;
	padding-bottom:5px;
	margin:0 15px 10px 0;
	display:inline-block;
	border-bottom:2px solid transparent;
	color:#222222;
}
.login-html .sign-in:checked + .tab,
.login-html .sign-up:checked + .tab{
	color:#f2620f;
	border-color:#222222;
}
.login-form{
	min-height:345px;
	position:relative;
	-webkit-perspective:1000px;
	        perspective:1000px;
	-webkit-transform-style:preserve-3d;
	        transform-style:preserve-3d;
}
.login-form .group{
	margin-bottom:15px;
}
.login-form .group .label,
.login-form .group .input,
.login-form .group .button{
	width:100%;
	color:#f2620f;
	display:block;
}
.login-form .group .input,
.login-form .group .button{
	border:solid 1px #222222;
	padding:15px 20px;
	border-radius:25px;
	background:rgba(255,255,255);
}
.login-form .group input[data-type="password"]{
	text-security:circle;
	-webkit-text-security:circle;
}
.login-form .group .label{
	color:#222222;
	font-size:12px;
}
.login-form .group .button{
	background:#222222;
}
.login-form .group label .icon{
	width:15px;
	height:15px;
	border-radius:1px;
	position:relative;
	display:inline-block;
	background:#222222;
}
.login-form .group label .icon:before,
.login-form .group label .icon:after{
	content:'';
	width:10px;
	height:2px;
	background:#fff;
	position:absolute;
	-webkit-transition:all .2s ease-in-out 0s;
	transition:all .2s ease-in-out 0s;
}
.login-form .group label .icon:before{
	left:3px;
	width:5px;
	bottom:6px;
	-webkit-transform:scale(0) rotate(0);
	        transform:scale(0) rotate(0);
}
.login-form .group label .icon:after{
	top:6px;
	right:0;
	-webkit-transform:scale(0) rotate(0);
	        transform:scale(0) rotate(0);
}
.login-form .group .check:checked + label{
	color:#222222;
	
}

.login-form .group .check:checked + label .icon:before{
	-webkit-transform:scale(1) rotate(45deg);
	        transform:scale(1) rotate(45deg);
}
.login-form .group .check:checked + label .icon:after{
	-webkit-transform:scale(1) rotate(-45deg);
	        transform:scale(1) rotate(-45deg);
}
.login-html .sign-in:checked + .tab + .sign-up + .tab + .login-form .sign-in-htm{
	-webkit-transform:rotate(0);
	        transform:rotate(0);
}
.login-html .sign-up:checked + .tab + .login-form .sign-up-htm{
	-webkit-transform:rotate(0);
	        transform:rotate(0);
}

.hr{
	height:2px;
	margin:60px 0 50px 0;
	background:#222222;
	opacity:0.2;
}
.foot-lnk{
	text-align:center;
}
input:focus,
select:focus,
textarea:focus,
button:focus {
    outline: none;
}
  </style>
  </head>
  
<body id="style-4">
<spring:form modelAttribute="member" method="post">
<jsp:include page="Header.jsp"></jsp:include>
	<!-- ###################### form ########################## -->
	<div class="login-wrap" >
	<div class="login-html" >
		<input id="tab-1" type="radio" name="tab" class="sign-in" checked><label for="tab-1" class="tab">Member Login</label>
		<input id="tab-2" type="radio" name="tab" class="sign-up"><label for="tab-2" class="tab">Partner Login</label>
		<div class="login-form">
			<div class="sign-in-htm">
				<div class="group">
					<label for="userm" class="label">Member Id</label>
					<spring:input path="memberId" type="text" class="input"/>
				</div>
				<div class="group">
					<label for="passm" class="label">Password</label>
					<spring:input path="password" class="input" />
				</div>
				<div class="group">
					<input id="checkm" type="checkbox" class="check">
					<label for="checkm"><span class="icon"></span> Keep me Signed in</label>
				</div>
				<div class="group">
					<input type="submit" class="button" value="Sign In">
				</div>
				<div class="hr"></div>
				<div class="foot-lnk">
					<a href="#">Forgot Password?</a>
				</div>
			</div>
			  </spring:form>
			
			<div class="sign-up-htm">
				<div class="group">
					<label for="userp" class="label">Partner Id</label>
					<input id="partner" type="text" class="input">
				</div>
				<div class="group">
					<label for="passp" class="label">Password</label>
					<input id="pass" type="password" class="input" data-type="password">
				</div>
				<div class="group">
					<input id="checkp" type="checkbox" class="check">
					<label for="checkp"><span class="icon"></span> Keep me Signed in</label>
				</div>
				<div class="group">
					<input type="submit" class="button" value="Sign In">
				</div>
				<div class="hr"></div>
				<div class="foot-lnk">
					<a href="#">Forgot Password?</a>
				</div>
				<div class="hr"></div>
				<!-- <div class="foot-lnk">
					<label for="tab-1">Already Member?</a>
				</div> -->
			</div>
			
		</div>
	</div>
</div>

	<!-- ###################### form end ############################# -->
	<jsp:include page="footer.jsp"></jsp:include>
</body>
</html>