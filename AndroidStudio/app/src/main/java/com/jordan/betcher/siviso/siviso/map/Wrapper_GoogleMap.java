package com.jordan.betcher.siviso.siviso.map;

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.LatLng;
import com.jordan.betcher.siviso.siviso.database.Siviso;

interface Wrapper_GoogleMap
{
	void enableCurrentLocation();
	
	void moveTo(LatLng latLng);
	
	void zoomTo(float zoom);
	
	Wrapper_Circle createCircle(Factory_CircleOptions factory, Siviso siviso);
	
	void addOnCircleClickListener(GoogleMap.OnCircleClickListener listener);
	
	void addOnMapClickListener(GoogleMap.OnMapClickListener listener);
}
