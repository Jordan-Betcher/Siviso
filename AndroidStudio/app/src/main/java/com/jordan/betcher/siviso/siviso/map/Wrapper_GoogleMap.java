package com.jordan.betcher.siviso.siviso.map;

import android.location.Location;

import com.google.android.gms.maps.GoogleMap;
import com.jordan.betcher.siviso.siviso.database.Siviso;

interface Wrapper_GoogleMap
{
	void enableCurrentLocation();
	
	void moveTo(Location location);
	
	void zoomTo(float zoom);
	
	Wrapper_Circle createCircle(Factory_CircleOptions factory, Siviso siviso);
	
	void addOnCircleClickListener(GoogleMap.OnCircleClickListener listener);
	
	void addOnMapClickListener(GoogleMap.OnMapClickListener listener);
}
