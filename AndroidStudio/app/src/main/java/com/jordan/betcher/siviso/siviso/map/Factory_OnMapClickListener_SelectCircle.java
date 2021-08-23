package com.jordan.betcher.siviso.siviso.map;

import com.jordan.betcher.siviso.siviso.database.PossibleSiviso;

class Factory_OnMapClickListener_SelectCircle
{
	private PossibleSiviso possibleSiviso;
	
	public Factory_OnMapClickListener_SelectCircle(PossibleSiviso possibleSiviso)
	{
		
		this.possibleSiviso = possibleSiviso;
	}
	
	public OnMapClickListener_SelectCircle create(Wrapper_GoogleMap googleMap)
	{
		Factory_CircleOptions_NewSivisoCircle factory = new Factory_CircleOptions_NewSivisoCircle();
		return new OnMapClickListener_SelectCircle(googleMap, factory, possibleSiviso);
	}
}
