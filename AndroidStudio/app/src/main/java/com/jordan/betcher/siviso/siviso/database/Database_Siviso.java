package com.jordan.betcher.siviso.siviso.database;

import com.google.android.gms.maps.model.LatLng;

import java.util.ArrayList;

public class Database_Siviso implements Database
{
	public static String defaultRingmodeId;
	
	@Override
	public Ringmode defaultRingmode()
	{
		return Ringmode.SILENT;
	}
	
	@Override
	public void setDefaultRingmode(Ringmode ringmodeFromPosition)
	{
	
	}
	
	@Override
	public int count()
	{
		return 0;
	}
	
	@Override
	public ArrayList<Siviso> sivisos()
	{
		return null;
	}
	
	@Override
	public void setRingmode(int sivisoIndex, int ringmodeIndex)
	{
	
	}
	
	@Override
	public LatLng sivisoLatLng(int index)
	{
		return null;
	}
	
	@Override
	public void saveNewSiviso(
	PossibleSiviso possibleSiviso)
	{
	
	}
	
	@Override
	public void delete(LatLng selected)
	{

	}
}
