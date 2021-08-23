package com.jordan.betcher.siviso.siviso.database;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;

import com.google.android.gms.maps.model.LatLng;

import org.junit.Test;

import java.util.ArrayList;

public class Test$Database_Siviso
{
	
	@Test
	public void sivisos_nameB_SivisosWithB()
	{
		String name = "B";
		LatLng latLng = new LatLng(45.3294524,-32.4952345892);
		int radius = 0;
		int ringmode = 0;
		String sivisoString1 = String.format("[%s][%f,%f][%d][%d]", name, latLng.latitude, latLng.longitude, radius, ringmode);
		String sivisosString = String.format("{%s}", sivisoString1);
		
		
		Siviso siviso1 = mock(Siviso.class);
		ArrayList<Siviso> sivisos = new ArrayList<>();
		sivisos.add(siviso1);
		SharedPreferences sharedPreferences = mock(SharedPreferences.class);
		Activity activity = mock(Activity.class);
		when(activity.getSharedPreferences(Database_Siviso.SHARED_PREFERENCES_ID, Context.MODE_PRIVATE)).thenReturn(sharedPreferences);
		when(sharedPreferences.getString(Database_Siviso.SIVISOS_ID, "")).thenReturn(sivisosString);
		RingmodeConverter ringmodeConverter = mock(RingmodeConverter.class);
		Factory_SivisoFromString sivisoFromString = mock(Factory_SivisoFromString.class);
		when(sivisoFromString.siviso(sivisoString1)).thenReturn(siviso1);
		
		Database_Siviso database = new Database_Siviso(activity, ringmodeConverter, sivisoFromString);
		
		ArrayList<Siviso> actualSivisos = database.sivisos();
		assertEquals(sivisos, actualSivisos);
	}
	
	@Test
	public void sivisos_nameA_SivisosWithA()
	{
		String name = "A";
		LatLng latLng = new LatLng(0,0);
		int radius = 0;
		int ringmode = 0;
		String sivisoString1 = String.format("[%s][%f,%f][%d][%d]", name, latLng.latitude, latLng.longitude, radius, ringmode);
		String sivisosString = String.format("{%s}", sivisoString1);
		
		
		Siviso siviso1 = mock(Siviso.class);
		ArrayList<Siviso> sivisos = new ArrayList<>();
		sivisos.add(siviso1);
		SharedPreferences sharedPreferences = mock(SharedPreferences.class);
		Activity activity = mock(Activity.class);
		when(activity.getSharedPreferences(Database_Siviso.SHARED_PREFERENCES_ID, Context.MODE_PRIVATE)).thenReturn(sharedPreferences);
		when(sharedPreferences.getString(Database_Siviso.SIVISOS_ID, "")).thenReturn(sivisosString);
		RingmodeConverter ringmodeConverter = mock(RingmodeConverter.class);
		Factory_SivisoFromString sivisoFromString = mock(Factory_SivisoFromString.class);
		when(sivisoFromString.siviso(sivisoString1)).thenReturn(siviso1);
		
		Database_Siviso database = new Database_Siviso(activity, ringmodeConverter, sivisoFromString);
		
		ArrayList<Siviso> actualSivisos = database.sivisos();
		assertEquals(sivisos, actualSivisos);
	}
	
	@Test
	public void setDefaultRingmode_VIBRATE_sharedPreferencesSetDefaultRingmode1()
	{
		Ringmode ringmode = Ringmode.VIBRATE;
		SharedPreferences sharedPreferences = mock(SharedPreferences.class);
		SharedPreferences.Editor editor1 = mock(SharedPreferences.Editor.class);
		SharedPreferences.Editor editor2 = mock(SharedPreferences.Editor.class);
		when(sharedPreferences.edit()).thenReturn(editor1);
		when(editor1.putInt(Database_Siviso.DEFAULT_RINGMODE_ID, ringmode.ordinal())).thenReturn(editor2);
		Activity activity = mock(Activity.class);
		when(activity.getSharedPreferences(Database_Siviso.SHARED_PREFERENCES_ID, Context.MODE_PRIVATE)).thenReturn(sharedPreferences);
		RingmodeConverter ringmodeConverter = mock(RingmodeConverter.class);
		
		Database_Siviso database = new Database_Siviso(activity, ringmodeConverter,
		                                               null);
		database.setDefaultRingmode(ringmode);
		
		verify(editor2, times(1)).apply();
	}
	
	@Test
	public void __0sharedPreferencesSetDefaultRingmode0()
	{
		Ringmode ringmode = Ringmode.SILENT;
		SharedPreferences sharedPreferences = mock(SharedPreferences.class);
		SharedPreferences.Editor editor1 = mock(SharedPreferences.Editor.class);
		SharedPreferences.Editor editor2 = mock(SharedPreferences.Editor.class);
		when(sharedPreferences.edit()).thenReturn(editor1);
		when(editor1.putInt(Database_Siviso.DEFAULT_RINGMODE_ID, ringmode.ordinal())).thenReturn(editor2);
		Activity activity = mock(Activity.class);
		when(activity.getSharedPreferences(Database_Siviso.SHARED_PREFERENCES_ID, Context.MODE_PRIVATE)).thenReturn(sharedPreferences);
		RingmodeConverter ringmodeConverter = mock(RingmodeConverter.class);
		
		Database_Siviso database = new Database_Siviso(activity, ringmodeConverter,
		                                               null);
		
		verify(editor2, times(0)).apply();
	}
	
	@Test
	public void setDefaultRingmode_SILENT_sharedPreferencesSetDefaultRingmode0()
	{
		Ringmode ringmode = Ringmode.SILENT;
		SharedPreferences sharedPreferences = mock(SharedPreferences.class);
		SharedPreferences.Editor editor1 = mock(SharedPreferences.Editor.class);
		SharedPreferences.Editor editor2 = mock(SharedPreferences.Editor.class);
		when(sharedPreferences.edit()).thenReturn(editor1);
		when(editor1.putInt(Database_Siviso.DEFAULT_RINGMODE_ID, ringmode.ordinal())).thenReturn(editor2);
		Activity activity = mock(Activity.class);
		when(activity.getSharedPreferences(Database_Siviso.SHARED_PREFERENCES_ID, Context.MODE_PRIVATE)).thenReturn(sharedPreferences);
		RingmodeConverter ringmodeConverter = mock(RingmodeConverter.class);
		
		Database_Siviso database = new Database_Siviso(activity, ringmodeConverter,
		                                               null);
		database.setDefaultRingmode(ringmode);
		
		verify(editor2, times(1)).apply();
	}
	
	@Test
	public void defaultRingmode_sharedPreferencesDefaultRingmodeVIBRATE_VIBRATE()
	{
		Ringmode ringmode = Ringmode.VIBRATE;
		SharedPreferences sharedPreferences = mock(SharedPreferences.class);
		when(sharedPreferences.getInt(Database_Siviso.DEFAULT_RINGMODE_ID, 0)).thenReturn(ringmode.ordinal());
		Activity activity = mock(Activity.class);
		when(activity.getSharedPreferences(Database_Siviso.SHARED_PREFERENCES_ID, Context.MODE_PRIVATE)).thenReturn(sharedPreferences);
		RingmodeConverter ringmodeConverter = mock(RingmodeConverter.class);
		when(ringmodeConverter.ringmodeFrom(ringmode.ordinal())).thenReturn(ringmode);
		
		Database_Siviso database = new Database_Siviso(activity, ringmodeConverter,
		                                               null);
		
		Ringmode actualRingmode = database.defaultRingmode();
		assertEquals(ringmode, actualRingmode);
	}
	
	@Test
	public void defaultRingmode_sharedPreferencesDefaultRingmodeSILENT_SILENT()
	{
		Ringmode ringmode = Ringmode.SILENT;
		SharedPreferences sharedPreferences = mock(SharedPreferences.class);
		when(sharedPreferences.getInt(Database_Siviso.DEFAULT_RINGMODE_ID, 0)).thenReturn(ringmode.ordinal());
		Activity activity = mock(Activity.class);
		when(activity.getSharedPreferences(Database_Siviso.SHARED_PREFERENCES_ID, Context.MODE_PRIVATE)).thenReturn(sharedPreferences);
		RingmodeConverter ringmodeConverter = mock(RingmodeConverter.class);
		when(ringmodeConverter.ringmodeFrom(ringmode.ordinal())).thenReturn(ringmode);
		
		Database_Siviso database = new Database_Siviso(activity, ringmodeConverter,
		                                               null);
		
		Ringmode actualRingmode = database.defaultRingmode();
		assertEquals(ringmode, actualRingmode);
	}
}