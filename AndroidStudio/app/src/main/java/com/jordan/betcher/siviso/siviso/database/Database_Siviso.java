package com.jordan.betcher.siviso.siviso.database;

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
//		Siviso[] sivisos = sivisos();
//		sivisos[sivisoIndex].setRingmode(ringmode);
//		useSharedPreferences.setSivisos(sivisos);
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
		if(deleteIndex >= sivisos.length) return;
		Siviso[] newSiviso = new Siviso[sivisos.length - 1];
		boolean passed = false;
		
		for(int i = 0; i < sivisos.length; i++)
		{
			if(i != deleteIndex)
			{
				if(!passed)
				{
					newSiviso[i] = useSharedPreferences.sivisos()[i];
				}
				else
				{
					newSiviso[i - 1] = useSharedPreferences.sivisos()[i];
				}
			}
			else
			{
				passed = true;
			}
		}
		
		useSharedPreferences.setSivisos(newSiviso);
		
	}
}
