package com.jordan.betcher.siviso.siviso.map;

import com.jordan.betcher.siviso.siviso.database.PossibleSiviso;

public class Factory_SelectCircle
{
	private PossibleSiviso possibleSiviso;
	
	public Factory_SelectCircle(PossibleSiviso possibleSiviso)
	{
		this.possibleSiviso = possibleSiviso;
	}
	
	public OnMapReady_AddOnMapClick_SelectCircle create()
	{
		Factory_OnMapClickListener_SelectCircle selectCircle = new Factory_OnMapClickListener_SelectCircle(
		possibleSiviso);
		return new OnMapReady_AddOnMapClick_SelectCircle(selectCircle);
	}
}
