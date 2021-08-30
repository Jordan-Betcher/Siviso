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

import org.junit.Test;

public class Test$Database_Siviso
{
	
	@Test
	public void setRingmode_1VIBRATE_siviso1RingmodeVibrateAndSharedPreferencesPut()
	{
		int sivisoIndex = 1;
		Ringmode ringmode = Ringmode.VIBRATE;
		String sivisosString = "ab";
		Siviso sivisoA = mock(Siviso.class);
		Siviso sivisoB = mock(Siviso.class);
		Siviso[] sivisos = new Siviso[]{sivisoA, sivisoB};
		String sivisosEditedString = "abVibrate";
		
		Activity activity = mock(Activity.class);
		Ringmodes ringmodes = mock(Ringmodes.class);
		Wrapper_Gson gson = mock(Wrapper_Gson.class);
		SharedPreferences sharedPreferences = mock(SharedPreferences.class);
		SharedPreferences.Editor editor1 = mock(SharedPreferences.Editor.class);
		SharedPreferences.Editor editor2 = mock(SharedPreferences.Editor.class);
		when(activity.getSharedPreferences(Database_Siviso.SHARED_PREFERENCES_ID, Context.MODE_PRIVATE)).thenReturn(sharedPreferences);
		when(sharedPreferences.getString(Database_Siviso.SIVISOS_ID, "")).thenReturn(sivisosString);
		when(gson.fromJson(sivisosString)).thenReturn(sivisos);
		when(gson.toJsonString(sivisos)).thenReturn(sivisosEditedString);
		when(activity.getSharedPreferences(Database_Siviso.SHARED_PREFERENCES_ID, Context.MODE_PRIVATE)).thenReturn(sharedPreferences);
		when(sharedPreferences.edit()).thenReturn(editor1);
		when(editor1.putString(Database_Siviso.SIVISOS_ID, sivisosEditedString)).thenReturn(editor2);
		
		Database_Siviso database = new Database_Siviso(activity, ringmodes, gson);
		database.setRingmode(sivisoIndex, ringmode);
		
		verify(sivisoB, times(1)).setRingmode(ringmode);
		verify(editor2, times(1)).apply();
	}
	
	@Test
	public void setRingmode_0Silent_siviso0RingmodeSilentAndSharedPreferencesPut()
	{
		int sivisoIndex = 0;
		Ringmode ringmode = Ringmode.SILENT;
		String sivisosString = "a";
		Siviso sivisoA = mock(Siviso.class);
		Siviso[] sivisos = new Siviso[]{sivisoA};
		String sivisosEditedString = "aSilent";
		
		Activity activity = mock(Activity.class);
		Ringmodes ringmodes = mock(Ringmodes.class);
		Wrapper_Gson gson = mock(Wrapper_Gson.class);
		SharedPreferences sharedPreferences = mock(SharedPreferences.class);
		SharedPreferences.Editor editor1 = mock(SharedPreferences.Editor.class);
		SharedPreferences.Editor editor2 = mock(SharedPreferences.Editor.class);
		when(activity.getSharedPreferences(Database_Siviso.SHARED_PREFERENCES_ID, Context.MODE_PRIVATE)).thenReturn(sharedPreferences);
		when(sharedPreferences.getString(Database_Siviso.SIVISOS_ID, "")).thenReturn(sivisosString);
		when(gson.fromJson(sivisosString)).thenReturn(sivisos);
		when(gson.toJsonString(sivisos)).thenReturn(sivisosEditedString);
		when(activity.getSharedPreferences(Database_Siviso.SHARED_PREFERENCES_ID, Context.MODE_PRIVATE)).thenReturn(sharedPreferences);
		when(sharedPreferences.edit()).thenReturn(editor1);
		when(editor1.putString(Database_Siviso.SIVISOS_ID, sivisosEditedString)).thenReturn(editor2);
		
		Database_Siviso database = new Database_Siviso(activity, ringmodes, gson);
		database.setRingmode(sivisoIndex, ringmode);
		
		verify(sivisoA, times(1)).setRingmode(ringmode);
		verify(editor2, times(1)).apply();
	}
	
	@Test
	public void sivisos_gsonSharedPreferencesaA_Asivisos()
	{
		String sivisosString = "a";
		Siviso sivisoA = mock(Siviso.class);
		Siviso[] sivisos = new Siviso[]{sivisoA};
		
		Activity activity = mock(Activity.class);
		Ringmodes ringmodes = mock(Ringmodes.class);
		Wrapper_Gson gson = mock(Wrapper_Gson.class);
		SharedPreferences sharedPreferences = mock(SharedPreferences.class);
		when(activity.getSharedPreferences(Database_Siviso.SHARED_PREFERENCES_ID, Context.MODE_PRIVATE)).thenReturn(sharedPreferences);
		when(sharedPreferences.getString(Database_Siviso.SIVISOS_ID, "")).thenReturn(sivisosString);
		when(gson.fromJson(sivisosString)).thenReturn(sivisos);
		
		Database_Siviso database = new Database_Siviso(activity, ringmodes, gson);
		
		Siviso[] actualSivisos = database.sivisos();
		assertArrayEquals(sivisos, actualSivisos);
	}
	
	@Test
	public void sivisos_gsonSharedPreferences_0sivisos()
	{
		String sivisosString = "";
		Siviso[] sivisos = new Siviso[0];
		
		Activity activity = mock(Activity.class);
		Ringmodes ringmodes = mock(Ringmodes.class);
		Wrapper_Gson gson = mock(Wrapper_Gson.class);
		SharedPreferences sharedPreferences = mock(SharedPreferences.class);
		when(activity.getSharedPreferences(Database_Siviso.SHARED_PREFERENCES_ID, Context.MODE_PRIVATE)).thenReturn(sharedPreferences);
		when(sharedPreferences.getString(Database_Siviso.SIVISOS_ID, "")).thenReturn(sivisosString);
		when(gson.fromJson(sivisosString)).thenReturn(sivisos);
		
		Database_Siviso database = new Database_Siviso(activity, ringmodes, gson);
		
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
		Ringmodes ringmodes = mock(Ringmodes.class);
		
		Database_Siviso database = new Database_Siviso(activity, ringmodes,
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
		Ringmodes ringmodes = mock(Ringmodes.class);
		
		Database_Siviso database = new Database_Siviso(activity, ringmodes,
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
		Ringmodes ringmodes = mock(Ringmodes.class);
		
		Database_Siviso database = new Database_Siviso(activity, ringmodes,
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
		Ringmodes ringmodes = mock(Ringmodes.class);
		when(ringmodes.from(ringmode.ordinal())).thenReturn(ringmode);
		
		Database_Siviso database = new Database_Siviso(activity, ringmodes,
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
		Ringmodes ringmodes = mock(Ringmodes.class);
		when(ringmodes.from(ringmode.ordinal())).thenReturn(ringmode);
		
		Database_Siviso database = new Database_Siviso(activity, ringmodes,
		                                               null);
		
		Ringmode actualRingmode = database.defaultRingmode();
		assertEquals(ringmode, actualRingmode);
	}
}