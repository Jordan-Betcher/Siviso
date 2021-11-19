package com.jordan.betcher.siviso.siviso.database;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;

import java.util.ArrayList;

public class UseSharedPreferences
{
	public static final String SIVISOS_ID = "sivisosId";
	static final String SHARED_PREFERENCES_ID = "sharedPreferencesID";
	private final SharedPreferences sharedPreferences;
	private final Wrapper_Gson gson;
	private final OnSharedPreferenceChangeListener_OnChangeEvent onChangeEvent;
	
	public UseSharedPreferences(
	Activity activity, Wrapper_Gson gson,
	OnSharedPreferenceChangeListener_OnChangeEvent onChangeEvent)
	{
		this.sharedPreferences = activity
		.getSharedPreferences(SHARED_PREFERENCES_ID, Context.MODE_PRIVATE);
		this.gson = gson;
		this.onChangeEvent = onChangeEvent;
		
		sharedPreferences.registerOnSharedPreferenceChangeListener(onChangeEvent);
	}
	
	public ArrayList<Siviso> sivisos()
	{
		String fullSivisoString = sharedPreferences.getString(SIVISOS_ID, "");
		ArrayList<Siviso> sivisos = gson.fromJson(fullSivisoString);
		return sivisos == null ? new ArrayList<>() : sivisos;
	}
	
	public void setSivisos(ArrayList<Siviso> newSivisos)
	{
		String editedString = gson.toJsonString(newSivisos);
		sharedPreferences.edit().putString(SIVISOS_ID, editedString).apply();
	}
	
	public OnSharedPreferenceChangeListener_OnChangeEvent onChangeEvent()
	{
		return onChangeEvent;
	}
}
