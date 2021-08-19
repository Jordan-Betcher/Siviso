package com.jordan.betcher.siviso.siviso.map;

import com.google.android.gms.maps.GoogleMap;

public class OnMapReady_AddOnMapClick_SelectCircle implements OnMapReady
{
	private Factory_OnMapClickListener_SelectCircle factory;
	
	public OnMapReady_AddOnMapClick_SelectCircle(Factory_OnMapClickListener_SelectCircle factory)
	{
		this.factory = factory;
	}
	
	@Override
	public void ready(Wrapper_GoogleMap googleMap)
	{
		GoogleMap.OnMapClickListener listener = factory.create(googleMap);
		googleMap.addOnMapClickListener(listener);
	}
}
