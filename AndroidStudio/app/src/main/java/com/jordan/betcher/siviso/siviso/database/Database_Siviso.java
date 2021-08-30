package com.jordan.betcher.siviso.siviso.database;

import com.google.android.gms.maps.model.LatLng;

public class Database_Siviso implements Database
{
	public Database_Siviso(UseSharedPreferences useSharedPreferences)
	{
		//TODO Database_Siviso Database_Siviso
	}
	
	@Override
	public Ringmode defaultRingmode()
	{
		return null;
	}
	
	@Override
	public void setDefaultRingmode(
	Ringmode ringmodeFromPosition)
	{
	
	}
	
	@Override
	public Siviso[] sivisos()
	{
		return new Siviso[0];
	}
	
	@Override
	public void setRingmode(
	int sivisoIndex, Ringmode ringmode)
	{
	
	}
	
	@Override
	public void saveNewSiviso(PossibleSiviso possibleSiviso)
	{
	
	}
	
	@Override
	public void delete(LatLng selected)
	{
	
	}
	//TODO
}
