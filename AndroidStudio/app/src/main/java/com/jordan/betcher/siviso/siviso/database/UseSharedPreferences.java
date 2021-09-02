package com.jordan.betcher.siviso.siviso.database;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;

public class UseSharedPreferences
{
	public static final String SIVISOS_ID = "sivisosId";
	static final String DEFAULT_RINGMODE_ID = "defaultRingmodeId";
	static final String SHARED_PREFERENCES_ID = "sharedPreferencesID";
	private SharedPreferences sharedPreferences;
	private Wrapper_Gson gson;
	private OnSharedPreferenceChangeListener_OnChangeEvent onChangeEvent;
	private Ringmodes ringmodes;
	
	public UseSharedPreferences(
	Activity activity, Ringmodes ringmodes, Wrapper_Gson gson,
	OnSharedPreferenceChangeListener_OnChangeEvent onChangeEvent)
	{
		this.ringmodes = ringmodes;
		sharedPreferences = activity.getSharedPreferences(SHARED_PREFERENCES_ID, Context.MODE_PRIVATE);
		this.gson = gson;
		this.onChangeEvent = onChangeEvent;
	}
	
	public Ringmode defaultRingmode()
	{
		int ringmodeInt = sharedPreferences.getInt(DEFAULT_RINGMODE_ID, 0);
		return ringmodes.from(ringmodeInt);
	}
	
	public void setDefaultRingmode(Ringmode ringmode)
	{
		SharedPreferences.Editor editor1 = sharedPreferences.edit();
		SharedPreferences.Editor editor2 = editor1.putInt(DEFAULT_RINGMODE_ID, ringmode.ordinal());
		editor2.apply();
	}
	
	public Siviso[] sivisos()
	{
		String fullSivisoString = sharedPreferences.getString(SIVISOS_ID, "");
		Siviso[] sivisos = gson.fromJson(fullSivisoString);
		return sivisos == null ? new Siviso[0] : sivisos;
	}
	
	public void setSivisos(Siviso[] newSivisos)
	{
		String editedString = gson.toJsonString(newSivisos);
		sharedPreferences.edit().putString(SIVISOS_ID, editedString).apply();
	}
	
	public OnSharedPreferenceChangeListener_OnChangeEvent onChangeEvent()
	{
		return onChangeEvent;
	}
}
