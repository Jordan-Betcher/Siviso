package com.jordan.betcher.siviso.siviso.database;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;

import com.google.android.gms.maps.model.LatLng;
import com.google.gson.Gson;

public class Database_Siviso implements Database
{
	public static final String SIVISOS_ID = "sivisosId";
	static final String DEFAULT_RINGMODE_ID = "defaultRingmodeId";
	static final String SHARED_PREFERENCES_ID = "sharedPreferencesID";
	private SharedPreferences sharedPreferences;
	private Gson gson;
	private Ringmodes ringmodes;
	
	public Database_Siviso(
	Activity activity, Ringmodes ringmodes, Gson gson)
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
	public int count()
	{
		return 0;
	}
	
	@Override
	public Siviso[] sivisos()
	{
		//TODO make this test
		String fullSivisoString = sharedPreferences.getString(SIVISOS_ID, "");
		return gson.fromJson(fullSivisoString, Siviso[].class);
	}
	
	@Override
	public void setRingmode(int sivisoIndex, int ringmodeIndex)
	{
	
	}
	
	@Override
	public LatLng sivisoLatLng(int index)
	{
		return null;
	}
	
	@Override
	public void saveNewSiviso(
	PossibleSiviso possibleSiviso)
	{
	
	}
	
	@Override
	public void delete(LatLng selected)
	{
	
	}
}
