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
	private Factory_SivisoFromString sivisoFromString;
	private RingmodeConverter ringmodeConverter;
	
	public Database_Siviso(
	Activity activity, RingmodeConverter ringmodeConverter,
	Factory_SivisoFromString sivisoFromString)
	{
		this.ringmodeConverter = ringmodeConverter;
		sharedPreferences = activity.getSharedPreferences(SHARED_PREFERENCES_ID, Context.MODE_PRIVATE);
		this.sivisoFromString = sivisoFromString;
	}
	
	@Override
	public Ringmode defaultRingmode()
	{
		int ringmodeInt = sharedPreferences.getInt(DEFAULT_RINGMODE_ID, 0);
		Ringmode ringmode = ringmodeConverter.ringmodeFrom(ringmodeInt);
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
		String[] sivisosString = sharedPreferences.getString(Database_Siviso.SIVISOS_ID, "").replaceAll("[{]","").split("[}]");
		Siviso[] sivisos = new Siviso[sivisosString.length];
		for(int i = 0; i < sivisosString.length; i++)
		{
			String sivisoString = sivisosString[i];
			String[] vars = sivisoString.replaceAll("\\[", "").split("\\]");
			String[] latLngString = vars[1].split(",");
			double latitude = Double.parseDouble(latLngString[0]);
			
			Siviso siviso = sivisoFromString.siviso(vars[0], new LatLng(latitude, 0), 0, Ringmode.SILENT);
			sivisos[i] = siviso;
		}
		
		return sivisos;
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
