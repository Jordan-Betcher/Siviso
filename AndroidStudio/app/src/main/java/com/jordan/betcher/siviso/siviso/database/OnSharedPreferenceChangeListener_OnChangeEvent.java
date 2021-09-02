package com.jordan.betcher.siviso.siviso.database;

import android.content.SharedPreferences;

import java.util.ArrayList;

public class OnSharedPreferenceChangeListener_OnChangeEvent
implements SharedPreferences.OnSharedPreferenceChangeListener
{
	private ArrayList<OnDataChange> onDataChanges = new ArrayList<>();
	
	public void add(OnDataChange onDataChange)
	{
		onDataChanges.add(onDataChange);
	}
	
	@Override
	public void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String s)
	{
		for(OnDataChange onDataChange : onDataChanges)
		{
			onDataChange.dataChanged();
		}
	}
}
