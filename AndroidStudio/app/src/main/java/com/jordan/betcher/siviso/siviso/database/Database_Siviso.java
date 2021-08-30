package com.jordan.betcher.siviso.siviso.database;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;

import com.google.android.gms.maps.model.LatLng;

public class Database_Siviso implements Database
{
	public static final String SIVISOS_ID = "sivisosId";
	static final String DEFAULT_RINGMODE_ID = "defaultRingmodeId";
	static final String SHARED_PREFERENCES_ID = "sharedPreferencesID";
	private SharedPreferences sharedPreferences;
	private Wrapper_Gson gson;
	private Ringmodes ringmodes;
	
	public Database_Siviso(
	Activity activity, Ringmodes ringmodes, Wrapper_Gson gson)
	{
		this.ringmodes = ringmodes;
		sharedPreferences = activity.getSharedPreferences(SHARED_PREFERENCES_ID, Context.MODE_PRIVATE);
		this.gson = gson;
	}
	
	@Override
	public Ringmode defaultRingmode()
	{
		int ringmodeInt = sharedPreferences.getInt(DEFAULT_RINGMODE_ID, 0);
		return ringmodes.from(ringmodeInt);
	}
	
	@Override
	public void setDefaultRingmode(Ringmode ringmode)
	{
		SharedPreferences.Editor editor1 = sharedPreferences.edit();
		SharedPreferences.Editor editor2 = editor1.putInt(DEFAULT_RINGMODE_ID, ringmode.ordinal());
		editor2.apply();
	}
	
	@Override
	public Siviso[] sivisos()
	{
		String fullSivisoString = sharedPreferences.getString(SIVISOS_ID, "");
		return gson.fromJson(fullSivisoString);//TODO return empty array when null
	}
	
	@Override
	public void setRingmode(int sivisoIndex, Ringmode ringmode)
	{
		Siviso[] sivisos = sivisos();
		sivisos[sivisoIndex].setRingmode(ringmode);
		String editedString = gson.toJsonString(sivisos);
		sharedPreferences.edit().putString(SIVISOS_ID, editedString).apply();
	}
	
	@Override
	public void saveNewSiviso(
	PossibleSiviso possibleSiviso)
	{
		//TODO
	}
	
	@Override
	public void delete(LatLng selected)
	{
		//TODO
	}
}
