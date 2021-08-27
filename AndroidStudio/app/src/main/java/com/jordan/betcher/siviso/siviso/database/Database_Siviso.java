package com.jordan.betcher.siviso.siviso.database;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;

import com.google.android.gms.maps.model.LatLng;

import java.util.ArrayList;

public class Database_Siviso implements Database
{
	public static final String SIVISOS_ID = "sivisosId";
	static final String DEFAULT_RINGMODE_ID = "defaultRingmodeId";
	static final String SHARED_PREFERENCES_ID = "sharedPreferencesID";
	private SharedPreferences sharedPreferences;
	private SivisoCreator sivisoCreator;
	private Ringmodes ringmodes;
	
	public Database_Siviso(
	Activity activity, Ringmodes ringmodes,
	SivisoCreator sivisoCreator)
	{
		this.ringmodes = ringmodes;
		sharedPreferences = activity.getSharedPreferences(SHARED_PREFERENCES_ID, Context.MODE_PRIVATE);
		this.sivisoCreator = sivisoCreator;
	}
	
	@Override
	public Ringmode defaultRingmode()
	{
		int ringmodeInt = sharedPreferences.getInt(DEFAULT_RINGMODE_ID, 0);
		Ringmode ringmode = ringmodes.from(ringmodeInt);
		return ringmode;
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
		String fullSivisoString = sharedPreferences.getString(SIVISOS_ID, "");
		String[] sections = sivisoCreator.sectionsFrom(fullSivisoString);
		ArrayList<Siviso> sivisos = new ArrayList<>();
		for(String section : sections)
		{
			if(sivisoCreator.isValidSection(section))
			{
				Siviso siviso = sivisoCreator.sivisoFrom(section);
				sivisos.add(siviso);
			}
		}
		Siviso[] sivisoArray = new Siviso[sivisos.size()];
		sivisos.toArray(sivisoArray);
		return sivisoArray;
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
