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
	public void sivisos_abValid_2siviso()
	{
		String section1 = "a";
		String section2 = "b";
		String[] sections = new String[]{section1, section2};
		String fullSivisoString = String.format("{%s,%s}", section1, section2);
		boolean section1Valid = true;
		boolean section2Valid = true;
		Siviso siviso1 = mock(Siviso.class);
		Siviso siviso2 = mock(Siviso.class);
		Siviso[] sivisos = new Siviso[]{siviso1, siviso2};
		
		Activity activity = mock(Activity.class);
		Ringmodes ringmodes = mock(Ringmodes.class);
		SivisoCreator sivisoCreator = mock(SivisoCreator.class);
		SharedPreferences sharedPreferences = mock(SharedPreferences.class);
		when(activity.getSharedPreferences(Database_Siviso.SHARED_PREFERENCES_ID, Context.MODE_PRIVATE)).thenReturn(sharedPreferences);
		when(sharedPreferences.getString(Database_Siviso.SIVISOS_ID, "")).thenReturn(fullSivisoString);
		when(sivisoCreator.sectionsFrom(fullSivisoString)).thenReturn(sections);
		when(sivisoCreator.isValidSection(section1)).thenReturn(section1Valid);
		when(sivisoCreator.isValidSection(section2)).thenReturn(section2Valid);
		when(sivisoCreator.sivisoFrom(section1)).thenReturn(siviso1);
		when(sivisoCreator.sivisoFrom(section2)).thenReturn(siviso2);
		
		Database_Siviso database = new Database_Siviso(activity, ringmodes, sivisoCreator);
		
		Siviso[] actualSivisos = database.sivisos();
		assertArrayEquals(sivisos, actualSivisos);
	}
	
	
	@Test
	public void sivisos_aValid_siviso()
	{
		String section1 = "a";
		String[] sections = new String[]{section1};
		String fullSivisoString = String.format("{%s}", section1);
		boolean section1Valid = true;
		Siviso siviso1 = mock(Siviso.class);
		Siviso[] sivisos = new Siviso[]{siviso1};
		
		Activity activity = mock(Activity.class);
		Ringmodes ringmodes = mock(Ringmodes.class);
		SivisoCreator sivisoCreator = mock(SivisoCreator.class);
		SharedPreferences sharedPreferences = mock(SharedPreferences.class);
		when(activity.getSharedPreferences(Database_Siviso.SHARED_PREFERENCES_ID, Context.MODE_PRIVATE)).thenReturn(sharedPreferences);
		when(sharedPreferences.getString(Database_Siviso.SIVISOS_ID, "")).thenReturn(fullSivisoString);
		when(sivisoCreator.sectionsFrom(fullSivisoString)).thenReturn(sections);
		when(sivisoCreator.isValidSection(section1)).thenReturn(section1Valid);
		when(sivisoCreator.sivisoFrom(section1)).thenReturn(siviso1);
		
		Database_Siviso database = new Database_Siviso(activity, ringmodes, sivisoCreator);
		
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