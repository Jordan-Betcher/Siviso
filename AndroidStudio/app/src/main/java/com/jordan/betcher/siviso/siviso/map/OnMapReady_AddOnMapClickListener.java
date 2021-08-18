package com.jordan.betcher.siviso.siviso.map;

import com.google.android.gms.maps.GoogleMap;

public class OnMapReady_AddOnMapClickListener implements OnMapReady
{
	private GoogleMap.OnMapClickListener listener;
	
	public OnMapReady_AddOnMapClickListener(GoogleMap.OnMapClickListener listener)
	{
		this.listener = listener;
	}
	
	@Override
	public void ready(Wrapper_GoogleMap googleMap)
	{
		googleMap.addOnMapClickListener(listener);
	}
}
