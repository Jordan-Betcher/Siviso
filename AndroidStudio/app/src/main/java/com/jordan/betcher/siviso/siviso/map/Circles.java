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
		circles = new Wrapper_Circle[]{googleMap.createCircle(factory, sivisos[0])};
		
		/*
		for(Siviso siviso : database.sivisos())
		{
			CircleOptions circleOptions = factory.create(siviso);
			googleMap.createCircle(circleOptions);
		}//*/
	}
}
