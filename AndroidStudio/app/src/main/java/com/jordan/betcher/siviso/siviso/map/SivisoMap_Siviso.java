package com.jordan.betcher.siviso.siviso.map;

import com.google.android.gms.maps.model.LatLng;

public class SivisoMap_Siviso implements SivisoMap, OnMapReady
{
	@Override
	public void goToCurrentLocation()
	{
		//TODO
	}
	
	@Override
	public void goToLocation(LatLng sivisoLocation)
	{
		//TODO
	}
	
	@Override
	public void ready(Wrapper_GoogleMap googleMap)
	{
		googleMap.moveTo(new LatLng(0 ,0 ));
	}
}
