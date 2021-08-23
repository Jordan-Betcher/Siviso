package com.jordan.betcher.siviso.siviso.database;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;

import com.google.android.gms.maps.model.LatLng;

import java.util.ArrayList;

public class Database_Siviso implements Database
{
	static final String DEFAULT_RINGMODE_ID = "defaultRingmodeId";
	static final String SHARED_PREFERENCES_ID = "sharedPreferencesID";
	SharedPreferences sharedPreference;
	private RingmodeConverter ringmodeConverter;
	
	public Database_Siviso(Activity activity, RingmodeConverter ringmodeConverter)
	{
		this.ringmodeConverter = ringmodeConverter;
		sharedPreference = activity.getSharedPreferences(SHARED_PREFERENCES_ID, Context.MODE_PRIVATE);
	}
	
	@Override
	public Ringmode defaultRingmode()
	{
		int ringmodeInt = sharedPreference.getInt(DEFAULT_RINGMODE_ID, 0);
		Ringmode ringmode = ringmodeConverter.ringmodeFrom(ringmodeInt);
		return ringmode;
	}
	
	@Override
	public void setDefaultRingmode(Ringmode ringmodeFromPosition)
	{
	
	}
	
	@Override
	public int count()
	{
		return 0;
	}
	
	@Override
	public ArrayList<Siviso> sivisos()
	{
		return null;
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
