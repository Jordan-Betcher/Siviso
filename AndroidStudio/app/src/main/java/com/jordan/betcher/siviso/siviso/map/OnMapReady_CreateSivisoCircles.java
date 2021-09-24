package com.jordan.betcher.siviso.siviso.map;

import com.jordan.betcher.siviso.siviso.database.OnDataChange;

public class OnMapReady_CreateSivisoCircles implements OnMapReady, OnDataChange
{
	private Factory_Circles factory;
	Circles circles;
	
	public OnMapReady_CreateSivisoCircles(Factory_Circles factory)
	{
		this.factory = factory;
	}
	
	@Override
	public void ready(Wrapper_GoogleMap googleMap)
	{
		circles = factory.create(googleMap);
		circles.recreate();
	}
	
	@Override
	public void dataChanged()
	{
		if(circles != null) circles.recreate();
	}
}
