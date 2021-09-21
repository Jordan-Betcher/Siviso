package com.jordan.betcher.siviso.siviso.list.viewholdersivisoitem;

import android.view.View;

import com.google.android.gms.maps.model.LatLng;
import com.jordan.betcher.siviso.siviso.map.SivisoMap;

class OnRowClick_GoToSivisoLocation implements OnRowClick
{
	private SivisoMap sivisoMap;
	private LatLng sivisoLocation;
	
	public OnRowClick_GoToSivisoLocation(SivisoMap sivisoMap, LatLng sivisoLocation)
	{
		this.sivisoMap = sivisoMap;
		this.sivisoLocation = sivisoLocation;
	}
	
	@Override
	public void call(View view)
	{
		sivisoMap.goToLocation(sivisoLocation);
	}
}
