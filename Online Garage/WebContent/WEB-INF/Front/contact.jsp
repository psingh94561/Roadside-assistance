<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
	<title>Contact</title>
	<meta charset="utf-8"> 
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<link rel="stylesheet" href="bootstrap-3.3.7-dist/bootstrap-3.3.7-dist/css/bootstrap.min.css">
  <script src="bootstrap-3.3.7-dist/bootstrap-3.3.7-dist/js/jquery.min.js"></script>
  <script src="bootstrap-3.3.7-dist/bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>
  <link rel="stylesheet" type="text/css" href="stylesheet/mystylesheet.css">
  <style>
  .chicon:hover
  {
   color:#f2620f;
  }
 
  
  </style>
  </head>
<body id="style-4">
	<jsp:include page="Header.jsp"></jsp:include>
	<!-- ######### contact page start ######## -->
	<div class="container-fluid">
		<div class="row">
			<div class="col-md-4">
				<div class="mycontainer1_1">
					<div class="parallelogram1_1">
						<p class="skewtext" style="color:white;">Contact US</p>
					</div>
				</div>			
			</div>
		</div>
		<div class="col-md-12">
			<div style="background-color:#DDDDDD;margin:0 16px 30px 16px;text-align:center;padding:30px;">
				<p style="font-size:2em">We'd love to hear from you.</p>
				<p style="font-size:1.7em;color:#f2620f;">For any assistance call us</p>
				<p style="font-size:1.7em;">0 (180) 908 90 90</p>
				
			</div>
		
		</div>
		<div class="row" style="margin:20px;">
			<div class="col-md-4 chicon" style="padding:20px;">
				<div style="text-align:center;">
				<p style="font-size:4em;"><span class="glyphicon glyphicon-map-marker" ></span></p>
				<p style="font-size:20px">Address</p>
				</div>
				
				<hr>
				<p style="text-align:center;font-weight:strong;font-size:17px;">
					Gali No. 420, Chor Bazaar, Near Samshaan Ghat, Pune, Maharashtra 411007
			</p>
			
			
			</div>
			<div class="col-md-4 chicon" style="padding:20px;">
				<div style="text-align:center;">
				<p style="font-size:4em;"><span class="glyphicon glyphicon-earphone"></span></p>
				<p style="font-size:20px">Phone</p>
				</div>
				<hr>
				<p style="text-align:center;font-weight:strong;font-size:17px;">
					0 (180) 908 90 90
			</p>
			</div>
			<div class="col-md-4 chicon" style="padding:20px;" >
				<div style="text-align:center;">
				<p style="font-size:4em;"><span class="glyphicon glyphicon-envelope"></span></p>
				<p style="font-size:20px">Email</p>
				</div>
				<hr>
				<p style="text-align:center;font-weight:strong;font-size:17px;">
					customercare@onlinegarage.com
			</p>
			</div>
		</div>
	
	</div>
	
	<!-- ######### contact page end ######## -->
	<jsp:include page="footer.jsp"></jsp:include>
</body>
</html>