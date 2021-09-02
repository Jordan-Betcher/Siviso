package com.jordan.betcher.siviso.siviso.database;

import com.google.android.gms.maps.model.LatLng;

import java.util.ArrayList;

public class Database_Siviso implements Database
{
	private UseSharedPreferences useSharedPreferences;
	private ArrayList<OnDataChange> onDataChanges = new ArrayList<>();
	
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
		
		if (onDataChanges.size() > 0)
		{
			for(OnDataChange onDataChange : onDataChanges)
			{
				onDataChange.dataChanged();
			}
		}
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
		if (onDataChanges.size() > 0)
		{
			for(OnDataChange onDataChange : onDataChanges)
			{
				onDataChange.dataChanged();
			}
		}
	}
	
	@Override
	public void delete(LatLng selected)
	{
		Siviso[] sivisos = sivisos();
		if(sivisos.length == 0) return;
		Siviso[] newSivisos = new Siviso[sivisos.length - 1];
		
		int newSivisosIndex = 0;
		for(int i = 0; i < sivisos.length; i++)
		{
			Siviso siviso = sivisos[i];
			if(!siviso.latLng().equals(selected))
			{
				if(newSivisosIndex == newSivisos.length)
				{
					return;
				}
				newSivisos[newSivisosIndex] = siviso;
				newSivisosIndex++;
			}
		}
		
		useSharedPreferences.setSivisos(newSivisos);
	}
	
	@Override
	public void save(Siviso newSiviso)
	{
		Siviso[] sivisos = sivisos();
		Siviso[] newSivisos = new Siviso[sivisos.length + 1];
		
		for(int i = 0; i < sivisos.length; i++)
		{
			newSivisos[i] = sivisos[i];
		}
		
		newSivisos[sivisos.length] = newSiviso;
		useSharedPreferences.setSivisos(newSivisos);
	}
	
	@Override
	public void addOnDataChange(OnDataChange onDataChange)
	{
		this.onDataChanges.add(onDataChange);
		//delete, save
	}
}
