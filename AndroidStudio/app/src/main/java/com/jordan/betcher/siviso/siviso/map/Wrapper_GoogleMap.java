package com.jordan.betcher.siviso.siviso.map;

import android.location.Location;

import com.google.android.gms.maps.model.CircleOptions;

interface Wrapper_GoogleMap
{
	void enableCurrentLocation();
	
	void moveTo(Location location);
	
	void zoomTo(float zoom);
	
	Wrapper_Circle createCircle(CircleOptions circleOptions);
}
