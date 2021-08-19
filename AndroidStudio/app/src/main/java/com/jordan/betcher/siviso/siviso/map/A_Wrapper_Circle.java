package com.jordan.betcher.siviso.siviso.map;

import com.google.android.gms.maps.model.Circle;
import com.google.android.gms.maps.model.LatLng;

class A_Wrapper_Circle implements Wrapper_Circle
{
	private Circle circle;
	
	public A_Wrapper_Circle(Circle circle)
	{
		this.circle = circle;
	}
	
	@Override
	public void setCenter(LatLng latLng)
	{
		circle.setCenter(latLng);
	}
}
