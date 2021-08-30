package com.jordan.betcher.siviso.siviso.database;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.Test;

public class Test$Database_Siviso
{
	@Test
	public void defaultRingmode_savedSilent_Silent()
	{
		Ringmode ringmode = Ringmode.SILENT;
		UseSharedPreferences useSharedPreferences = mock(UseSharedPreferences.class);
		when(useSharedPreferences.defaultRingmode()).thenReturn(ringmode);
		
		Database_Siviso database = new Database_Siviso(useSharedPreferences);
		
		Ringmode actualRingmode = database.defaultRingmode();
		assertEquals(ringmode, actualRingmode);
	}
}