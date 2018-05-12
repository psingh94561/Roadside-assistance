<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jstl/core" prefix="c"%>
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
<form method="post" action="mem/Bill">
<input type="hidden" id="memberLat" value="${client.getLat()}" />
<input type="hidden" id="memberLng" value="${client.getLng()}" />
<input type="hidden" id="memberId" value="${memberLogin.memberId}" />
<input type="text" id="partnerId" name="partnerId">
<div id="NeighbourMap" style='height:600px;width:600px;'>
 	Select Location
</div>
<input type="submit" id="submit" name="submit" value="submit"/>
</form>
</body>

<script type="text/javascript">
alert("Select the partner")
mylat= parseFloat($("#memberLat").val());
mylong= parseFloat($("#memberLng").val());
var myCenter=new google.maps.LatLng(mylat,mylong);
var mapOptions = {center: myCenter, zoom: 17, mapTypeId: 'roadmap'};
var map = new google.maps.Map(document.getElementById("NeighbourMap"), mapOptions);

   //var x = document.getElementById("demo");
	
	
	var memberMarker = new google.maps.Marker({ position: myCenter, map: map , title:'You' });
	map.setCenter(memberMarker.getPosition());
	
	$.ajax({
        url : "mem/getNeighbours?lat="+$("#memberLat").val()+"&lng="+$("#memberLng").val()+"&memberId="+$("#memberId").val(),
        success : function(response) {
        	alert(JSON.stringify(response));
        		var i=0;
        		var marker2 = [];
        			$.each(response, function() {
                		//alert(this.lat + " " + this.lng);
                		var ownerName = this.ownerName;
                		var partnerId=this.partnerId;
            			var mylat = parseFloat(this.lat);
            			var mylang = parseFloat(this.lng);
        				var nebhorLoc =new google.maps.LatLng(mylat,mylang);
        				marker2[i] = new google.maps.Marker({ position:nebhorLoc , map: map , title:ownerName });
        				marker2[i].addListener('click', function() {
        			        //infowindow.open(map, marker);
        			        document.getElementById("partnerId").value = parseInt(partnerId);
        			        alert(partnerId);
        			      });
        				i++;
        				//alert(marker2[i-1]);
        			});
        }
	});
	
	
	//marker.setPosition(new google.maps.LatLng(event.latLng.lat(),event.latLng.lng()));
	//marker.addListener('click', function() {
   //     infowindow.open(map, marker);
       // alert("hello");
    //  });
		
</script> 
</html>