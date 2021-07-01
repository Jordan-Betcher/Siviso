package com.jordan.betcher.siviso.siviso.map;

import com.google.android.gms.maps.model.CircleOptions;
import com.google.android.gms.maps.model.LatLng;
import com.jordan.betcher.siviso.siviso.database.SivisoData;

class OnMapReady_CreateSivisoCircleIfExists implements OnMapReady
{
	private SivisoData sivisoData;
	private Factory_CircleOptions factory;
	
	public OnMapReady_CreateSivisoCircleIfExists(SivisoData sivisoData, Factory_CircleOptions factory)
	{
		this.sivisoData = sivisoData;
		this.factory = factory;
	}
	
	@Override
	public void ready(Wrapper_GoogleMap googleMap)
	{
		if(sivisoData.exists())
		{
			CircleOptions circleOptions = factory.create(sivisoData);
			googleMap.createCircle(circleOptions);
		}
	}
}
