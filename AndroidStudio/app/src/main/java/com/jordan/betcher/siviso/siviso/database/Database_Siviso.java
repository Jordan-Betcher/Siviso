package com.jordan.betcher.siviso.siviso.database;

import java.util.ArrayList;
import java.util.Arrays;

public class Database_Siviso implements Database
{
	private final UseSharedPreferences useSharedPreferences;
	
	public Database_Siviso(UseSharedPreferences useSharedPreferences)
	{
		this.useSharedPreferences = useSharedPreferences;
	}
	
	@Override
	public Siviso[] sivisos()
	{
		return useSharedPreferences.sivisos();
	}
	
	@Override
	public void setIsOn(
	int sivisoIndex, boolean isOn)
	{
		//TODO setIsOn
//		Siviso[] newSivisos = useSharedPreferences.sivisos();
//		newSivisos[sivisoIndex].setIsOn(isOn);
//		useSharedPreferences.setSivisos(newSivisos);
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
		useSharedPreferences.onChangeEvent().add(onDataChange);
	}
	
	@Override
	public void delete(int deleteIndex)
	{
		Siviso[] sivisos = useSharedPreferences.sivisos();
		if(deleteIndex >= sivisos.length){ return; }
		ArrayList<Siviso> oldSiviso = new ArrayList<>(Arrays.asList(sivisos));
		oldSiviso.remove(deleteIndex);
		Siviso[] newSiviso = new Siviso[sivisos.length - 1];
		oldSiviso.toArray(newSiviso);
		useSharedPreferences.setSivisos(newSiviso);
	}
}
