package com.jordan.betcher.siviso.siviso.map;

import com.jordan.betcher.siviso.siviso.permissions.AtPermissionGranted;

public class OnMapReady_AtPermissionGranted_EnableCurrentLocation
implements OnMapReady, AtPermissionGranted
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
	public void call()
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
