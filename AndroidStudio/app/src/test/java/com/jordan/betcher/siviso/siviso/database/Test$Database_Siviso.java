package com.jordan.betcher.siviso.siviso.database;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;

import org.junit.Test;

public class Test$Database_Siviso
{
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
		
		Database_Siviso database = new Database_Siviso(activity,ringmodeConverter);
		
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
		
		Database_Siviso database = new Database_Siviso(activity, ringmodeConverter);
		
		Ringmode actualRingmode = database.defaultRingmode();
		assertEquals(ringmode, actualRingmode);
	}
}