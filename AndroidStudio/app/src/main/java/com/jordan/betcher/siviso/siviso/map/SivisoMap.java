package com.jordan.betcher.siviso.siviso.map;

import com.google.android.gms.maps.model.LatLng;

public interface SivisoMap
{
	void goToCurrentLocation();
	
	void goToLocation(LatLng sivisoLocation);
}
