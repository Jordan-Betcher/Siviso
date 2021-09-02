package com.jordan.betcher.siviso.siviso.database;

import android.content.SharedPreferences;

public class OnSharedPreferenceChangeListener_OnChangeEvent
implements SharedPreferences.OnSharedPreferenceChangeListener
{
	public void add(OnDataChange onDataChange)
	{
		onDataChange.dataChanged();
	}
	
	@Override
	public void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String s)
	{
	
	}
	//TODO
}
