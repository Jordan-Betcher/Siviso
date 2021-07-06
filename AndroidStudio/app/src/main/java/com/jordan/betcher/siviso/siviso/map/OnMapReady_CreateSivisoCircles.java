package com.jordan.betcher.siviso.siviso.map;

import com.google.android.gms.maps.model.CircleOptions;
import com.jordan.betcher.siviso.siviso.database.SivisoData;

import java.util.ArrayList;

class OnMapReady_CreateSivisoCircles implements OnMapReady
{
	private ArrayList<SivisoData> sivisoDatas;
	private Factory_CircleOptions factory;
	
	public OnMapReady_CreateSivisoCircles(ArrayList<SivisoData> sivisoDatas, Factory_CircleOptions factory)
	{
		this.sivisoDatas = sivisoDatas;
		this.factory = factory;
	}
	
	@Override
	public void ready(Wrapper_GoogleMap googleMap)
	{
		for(SivisoData sivisoData : sivisoDatas)
		{
			CircleOptions circleOptions = factory.create(sivisoData);
			googleMap.createCircle(circleOptions);
		}
	}
}
