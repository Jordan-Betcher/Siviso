package com.jordan.betcher.siviso.siviso.map;

class Factory_OnMapClickListener_SelectCircle
{
	public OnMapClickListener_SelectCircle create(Wrapper_GoogleMap googleMap)
	{
		Factory_CircleOptions_NewSivisoCircle factory = new Factory_CircleOptions_NewSivisoCircle();
		return new OnMapClickListener_SelectCircle(googleMap, factory);
	}
}
