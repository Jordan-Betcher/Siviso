package com.jordan.betcher.siviso.siviso.database;

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
		for(int i = 0; i < sivisos.length; i++)
		{
			if(i != deleteIndex) useSharedPreferences.setSivisos(new Siviso[]{useSharedPreferences.sivisos()[i]});
		}
		
		if(sivisos.length == 1)
		{
			useSharedPreferences.setSivisos(new Siviso[0]);
		}
		
	}
}
