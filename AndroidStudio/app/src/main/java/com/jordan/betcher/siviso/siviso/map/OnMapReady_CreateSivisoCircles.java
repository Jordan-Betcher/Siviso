package com.jordan.betcher.siviso.siviso.map;

import com.google.android.gms.maps.model.CircleOptions;
import com.jordan.betcher.siviso.siviso.database.OnDataChange;
import com.jordan.betcher.siviso.siviso.database.Siviso;

public class OnMapReady_CreateSivisoCircles implements OnMapReady, OnDataChange
{
	private Siviso[] sivisos;
	private Factory_CircleOptions factory;
	
	public OnMapReady_CreateSivisoCircles(
	Siviso[] sivisos, Factory_CircleOptions factory)
	{
		this.sivisos = sivisos;
		this.factory = factory;
	}
	
	@Override
	public void ready(Wrapper_GoogleMap googleMap)
	{
		for(Siviso siviso : sivisos)
		{
			CircleOptions circleOptions = factory.create(siviso);
			googleMap.createCircle(circleOptions);
		}
	}
	
	@Override
	public void dataChanged()
	{
		//TODO
		
	}
}
