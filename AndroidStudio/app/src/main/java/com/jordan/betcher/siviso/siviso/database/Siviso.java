package com.jordan.betcher.siviso.siviso.database;

import com.google.android.gms.maps.model.LatLng;

public interface Siviso
{
	void setLatLng(double latitude, double longitude);
	
	LatLng latLng();
	
	double radius();
	
	int color();
	
	Ringmode siviso();
}
