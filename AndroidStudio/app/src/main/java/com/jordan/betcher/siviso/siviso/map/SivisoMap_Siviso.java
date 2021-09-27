package com.jordan.betcher.siviso.siviso.map;

import com.google.android.gms.maps.model.LatLng;

public class SivisoMap_Siviso implements SivisoMap, OnMapReady
{
	private Wrapper_GoogleMap googleMap;
	
	@Override
	public void goToCurrentLocation()
	{
		//TODO
	}
	
	@Override
	public void goToLocation(LatLng sivisoLocation)
	{
		googleMap.moveTo(new LatLng(0 ,sivisoLocation.longitude ));
	}
	
	@Override
	public void ready(Wrapper_GoogleMap googleMap)
	{
		this.googleMap = googleMap;
	}
}
