package com.jordan.betcher.siviso.siviso.database;

import com.google.android.gms.maps.model.LatLng;

public interface SivisoData
{
	boolean exists();
	void setLatLng(double latitude, double longitude);
	
	LatLng latLng();
	
	double radius();
	
	int color();
}
