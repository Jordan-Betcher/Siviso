package com.jordan.betcher.siviso.siviso.map;

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;

class A_OnMapReadyCallback_OnMapReady implements OnMapReadyCallback
{
	private OnMapReady_Multiple multiple;
	
	public A_OnMapReadyCallback_OnMapReady(OnMapReady_Multiple multiple)
	{
		this.multiple = multiple;
	}
	
	@Override
	public void onMapReady(GoogleMap googleMap)
	{
		A_Wrapper_GoogleMap wrapperGoogleMap = new A_Wrapper_GoogleMap(googleMap);
		multiple.onMapReady(wrapperGoogleMap);
	}
}
