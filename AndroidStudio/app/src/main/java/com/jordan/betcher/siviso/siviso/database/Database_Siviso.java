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
	public void setDefaultRingmode(Ringmode ringmode)
	{
		useSharedPreferences.setDefaultRingmode(ringmode);
	}
	
	@Override
	public Siviso[] sivisos()
	{
		return useSharedPreferences.sivisos();
	}
	
	@Override
	public void setRingmode(
	int sivisoIndex, Ringmode ringmode)
	{
		Siviso[] sivisos = sivisos();
		sivisos[sivisoIndex].setRingmode(ringmode);
		useSharedPreferences.setSivisos(sivisos);
	}
	
	@Override
	public void delete(LatLng selected)
	{
		Siviso[] newSivisos = new Siviso[sivisos().length - 1];
		
		int newSivisosIndex = 0;
		for(int i = 0; i < sivisos().length; i++)
		{
			Siviso siviso = sivisos()[i];
			if(!siviso.latLng().equals(selected))
			{
				newSivisos[newSivisosIndex] = siviso;
				newSivisosIndex++;
			}
		}
		
		useSharedPreferences.setSivisos(newSivisos);
		//TODO
	}
}
