package com.jordan.betcher.siviso.siviso.map;

import android.location.Location;

interface Wrapper_GoogleMap
{
	void enableCurrentLocation();
	
	void moveTo(Location location);
}
