package com.jordan.betcher.siviso.siviso.map;

import com.google.android.gms.maps.model.LatLng;

public class SivisoMap_Siviso implements SivisoMap, OnMapReady
{
	private Wrapper_GoogleMap googleMap;
	
	@Override
	public void goToLocation(LatLng sivisoLocation)
	{
		if(googleMap != null) googleMap.moveTo(sivisoLocation);
	}
	
	@Override
	public void ready(Wrapper_GoogleMap googleMap)
	{
		this.googleMap = googleMap;
	}
}
