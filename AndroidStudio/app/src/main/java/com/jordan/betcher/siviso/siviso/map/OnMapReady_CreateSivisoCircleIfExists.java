package com.jordan.betcher.siviso.siviso.map;

import com.google.android.gms.maps.model.CircleOptions;
import com.google.android.gms.maps.model.LatLng;
import com.jordan.betcher.siviso.siviso.database.LatLngData;

class OnMapReady_CreateSivisoCircleIfExists implements OnMapReady
{
	private LatLngData sivisoLatLng;
	private Factory_CircleOptions factory;
	
	public OnMapReady_CreateSivisoCircleIfExists(LatLngData sivisoLatLng, Factory_CircleOptions factory)
	{
		
		this.sivisoLatLng = sivisoLatLng;
		this.factory = factory;
	}
	
	@Override
	public void ready(Wrapper_GoogleMap googleMap)
	{
		if(sivisoLatLng.exists())
		{
			LatLng latLng = sivisoLatLng.latLng();
			CircleOptions circleOptions = factory.create(latLng);
			googleMap.createCircle(circleOptions);
		}
	}
}
