package com.jordan.betcher.siviso.siviso.map;

import com.jordan.betcher.siviso.siviso.permissions.OnPermissionGranted;

public class OnMapReady_OnPermissionGranted_EnableCurrentLocation implements OnMapReady, OnPermissionGranted
{
	boolean granted = false;
	Wrapper_GoogleMap googleMap = null;
	
	@Override
	public void ready(Wrapper_GoogleMap googleMap)
	{
		this.googleMap = googleMap;
		ifGrantedAndGoogleMapThenEnableCurrentLocation();
		
	}
	
	@Override
	public void granted()
	{
		granted = true;
		ifGrantedAndGoogleMapThenEnableCurrentLocation();
	}
	
	private void ifGrantedAndGoogleMapThenEnableCurrentLocation()
	{
		if(granted == true && googleMap != null)
		{
			googleMap.enableCurrentLocation();
		}
	}
}
