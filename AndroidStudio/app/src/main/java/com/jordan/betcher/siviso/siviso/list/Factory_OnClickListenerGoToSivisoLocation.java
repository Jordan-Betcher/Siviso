package com.jordan.betcher.siviso.siviso.list;

import com.google.android.gms.maps.model.LatLng;
import com.jordan.betcher.siviso.siviso.map.SivisoMap;

class Factory_OnClickListenerGoToSivisoLocation
{
	public OnClickListener_GoToSivisoLocation create(SivisoMap sivisoMap, LatLng sivisoLocation)
	{
		return new OnClickListener_GoToSivisoLocation(sivisoMap, sivisoLocation);
	}
}
