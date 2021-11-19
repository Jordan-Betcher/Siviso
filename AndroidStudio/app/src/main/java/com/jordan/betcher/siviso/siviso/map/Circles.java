package com.jordan.betcher.siviso.siviso.map;

import com.jordan.betcher.siviso.siviso.database.Siviso;

import java.util.ArrayList;

class Circles
{
	Wrapper_Circle[] circles;
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
		if(circles != null)
		{
			for(Wrapper_Circle circle : circles)
			{
				circle.remove();
			}
		}
		
		circles = new Wrapper_Circle[sivisos.size()];
		
		for(int i = 0; i < sivisos.size(); i++)
		{
			Siviso siviso = sivisos.get(i);
			circles[i] = googleMap.createCircle(factory, siviso);
		}
	}
}
