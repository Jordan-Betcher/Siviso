package com.jordan.betcher.siviso.siviso.map;

import com.google.android.gms.maps.GoogleMap;

class OnMapReady_AddOnCircleClickListener implements OnMapReady
{
	private GoogleMap.OnCircleClickListener onCircleClicked;
	
	public OnMapReady_AddOnCircleClickListener(GoogleMap.OnCircleClickListener onCircleClicked)
	{
		this.onCircleClicked = onCircleClicked;
	}
	
	@Override
	public void ready(Wrapper_GoogleMap googleMap)
	{
		googleMap.addOnCircleClickListener(onCircleClicked);
	}
}
