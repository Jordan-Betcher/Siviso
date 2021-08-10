package com.jordan.betcher.siviso.siviso.list;

import android.view.View;

import com.google.android.gms.maps.model.LatLng;
import com.jordan.betcher.siviso.siviso.map.SivisoMap;

class OnClickListener_GoToSivisoLocation implements View.OnClickListener
{
	private SivisoMap sivisoMap;
	private LatLng sivisoLocation;
	
	public OnClickListener_GoToSivisoLocation(SivisoMap sivisoMap, LatLng sivisoLocation)
	{
		this.sivisoMap = sivisoMap;
		this.sivisoLocation = sivisoLocation;
	}
	
	@Override
	public void onClick(View view)
	{
		sivisoMap.goToLocation(sivisoLocation);
	}
}
