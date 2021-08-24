package com.jordan.betcher.siviso.siviso.database;

import com.google.android.gms.maps.model.LatLng;

public class Factory_SivisoFromString
{
	public Siviso siviso(String name, LatLng latLng, int radius, Ringmode ringmode)
	{
		return new Siviso(name, latLng, radius, ringmode);
	}
}
