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
	public void sivisos_B_returnSiviso1()
	{
		String string = "B";
		Activity activity = mock(Activity.class);
		SharedPreferences sharedPreferences = mock(SharedPreferences.class);
		Ringmodes ringmodes = mock(Ringmodes.class);
		SivisosCreator sivisosCreator = mock(SivisosCreator.class);
		Siviso siviso1 = mock(Siviso.class);
		Siviso[] list = new Siviso[]{siviso1};
		when(activity.getSharedPreferences(Database_Siviso.SHARED_PREFERENCES_ID, Context.MODE_PRIVATE)).thenReturn(sharedPreferences);
		when(sharedPreferences.getString(Database_Siviso.SIVISOS_ID, "")).thenReturn(string);
		when(sivisosCreator.from(string)).thenReturn(list);
		
		Database_Siviso database = new Database_Siviso(activity, ringmodes, sivisosCreator);
		Siviso[] actualList = database.sivisos();
		
		assertArrayEquals(list, actualList);
	}
	
	@Test
	public void sivisos_A_returnSiviso1()
	{
		String string = "A";
		Activity activity = mock(Activity.class);
		SharedPreferences sharedPreferences = mock(SharedPreferences.class);
		Ringmodes ringmodes = mock(Ringmodes.class);
		SivisosCreator sivisosCreator = mock(SivisosCreator.class);
		Siviso siviso1 = mock(Siviso.class);
		Siviso[] list = new Siviso[]{siviso1};
		when(activity.getSharedPreferences(Database_Siviso.SHARED_PREFERENCES_ID, Context.MODE_PRIVATE)).thenReturn(sharedPreferences);
		when(sharedPreferences.getString(Database_Siviso.SIVISOS_ID, "")).thenReturn(string);
		when(sivisosCreator.from(string)).thenReturn(list);
		
		Database_Siviso database = new Database_Siviso(activity, ringmodes, sivisosCreator);
		Siviso[] actualList = database.sivisos();
		
		assertArrayEquals(list, actualList);
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