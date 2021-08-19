package com.jordan.betcher.siviso.siviso.map;

import com.jordan.betcher.siviso.siviso.database.PossibleSivisoData;

public class Factory_SelectCircle
{
	private PossibleSivisoData possibleSivisoData;
	
	public Factory_SelectCircle(PossibleSivisoData possibleSivisoData)
	{
		this.possibleSivisoData = possibleSivisoData;
	}
	
	public OnMapReady_AddOnMapClick_SelectCircle create()
	{
		Factory_OnMapClickListener_SelectCircle selectCircle = new Factory_OnMapClickListener_SelectCircle(possibleSivisoData);
		return new OnMapReady_AddOnMapClick_SelectCircle(selectCircle);
	}
}
