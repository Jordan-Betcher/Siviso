package com.jordan.betcher.siviso.siviso.database;

import com.google.android.gms.maps.model.LatLng;

public class Database_Siviso implements Database
{
	private UseSharedPreferences useSharedPreferences;
	
	public Database_Siviso(UseSharedPreferences useSharedPreferences)
	{
		this.useSharedPreferences = useSharedPreferences;
	}
	
	@Override
	public Ringmode defaultRingmode()
	{
		return useSharedPreferences.defaultRingmode();
	}
	
	@Override
	public void setDefaultRingmode(
	Ringmode ringmodeFromPosition)
	{
		useSharedPreferences.setDefaultRingmode(Ringmode.SILENT);
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
