package com.jordan.betcher.siviso.siviso.database;

import static org.junit.Assert.assertArrayEquals;
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

public class Test$Database_Siviso
{
	@Test
	public void sivisos_nameAnameB_SivisosWithB()
	{
		String name1 = "A";
		String name2 = "B";
		LatLng latLng = new LatLng(0,0);
		int radius = 0;
		Ringmode ringmode = Ringmode.SILENT;
		String sivisoString1 = String.format("[%s][%f,%f][%d][%d]", name1, latLng.latitude, latLng.longitude, radius, ringmode.ordinal());
		String sivisoString2 = String.format("[%s][%f,%f][%d][%d]", name2, latLng.latitude, latLng.longitude, radius, ringmode.ordinal());
		String sivisosString = String.format("{%s}{%s}", sivisoString1, sivisoString2);
		
		Siviso siviso1 = mock(Siviso.class);
		Siviso siviso2 = mock(Siviso.class);
		Siviso[] sivisos = new Siviso[]{siviso1, siviso2};
		SharedPreferences sharedPreferences = mock(SharedPreferences.class);
		Activity activity = mock(Activity.class);
		when(activity.getSharedPreferences(Database_Siviso.SHARED_PREFERENCES_ID, Context.MODE_PRIVATE)).thenReturn(sharedPreferences);
		when(sharedPreferences.getString(Database_Siviso.SIVISOS_ID, "")).thenReturn(sivisosString);
		RingmodeConverter ringmodeConverter = mock(RingmodeConverter.class);
		Factory_SivisoFromString sivisoFromString = mock(Factory_SivisoFromString.class);
		when(sivisoFromString.siviso(name1, latLng, radius, ringmode)).thenReturn(siviso1);
		when(sivisoFromString.siviso(name2, latLng, radius, ringmode)).thenReturn(siviso2);
		
		Database_Siviso database = new Database_Siviso(activity, ringmodeConverter, sivisoFromString);
		
		Siviso[] actualSivisos = database.sivisos();
		assertArrayEquals(sivisos, actualSivisos);
	}
	
	
	@Test
	public void sivisos_nameB_SivisosWithB()
	{
		String name = "B";
		LatLng latLng = new LatLng(0,0);
		int radius = 0;
		Ringmode ringmode = Ringmode.SILENT;
		String sivisoString1 = String.format("[%s][%f,%f][%d][%d]", name, latLng.latitude, latLng.longitude, radius, ringmode.ordinal());
		String sivisosString = String.format("{%s}", sivisoString1);
		
		Siviso siviso1 = mock(Siviso.class);
		Siviso[] sivisos = new Siviso[]{siviso1};
		SharedPreferences sharedPreferences = mock(SharedPreferences.class);
		Activity activity = mock(Activity.class);
		when(activity.getSharedPreferences(Database_Siviso.SHARED_PREFERENCES_ID, Context.MODE_PRIVATE)).thenReturn(sharedPreferences);
		when(sharedPreferences.getString(Database_Siviso.SIVISOS_ID, "")).thenReturn(sivisosString);
		RingmodeConverter ringmodeConverter = mock(RingmodeConverter.class);
		Factory_SivisoFromString sivisoFromString = mock(Factory_SivisoFromString.class);
		when(sivisoFromString.siviso(name, latLng, radius, ringmode)).thenReturn(siviso1);
		
		Database_Siviso database = new Database_Siviso(activity, ringmodeConverter, sivisoFromString);
		
		Siviso[] actualSivisos = database.sivisos();
		assertArrayEquals(sivisos, actualSivisos);
	}
	
	@Test
	public void sivisos_nameA_SivisosWithA()
	{
		String name = "A";
		LatLng latLng = new LatLng(0,0);
		int radius = 0;
		Ringmode ringmode = Ringmode.SILENT;
		String sivisoString1 = String.format("[%s][%f,%f][%d][%d]", name, latLng.latitude, latLng.longitude, radius, ringmode.ordinal());
		String sivisosString = String.format("{%s}", sivisoString1);
		
		Siviso siviso1 = mock(Siviso.class);
		Siviso[] sivisos = new Siviso[]{siviso1};
		SharedPreferences sharedPreferences = mock(SharedPreferences.class);
		Activity activity = mock(Activity.class);
		when(activity.getSharedPreferences(Database_Siviso.SHARED_PREFERENCES_ID, Context.MODE_PRIVATE)).thenReturn(sharedPreferences);
		when(sharedPreferences.getString(Database_Siviso.SIVISOS_ID, "")).thenReturn(sivisosString);
		RingmodeConverter ringmodeConverter = mock(RingmodeConverter.class);
		Factory_SivisoFromString sivisoFromString = mock(Factory_SivisoFromString.class);
		when(sivisoFromString.siviso(name, latLng, radius, ringmode)).thenReturn(siviso1);
		
		Database_Siviso database = new Database_Siviso(activity, ringmodeConverter, sivisoFromString);
		
		Siviso[] actualSivisos = database.sivisos();
		assertArrayEquals(sivisos, actualSivisos);
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