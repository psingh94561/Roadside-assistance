/*
var isPaused = false;

var mylat;
var mylong;
function showPosition(position) {
	mylat = parseFloat(position.coords.latitude); 
    mylong = parseFloat(position.coords.longitude); 
    alert("latlong===" + mylat+ "  " + mylong);
}
function getLocation() {
	isPaused = true;
    if (navigator.geolocation) {
        alert("latlong===ITS ONN");
    	navigator.geolocation.getCurrentPosition(showPosition);
    	isPaused = false;
    }else{
    	 mylat= parseFloat(18.534606965544366);
    	 mylong= parseFloat(73.81117356082541);
    	 isPaused = false;
    }
    
}

	getLocation();
	
	if(isPaused)
		{
		setTimeout(function(){waitForIt()},100);
		}
	else
		{
		alert(mylat + "__________" + mylong);
	var x = document.getElementById("demo");
	var myCenter=new google.maps.LatLng(mylat,mylong);
	var mapOptions = {center: myCenter, zoom: 6, mapTypeId: 'roadmap'};
	var map = new google.maps.Map(document.getElementById("divMap"), mapOptions);
	var marker = new google.maps.Marker({ position: myCenter, map: map });
	var infowindow = new google.maps.InfoWindow({ content: 'Latitude: ' + myCenter.lat() + '<br>Longitude: ' + myCenter.lng() });
	infowindow.open(map,marker);
	/*alert("Hello check map:");

	google.maps.event.addListener(map, 'click', function(event) {
		marker.setPosition(new google.maps.LatLng(event.latLng.lat(),event.latLng.lng()));
		map.setCenter(marker.getPosition());
		document.getElementById("lat").value = parseFloat(event.latLng.lat());
		document.getElementById("lng").value = parseFloat(event.latLng.lng());
		infowindow.setContent('Latitude: ' + event.latLng.lat() + '<br>Longitude: ' + event.latLng.lng());
		infowindow.setPosition(new google.maps.LatLng({lat: event.latLng.lat(), lng: event.latLng.lng()}));
	});	
		}
	*/


/* function initMap() {
        var map = new google.maps.Map(document.getElementById('map'), {
          center: {lat: -34.397, lng: 150.644},
          zoom: 6
        });
        var infoWindow = new google.maps.InfoWindow({map: map});
    	var marker = new google.maps.Marker({ position: myCenter, map: map });


        // Try HTML5 geolocation.
        if (navigator.geolocation) {
          navigator.geolocation.getCurrentPosition(function(position) {
            var pos = {
              lat: position.coords.latitude,
              lng: position.coords.longitude
            };

            infoWindow.setPosition(pos);
            infoWindow.setContent('Location found.');
            map.setCenter(pos);
          }, function() {
            handleLocationError(true, infoWindow, map.getCenter());
          });
        } else {
          // Browser doesn't support Geolocation
          handleLocationError(false, infoWindow, map.getCenter());
        }
      }

      function handleLocationError(browserHasGeolocation, infoWindow, pos) {
        infoWindow.setPosition(pos);
        infoWindow.setContent(browserHasGeolocation ?
                              'Error: The Geolocation service failed.' :
                              'Error: Your browser doesn\'t support geolocation.');
      }
*/


function showPosition(position) {
	mylat = parseFloat(position.coords.latitude); 
    mylong = parseFloat(position.coords.longitude); 
    var x = document.getElementById("demo");
	var myCenter=new google.maps.LatLng(mylat,mylong);
	var mapOptions = {center: myCenter, zoom: 17, mapTypeId: 'roadmap'};
	var map = new google.maps.Map(document.getElementById("divMap"), mapOptions);
	var marker = new google.maps.Marker({ position: myCenter, map: map });
	var infowindow = new google.maps.InfoWindow({ content: 'Latitude: ' + myCenter.lat() + '<br>Longitude: ' + myCenter.lng() });
	infowindow.open(map,marker);
	/*alert("Hello check map:");*/

	google.maps.event.addListener(map, 'click', function(event) {
		marker.setPosition(new google.maps.LatLng(event.latLng.lat(),event.latLng.lng()));
		map.setCenter(marker.getPosition());
		document.getElementById("lat").value = parseFloat(event.latLng.lat());
		document.getElementById("lng").value = parseFloat(event.latLng.lng());
		infowindow.setContent('Latitude: ' + event.latLng.lat() + '<br>Longitude: ' + event.latLng.lng());
		infowindow.setPosition(new google.maps.LatLng({lat: event.latLng.lat(), lng: event.latLng.lng()}));
	});	
}
function getLocation() {
    if (navigator.geolocation) {
    	navigator.geolocation.getCurrentPosition(showPosition);
    }else{
    	 mylat= parseFloat(18.534606965544366);
    	 mylong= parseFloat(73.81117356082541);
    	    var x = document.getElementById("demo");
    		var myCenter=new google.maps.LatLng(mylat,mylong);
    		var mapOptions = {center: myCenter, zoom: 10, mapTypeId: 'roadmap'};
    		var map = new google.maps.Map(document.getElementById("divMap"), mapOptions);
    		var marker = new google.maps.Marker({ position: myCenter, map: map });
    		var infowindow = new google.maps.InfoWindow({ content: 'Latitude: ' + myCenter.lat() + '<br>Longitude: ' + myCenter.lng() });
    		infowindow.open(map,marker);
    		/*alert("Hello check map:");*/

    		google.maps.event.addListener(map, 'click', function(event) {
    			marker.setPosition(new google.maps.LatLng(event.latLng.lat(),event.latLng.lng()));
    			map.setCenter(marker.getPosition());
    			document.getElementById("lat").value = parseFloat(event.latLng.lat());
    			document.getElementById("lng").value = parseFloat(event.latLng.lng());
    			infowindow.setContent('Latitude: ' + event.latLng.lat() + '<br>Longitude: ' + event.latLng.lng());
    			infowindow.setPosition(new google.maps.LatLng({lat: event.latLng.lat(), lng: event.latLng.lng()}));
    		});	
    }
    
}
getLocation();


	
		


