package com.jordan.betcher.siviso.siviso.list.viewholdersivisoitem;

import com.google.android.gms.maps.model.LatLng;
import com.jordan.betcher.siviso.siviso.map.SivisoMap;

class Factory_OnClickListenerGoToSivisoLocation
{
	private SivisoMap sivisoMap;
	
	public Factory_OnClickListenerGoToSivisoLocation(SivisoMap sivisoMap)
	{
		
		this.sivisoMap = sivisoMap;
	}
	
	public OnClickListener_GoToSivisoLocation create(LatLng sivisoLocation)
	{
		return new OnClickListener_GoToSivisoLocation(sivisoMap, sivisoLocation);
	}
}
