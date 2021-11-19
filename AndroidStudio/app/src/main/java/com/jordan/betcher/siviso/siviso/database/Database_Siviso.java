package com.jordan.betcher.siviso.siviso.database;

import java.util.ArrayList;

public class Database_Siviso implements Database
{
	private final UseSharedPreferences useSharedPreferences;
	
	public Database_Siviso(UseSharedPreferences useSharedPreferences)
	{
		this.useSharedPreferences = useSharedPreferences;
	}
	
	@Override
	public ArrayList<Siviso> sivisos()
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
		ArrayList<Siviso> sivisos = sivisos();
		sivisos.add(newSiviso);
		useSharedPreferences.setSivisos(sivisos);
	}
	
	@Override
	public void addOnDataChange(OnDataChange onDataChange)
	{
		useSharedPreferences.onChangeEvent().add(onDataChange);
	}
	
	@Override
	public void delete(int deleteIndex)
	{
		ArrayList<Siviso> sivisos = useSharedPreferences.sivisos();
		if(deleteIndex < sivisos.size())
		{
			sivisos.remove(deleteIndex);
			useSharedPreferences.setSivisos(sivisos);
		}
	}
}
