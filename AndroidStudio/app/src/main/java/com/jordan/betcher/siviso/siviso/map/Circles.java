package com.jordan.betcher.siviso.siviso.map;

import com.jordan.betcher.siviso.siviso.database.Siviso;

import java.util.ArrayList;

class Circles
{
	ArrayList<Wrapper_Circle> circles = new ArrayList<>();
	private final Wrapper_GoogleMap googleMap;
	private final Factory_CircleOptions factory;
	
	public Circles(
	Wrapper_GoogleMap googleMap,
	Factory_CircleOptions factory)
	{
		this.googleMap = googleMap;
		this.factory = factory;
	}
	
	public void setCircles(ArrayList<Siviso> sivisos)
	{
		for(Wrapper_Circle circle : circles)
		{
			circle.remove();
		}
		
		for(Siviso siviso : sivisos)
		{
			circles.add(googleMap.createCircle(factory, siviso));
		}
	}
}
