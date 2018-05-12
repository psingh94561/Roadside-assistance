<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
	<title>Packages</title>
	<meta charset="utf-8"> 
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<link rel="stylesheet" href="bootstrap-3.3.7-dist/bootstrap-3.3.7-dist/css/bootstrap.min.css">
  <script src="bootstrap-3.3.7-dist/bootstrap-3.3.7-dist/js/jquery.min.js"></script>
  <script src="bootstrap-3.3.7-dist/bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>
  <link rel="stylesheet" type="text/css" href="stylesheet/mystylesheet.css">
  <script>
$(document).ready(function(){
$("#wheeler4").click(function() {
    $("#selected_city").removeAttr("disabled");
});

$("#wheeler2").click(function() {
    $("#selected_city").removeAttr("disabled");
});




$("#selected_city").change(function(){
	$("#selected_city").click(function() {
	    $("#btn1").removeAttr("disabled");
	});

	$("#selected_city").click(function() {
	    $("#btn2").removeAttr("disabled");
	});
	switch($(this).val()){
			case "Mumbai":
				$("#p1").html("1000");
				$("#p2").html("1800");
				$("#hd1").html("No");
				$("#hd2").html("Yes");
				$("#bj1").html("Yes");
				$("#bj2").html("Yes");
				$("#mf1").html("Yes");
				$("#mf2").html("Yes");
				$("#ft1").html("No");
				$("#ft2").html("Yes");
				
			break;
			case "Delhi":
				$("#p1").html("1200");
				$("#p2").html("2000");
				$("#hd1").html("No");
				$("#hd2").html("No");
				$("#bj1").html("Yes");
				$("#bj2").html("Yes");
				$("#mf1").html("Yes");
				$("#mf2").html("Yes");
				$("#ft1").html("No");
				$("#ft2").html("Yes");
				
			break;
			case "Chennai":
				$("#p1").html("1100");
				$("#p2").html("1850");
				$("#hd1").html("No");
				$("#hd2").html("No");
				$("#bj1").html("Yes");
				$("#bj2").html("Yes");
				$("#mf1").html("Yes");
				$("#mf2").html("Yes");
				$("#ft1").html("No");
				$("#ft2").html("Yes");
			break;
			case "Kolkata":
				$("#p1").html("1400");
				$("#p2").html("2250");
				$("#hd1").html("No");
				$("#hd2").html("Yes");
				$("#bj1").html("Yes");
				$("#bj2").html("Yes");
				$("#mf1").html("Yes");
				$("#mf2").html("Yes");
				$("#ft1").html("No");
				$("#ft2").html("Yes");
			break;
			case "Pune":
				$("#p1").html("1500");
				$("#p2").html("2300");
				$("#hd1").html("Yes");
				$("#hd2").html("Yes");
				$("#bj1").html("Yes");
				$("#bj2").html("Yes");
				$("#mf1").html("Yes");
				$("#mf2").html("Yes");
				$("#ft1").html("No");
				$("#ft2").html("Yes");
			break;
			}
			
});

});
</script> 
  </head>
<body id="style-4" >
<jsp:include page="Header.jsp"></jsp:include>
<!-- #################### packages ################### -->

<div class="container-fluid"><!-- style="background:url('cars.jpg');" -->
  <h2 align="center">PACKAGES WE OFFER</h2>
  
 <div class="table-responsive">
  <table class="table table-bordered">
 
  <div class="col-md-3">
	<thead>
	<tr>
	<td align="right" style="color:black; font-size: 16px; vertical-align: middle">Service</td>
	<!-- <th colspan="2">two wheeler four wheeler</th> -->
		<th colspan="2" >
			<div class="radio">
				<label for="4"><input id="wheeler4" type="radio" name="optradio">Four Wheeler</label>
			
				<label for="2"><input id="wheeler2" type="radio" name="optradio">Two Wheeler</label>
			</div>	
			<div id="log"></div>
		</th>	
	</tr>
	</thead>
		<tr id="city" class="ms-bg2" style="color:black; font-size: 16px" >
                            <td align="right">Select City </td>
                            <td class="row-2 ms-bg" style="padding: 8px" colspan="2">

						
										
                        <select name="select_city" id="selected_city"  class="city-list form-control " style="height: 40px; width: auto;color:orange; display: inline-block" for="1" disabled="true">
								<option selected="selected" value="0" >Select city</option>
								<option value="Mumbai">Mumbai</option>
								<option value="Delhi">Delhi</option>
								<option value="Kolkata">Kolkata</option>
								<option value="Chennai">Chennai</option>
								<option value="Pune">Pune</option>
						</select>
						</td>
						</tr>
    
      <tr >
        <td align="right">Category</td>
        <td align="center">Gold</td>
        <td align="center">Platinum</td>
      </tr>
    
    <tbody>
	<tr>
    <td class="tg-w82q" align="right">Duration</td>
    <td class="tg-031e" align="center">1 Year<br></td>
    <td class="tg-031e" align="center">2 Year<br></td>
  </tr>
		<!-- <div id="content_1" class="inv">Content 1</div>
        <div id="content_2" class="inv">Content 2</div>
        <div id="content_3" class="inv">Content 3</div>
 -->
       
  <tr>
    <td class="tg-031e" align="right">Plan(incl. of all taxes)<br></td>
    <td class="tg-031e" align="center" id="p1">Gold Plan</td>
    <td class="tg-031e" align="center" id="p2">Platinum plan</td>
  </tr>
  <tr>
    <td class="tg-yw4l" align="right">Number of services<br></td>
    <td class="tg-baqh" align="center">6</td>
    <td class="tg-baqh" align="center">10</td>
  </tr>
  <tr>
    <td class="tg-yvo5"></td>
    
	<td  align="center"><a class="btn btn-info actionButton" id="btn1"
           href="#" disabled style="background-color:#f2620f;border:none;color:black;"> Buy </a></td>
    <td align="center"><a class="btn btn-info actionButton" id="btn2"
           href="#" disabled style="background-color:#f2620f;border:none;color:black;"> Buy </a></td>
  </tr>
  <tr>
    <th class="tg-9q69" color="black" align="center">Special Features<br></th>
    <td class="tg-yvo5"></td>
    <td class="tg-yvo5"></td>
  </tr>
  <!-- <tr>
    <td class="tg-yw4l">24X7 Roadside assistance<br></td>
    <td class="tg-yw4l" align="center">Yes</td>
    <td class="tg-yw4l" align="center">Yes</td>
  </tr> -->
  <tr>
    <td class="tg-yw4l">Flat tyre<br></td>
    <td class="tg-yw4l" align="center" id="ft1"></td>
    <td class="tg-yw4l" align="center" id="ft2"></td>
  </tr>
  <tr>
    <td class="tg-yw4l">Towing</td>
    <td class="tg-yw4l" align="center">Chargeable for more than 5 kms.<br></td>
    <td class="tg-yw4l" align="center">Chargeable for more than 10kms<br></td>
  </tr>
  <tr>
    <td class="tg-yw4l">Fuel backup</td>
    <td class="tg-yw4l" align="center">Upto 50kms</td>
    <td class="tg-yw4l" align="center">Upto 80kms</td>
  </tr>
  <tr>
    <td class="tg-yw4l">Doorstep Service</td>
    <td class="tg-yw4l" align="center" id="hd1"></td>
    <td class="tg-yw4l" align="center" id="hd2"></td>
  </tr>
  <tr>
    <td class="tg-yw4l">Battery Jumpstart</td>
    <td class="tg-yw4l" align="center" id="bj1"></td>
    <td class="tg-yw4l" align="center" id="bj2"></td>
  </tr>
  <tr>
    <td class="tg-yw4l">Mechanical Fault</td>
    <td class="tg-yw4l" align="center" id="mf1"></td>
    <td class="tg-yw4l" align="center" id="mf2"></td>
  </tr>
  
</table></div></div>

<!-- #################### packages end ################### -->
<jsp:include page="footer.jsp"></jsp:include>

</body>
</html>