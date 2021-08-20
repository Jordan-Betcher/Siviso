package com.jordan.betcher.siviso.siviso;

import com.google.android.gms.maps.model.LatLng;
import com.jordan.betcher.siviso.siviso.database.Database;
import com.jordan.betcher.siviso.siviso.database.PossibleSivisoData;
import com.jordan.betcher.siviso.siviso.database.Siviso;
import com.jordan.betcher.siviso.siviso.database.SivisoData;

import java.util.ArrayList;

public class Database_Temp implements Database
{
	@Override
	public Siviso defaultSiviso()
	{
		return null;
	}
	
	@Override
	public void setDefaultSiviso(Siviso sivisoFromPosition)
	{
	
	}
	
	@Override
	public int count()
	{
		return 0;
	}
	
	@Override
	public ArrayList<SivisoData> sivisos()
	{
		return null;
	}
	
	@Override
	public void setSiviso(int sivisoIndex, int itemIndex)
	{
	
	}
	
	@Override
	public LatLng sivisoLatLng(int index)
	{
		return null;
	}
	
	@Override
	public void saveNewSiviso(
	PossibleSivisoData possibleSivisoData)
	{
	
	}
	
	@Override
	public void delete(LatLng selected)
	{
	
	}
}
