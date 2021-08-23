package com.jordan.betcher.siviso.siviso.map;

import com.google.android.gms.maps.model.CircleOptions;
import com.jordan.betcher.siviso.siviso.database.Siviso;

import java.util.ArrayList;

public class OnMapReady_CreateSivisoCircles implements OnMapReady
{
	private ArrayList<Siviso> sivisos;
	private Factory_CircleOptions factory;
	
	public OnMapReady_CreateSivisoCircles(
	ArrayList<Siviso> sivisos, Factory_CircleOptions factory)
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
}
