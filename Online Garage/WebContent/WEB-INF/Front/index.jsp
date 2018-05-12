<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
	<title>Online Garage</title>
	<meta charset="utf-8"> 
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<link rel="stylesheet" href="bootstrap-3.3.7-dist/bootstrap-3.3.7-dist/css/bootstrap.min.css">
  <script src="bootstrap-3.3.7-dist/bootstrap-3.3.7-dist/js/jquery.min.js"></script>
  <script src="bootstrap-3.3.7-dist/bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>
  <link rel="stylesheet" type="text/css" href="stylesheet/mystylesheet.css">
  <style type="text/css">
  	#mycontainer1
  	{
  		overflow: hidden;
  		width: 35%;
  		float: left;
  	}
  	#mycontainer2
  	{
  		overflow: visible;
  		width: 30%;
  		float: left;
  	}
  	#mycontainer3
  	{
  		overflow: hidden;
  		width: 35%;
  		float: right;
  	}
  	#parallelogram1 {
    width:480px;
    height: 72px;
    -webkit-transform: skew(-40deg);
       -moz-transform: skew(-40deg);
         -o-transform: skew(-40deg);
    background-color: #f2620f;
    margin-left: -30px;
}
#parallelogram2 {
    width:520px;
    height: 72px;
    -webkit-transform: skew(-40deg);
       -moz-transform: skew(-40deg);
         -o-transform: skew(-40deg);
    background-color: #222222;
    margin-left: -40px;
}
#parallelogram3 {
    width:480px;
    height: 72px;
    -webkit-transform: skew(-40deg);
       -moz-transform: skew(-40deg);
         -o-transform: skew(-40deg);
    background-color: #f2620f;
    margin-left: 48px;
}

  </style>

</head>
<body id="style-4">
<jsp:include page="Header.jsp"></jsp:include>
<!-- ############################ Header End ########## -->
<img src="images/81576.jpg" width="100%">
<!-- ######################################### skew info ###############################-->
<div class="largesc">
<div id="mycontainer1">
	<div id="parallelogram1">
		<p class="skewtext" style="color: black;padding-top:20px">LESS THAN 30 MINUTE ARRIVAL</p>
	</div>
		
	
</div>
<div id="mycontainer2">
	<div id="parallelogram2">
		<p class="skewtext" style="color:#f2620f;padding-top:20px"><span class="glyphicon glyphicon-earphone"></span> 0 (180) 908 90 90</p>
	</div>
</div>
<div id="mycontainer3">
	<div id="parallelogram3">
		<p class="skewtext" style="color: black;padding-top:20px">24X7 SERVICE</p>
	</div>
</div>
</div>
<div class="smallsc">
	<div class="container-fluid">
		<div class="row">
			<div class="col-md-4" style="color: black;text-align: center;background-color:#f2620f ">
				LESS THAN 30 MINUTE ARRIVAL
			</div>
			<div class="col-md-4" style="color: #f2620f;text-align: center;background-color:#222222 ">
				<span class="glyphicon glyphicon-earphone"></span> 0 (180) 908 90 90
			</div>
			<div class="col-md-4" style="color: black;text-align: center;background-color:#f2620f ">
				24X7 SERVICE
			</div>
		</div>
		
	</div>
	
</div>

<div class="container-fluid">
	<div class="row">
		<div class="col-md-4" >
			<div class="mycontainer1_1">
				<div class="parallelogram1_1">
					<p class="skewtext" style="color: white;">What is RSA?</p>
				</div>
				
			</div>
			<p style="margin: 30px 0 30px 30px;font-size: 1.6em;">
				Roadside Assistance (RSA) is a professional service offering that assures timely help by qualified automobile mechanics reaching out to motorists in case of a vehicle breakdown on road, anywhere. It accords an unparalleled peace of mind and assures motorists of not having to struggle to find help or being stranded on the road.
			</p>
		</div>
		<div class="col-md-4" >
			<div class="mycontainer1_1">
				<div class="parallelogram1_1">
					<p class="skewtext" style="color: white;">Services</p>
				</div>
				
			</div>
			<p style="margin: 30px 0 0 30px;font-size: 1.6em;">Battery JumpStart</p>
			<p style="margin: 0px 0 0px 30px;font-size: 1.6em;">Mechanical Fault</p>
			<p style="margin: 0px 0 0px 30px;font-size: 1.6em;">Fuel Delivery</p>
			<p style="margin: 0px 0 0px 30px;font-size: 1.6em;">Key Lockout</p>
			<p style="margin: 0px 0 0px 30px;font-size: 1.6em;">Towing</p>
			<p style="margin: 0px 0 0px 30px;font-size: 1.6em;">Flat Tyre</p>
			<p style="margin: 0px 0 30px 30px;font-size: 1.6em;">DoorStep Delivery</p>	
			
		</div>
		<div class="col-md-4">
			<div class="mycontainer1_1">
				<div class="parallelogram1_1">
					<p class="skewtext" style="color: white;">Why us?</p>
				</div>
				
			</div>
			<p style="margin: 30px 0 30px 30px;font-size: 1.6em;">
				Online Garage is a leading Indian RSA company with the largest service network and own infrastructure. A consistent performance record over last 17 years spells quality, safety & peace of mind for our rapidly expanding user base which includes leading corporates and individual customers.
			</p>
		</div>
		
		
	</div>
	
</div>
<!-- ####################### footer start #############################--> 
<jsp:include page="footer.jsp"></jsp:include>
<!-- ####################### footer end #############################--> 
</body>
</html>