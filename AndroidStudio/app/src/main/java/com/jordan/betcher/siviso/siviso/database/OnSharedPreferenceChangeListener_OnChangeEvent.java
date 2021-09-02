package com.jordan.betcher.siviso.siviso.database;

import android.content.SharedPreferences;

public class OnSharedPreferenceChangeListener_OnChangeEvent
implements SharedPreferences.OnSharedPreferenceChangeListener
{
	private OnDataChange onDataChange;
	
	public void add(OnDataChange onDataChange)
	{
		if(this.onDataChange==null) this.onDataChange = onDataChange;
	}
	
	@Override
	public void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String s)
	{
		onDataChange.dataChanged();
	}
}
