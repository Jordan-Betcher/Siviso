package com.jordan.betcher.siviso.siviso.map;

public class Factory_SelectCircle
{
	public OnMapReady_AddOnMapClick_SelectCircle create()
	{
		Factory_OnMapClickListener_SelectCircle selectCircle = new Factory_OnMapClickListener_SelectCircle();
		return new OnMapReady_AddOnMapClick_SelectCircle(selectCircle);
	}
}
