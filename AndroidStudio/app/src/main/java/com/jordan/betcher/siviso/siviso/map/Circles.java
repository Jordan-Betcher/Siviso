package com.jordan.betcher.siviso.siviso.map;

import com.jordan.betcher.siviso.siviso.database.Siviso;

class Circles
{
	Wrapper_Circle[] circles;
	private Wrapper_GoogleMap googleMap;
	private Factory_CircleOptions factory;
	
	public Circles(Wrapper_GoogleMap googleMap,
	Factory_CircleOptions factory)
	{
		this.googleMap = googleMap;
		this.factory = factory;
	}
	
	public void setCircles(Siviso[] sivisos)
	{
		if(sivisos.length == 0)
		{
			for(Wrapper_Circle circle : circles)
			{
				circle.remove();
			}
		}
		
		circles = new Wrapper_Circle[sivisos.length];
		
		for(int i = 0; i < sivisos.length; i++)
		{
			Siviso siviso = sivisos[i];
			circles[i] = googleMap.createCircle(factory, siviso);
		}
	}
}
