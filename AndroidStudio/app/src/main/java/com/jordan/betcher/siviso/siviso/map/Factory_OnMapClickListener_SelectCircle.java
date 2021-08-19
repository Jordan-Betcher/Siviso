package com.jordan.betcher.siviso.siviso.map;

import com.jordan.betcher.siviso.siviso.database.PossibleSivisoData;

class Factory_OnMapClickListener_SelectCircle
{
	private PossibleSivisoData possibleSivisoData;
	
	public Factory_OnMapClickListener_SelectCircle(PossibleSivisoData possibleSivisoData)
	{
		
		this.possibleSivisoData = possibleSivisoData;
	}
	
	public OnMapClickListener_SelectCircle create(Wrapper_GoogleMap googleMap)
	{
		Factory_CircleOptions_NewSivisoCircle factory = new Factory_CircleOptions_NewSivisoCircle();
		return new OnMapClickListener_SelectCircle(googleMap, factory, possibleSivisoData);
	}
}
