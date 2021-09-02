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

public class Test$UseSharedPreferences
{
	@Test
	public void _onChangeEvent_registerOnSharedPreferences()
	{
		Activity activity = mock(Activity.class);
		SharedPreferences sharedPreferences = mock(SharedPreferences.class);
		when(activity.getSharedPreferences(UseSharedPreferences.SHARED_PREFERENCES_ID, Context.MODE_PRIVATE)).thenReturn(sharedPreferences);
		OnSharedPreferenceChangeListener_OnChangeEvent onChangeEvent = mock(OnSharedPreferenceChangeListener_OnChangeEvent.class);
		
		new UseSharedPreferences(activity, null,null, onChangeEvent);
		
		verify(sharedPreferences, times(1)).registerOnSharedPreferenceChangeListener(onChangeEvent);
	}
	
	@Test
	public void onChangeEvent__returnOnChangeEvent()
	{
		Activity activity = mock(Activity.class);
		SharedPreferences sharedPreferences = mock(SharedPreferences.class);
		when(activity.getSharedPreferences(UseSharedPreferences.SHARED_PREFERENCES_ID, Context.MODE_PRIVATE)).thenReturn(sharedPreferences);
		OnSharedPreferenceChangeListener_OnChangeEvent onChangeEvent = mock(OnSharedPreferenceChangeListener_OnChangeEvent.class);
		
		UseSharedPreferences database = new UseSharedPreferences(activity, null,
		                                                         null, onChangeEvent);
		
		OnSharedPreferenceChangeListener_OnChangeEvent actualOnChangeEvent = database.onChangeEvent();
		assertEquals(onChangeEvent, actualOnChangeEvent);
	}
	
	@Test
	public void sivisos_gsonReturnsNull_EmptySivisoArray()
	{
		String sivisosString = "";
		Siviso[] sivisos = new Siviso[0];
		
		Activity activity = mock(Activity.class);
		Ringmodes ringmodes = mock(Ringmodes.class);
		Wrapper_Gson gson = mock(Wrapper_Gson.class);
		SharedPreferences sharedPreferences = mock(SharedPreferences.class);
		when(activity.getSharedPreferences(UseSharedPreferences.SHARED_PREFERENCES_ID, Context.MODE_PRIVATE)).thenReturn(sharedPreferences);
		when(sharedPreferences.getString(UseSharedPreferences.SIVISOS_ID, "")).thenReturn(sivisosString);
		when(gson.fromJson(sivisosString)).thenReturn(null);
		OnSharedPreferenceChangeListener_OnChangeEvent onChangeEvent = mock(OnSharedPreferenceChangeListener_OnChangeEvent.class);
		
		UseSharedPreferences database = new UseSharedPreferences(activity, ringmodes, gson,
		                                                         onChangeEvent);
		
		Siviso[] actualSivisos = database.sivisos();
		assertArrayEquals(sivisos, actualSivisos);
	}
	
	@Test
	public void setRingmode_1VIBRATE_siviso1RingmodeVibrateAndSharedPreferencesPut()
	{
		Siviso sivisoA = mock(Siviso.class);
		Siviso sivisoB = mock(Siviso.class);
		Siviso[] sivisos = new Siviso[]{sivisoA, sivisoB};
		String sivisosEditedString = "abVibrate";
		OnSharedPreferenceChangeListener_OnChangeEvent onChangeEvent = mock(OnSharedPreferenceChangeListener_OnChangeEvent.class);
		
		Activity activity = mock(Activity.class);
		Ringmodes ringmodes = mock(Ringmodes.class);
		Wrapper_Gson gson = mock(Wrapper_Gson.class);
		SharedPreferences sharedPreferences = mock(SharedPreferences.class);
		SharedPreferences.Editor editor1 = mock(SharedPreferences.Editor.class);
		SharedPreferences.Editor editor2 = mock(SharedPreferences.Editor.class);
		when(gson.toJsonString(sivisos)).thenReturn(sivisosEditedString);
		when(activity.getSharedPreferences(UseSharedPreferences.SHARED_PREFERENCES_ID, Context.MODE_PRIVATE)).thenReturn(sharedPreferences);
		when(sharedPreferences.edit()).thenReturn(editor1);
		when(editor1.putString(UseSharedPreferences.SIVISOS_ID, sivisosEditedString)).thenReturn(editor2);
		
		UseSharedPreferences database = new UseSharedPreferences(activity, ringmodes, gson,
		                                                         onChangeEvent);
		database.setSivisos(sivisos);
		
		verify(editor2, times(1)).apply();
	}
	
	@Test
	public void setRingmode_0Silent_siviso0RingmodeSilentAndSharedPreferencesPut()
	{
		Siviso sivisoA = mock(Siviso.class);
		Siviso[] sivisos = new Siviso[]{sivisoA};
		String sivisosEditedString = "aSilent";
		
		Activity activity = mock(Activity.class);
		Ringmodes ringmodes = mock(Ringmodes.class);
		Wrapper_Gson gson = mock(Wrapper_Gson.class);
		SharedPreferences sharedPreferences = mock(SharedPreferences.class);
		SharedPreferences.Editor editor1 = mock(SharedPreferences.Editor.class);
		SharedPreferences.Editor editor2 = mock(SharedPreferences.Editor.class);
		when(gson.toJsonString(sivisos)).thenReturn(sivisosEditedString);
		when(activity.getSharedPreferences(UseSharedPreferences.SHARED_PREFERENCES_ID, Context.MODE_PRIVATE)).thenReturn(sharedPreferences);
		when(sharedPreferences.edit()).thenReturn(editor1);
		when(editor1.putString(UseSharedPreferences.SIVISOS_ID, sivisosEditedString)).thenReturn(editor2);
		OnSharedPreferenceChangeListener_OnChangeEvent onChangeEvent = mock(OnSharedPreferenceChangeListener_OnChangeEvent.class);
		
		UseSharedPreferences database = new UseSharedPreferences(activity, ringmodes, gson,
		                                                         onChangeEvent);
		database.setSivisos(sivisos);
		
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
		when(activity.getSharedPreferences(UseSharedPreferences.SHARED_PREFERENCES_ID, Context.MODE_PRIVATE)).thenReturn(sharedPreferences);
		when(sharedPreferences.getString(UseSharedPreferences.SIVISOS_ID, "")).thenReturn(sivisosString);
		when(gson.fromJson(sivisosString)).thenReturn(sivisos);
		OnSharedPreferenceChangeListener_OnChangeEvent onChangeEvent = mock(OnSharedPreferenceChangeListener_OnChangeEvent.class);
		
		UseSharedPreferences database = new UseSharedPreferences(activity, ringmodes, gson,
		                                                         onChangeEvent);
		
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
		when(activity.getSharedPreferences(UseSharedPreferences.SHARED_PREFERENCES_ID, Context.MODE_PRIVATE)).thenReturn(sharedPreferences);
		when(sharedPreferences.getString(UseSharedPreferences.SIVISOS_ID, "")).thenReturn(sivisosString);
		when(gson.fromJson(sivisosString)).thenReturn(sivisos);
		OnSharedPreferenceChangeListener_OnChangeEvent onChangeEvent = mock(OnSharedPreferenceChangeListener_OnChangeEvent.class);
		
		UseSharedPreferences database = new UseSharedPreferences(activity, ringmodes, gson,
		                                                         onChangeEvent);
		
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
		when(editor1.putInt(UseSharedPreferences.DEFAULT_RINGMODE_ID, ringmode.ordinal())).thenReturn(editor2);
		Activity activity = mock(Activity.class);
		when(activity.getSharedPreferences(UseSharedPreferences.SHARED_PREFERENCES_ID, Context.MODE_PRIVATE)).thenReturn(sharedPreferences);
		Ringmodes ringmodes = mock(Ringmodes.class);
		OnSharedPreferenceChangeListener_OnChangeEvent onChangeEvent = mock(OnSharedPreferenceChangeListener_OnChangeEvent.class);
		
		UseSharedPreferences database = new UseSharedPreferences(activity, ringmodes,
		                                                         null, onChangeEvent);
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
		when(editor1.putInt(UseSharedPreferences.DEFAULT_RINGMODE_ID, ringmode.ordinal())).thenReturn(editor2);
		Activity activity = mock(Activity.class);
		when(activity.getSharedPreferences(UseSharedPreferences.SHARED_PREFERENCES_ID, Context.MODE_PRIVATE)).thenReturn(sharedPreferences);
		Ringmodes ringmodes = mock(Ringmodes.class);
		OnSharedPreferenceChangeListener_OnChangeEvent onChangeEvent = mock(OnSharedPreferenceChangeListener_OnChangeEvent.class);
		
		UseSharedPreferences database = new UseSharedPreferences(activity, ringmodes,
		                                                         null, onChangeEvent);
		
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
		when(editor1.putInt(UseSharedPreferences.DEFAULT_RINGMODE_ID, ringmode.ordinal())).thenReturn(editor2);
		Activity activity = mock(Activity.class);
		when(activity.getSharedPreferences(UseSharedPreferences.SHARED_PREFERENCES_ID, Context.MODE_PRIVATE)).thenReturn(sharedPreferences);
		Ringmodes ringmodes = mock(Ringmodes.class);
		OnSharedPreferenceChangeListener_OnChangeEvent onChangeEvent = mock(OnSharedPreferenceChangeListener_OnChangeEvent.class);
		
		UseSharedPreferences database = new UseSharedPreferences(activity, ringmodes,
		                                                         null, onChangeEvent);
		database.setDefaultRingmode(ringmode);
		
		verify(editor2, times(1)).apply();
	}
	
	@Test
	public void defaultRingmode_sharedPreferencesDefaultRingmodeVIBRATE_VIBRATE()
	{
		Ringmode ringmode = Ringmode.VIBRATE;
		SharedPreferences sharedPreferences = mock(SharedPreferences.class);
		when(sharedPreferences.getInt(UseSharedPreferences.DEFAULT_RINGMODE_ID, 0)).thenReturn(ringmode.ordinal());
		Activity activity = mock(Activity.class);
		when(activity.getSharedPreferences(UseSharedPreferences.SHARED_PREFERENCES_ID, Context.MODE_PRIVATE)).thenReturn(sharedPreferences);
		Ringmodes ringmodes = mock(Ringmodes.class);
		when(ringmodes.from(ringmode.ordinal())).thenReturn(ringmode);
		OnSharedPreferenceChangeListener_OnChangeEvent onChangeEvent = mock(OnSharedPreferenceChangeListener_OnChangeEvent.class);
		
		UseSharedPreferences database = new UseSharedPreferences(activity, ringmodes,
		                                                         null, onChangeEvent);
		
		Ringmode actualRingmode = database.defaultRingmode();
		assertEquals(ringmode, actualRingmode);
	}
	
	@Test
	public void defaultRingmode_sharedPreferencesDefaultRingmodeSILENT_SILENT()
	{
		Ringmode ringmode = Ringmode.SILENT;
		SharedPreferences sharedPreferences = mock(SharedPreferences.class);
		when(sharedPreferences.getInt(UseSharedPreferences.DEFAULT_RINGMODE_ID, 0)).thenReturn(ringmode.ordinal());
		Activity activity = mock(Activity.class);
		when(activity.getSharedPreferences(UseSharedPreferences.SHARED_PREFERENCES_ID, Context.MODE_PRIVATE)).thenReturn(sharedPreferences);
		Ringmodes ringmodes = mock(Ringmodes.class);
		when(ringmodes.from(ringmode.ordinal())).thenReturn(ringmode);
		OnSharedPreferenceChangeListener_OnChangeEvent onChangeEvent = mock(OnSharedPreferenceChangeListener_OnChangeEvent.class);
		
		UseSharedPreferences database = new UseSharedPreferences(activity, ringmodes,
		                                                         null, onChangeEvent);
		
		Ringmode actualRingmode = database.defaultRingmode();
		assertEquals(ringmode, actualRingmode);
	}
}