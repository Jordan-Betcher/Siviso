package com.jordan.betcher.siviso.siviso.database;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.Test;
import org.mockito.InOrder;
import org.mockito.Mockito;

public class Test$Database_Siviso
{
	@Test
	public void setRingmode__1getSivisos()
	{
		int index = 0;
		Ringmode ringmode = Ringmode.SILENT;
		Siviso sivisoA = mock(Siviso.class);
		Siviso sivisoB = mock(Siviso.class);
		Siviso[] sivisos = new Siviso[]{sivisoA, sivisoB};
		UseSharedPreferences useSharedPreferences = mock(UseSharedPreferences.class);
		when(useSharedPreferences.sivisos()).thenReturn(sivisos);
		
		Database_Siviso database = new Database_Siviso(useSharedPreferences);
		database.setRingmode(index, ringmode);
		
		verify(useSharedPreferences, times(1)).sivisos();
	}
	
	@Test
	public void setRingmode__editRingmodeThenSave()
	{
		int index = 0;
		Ringmode ringmode = Ringmode.SILENT;
		Siviso sivisoA = mock(Siviso.class);
		Siviso sivisoB = mock(Siviso.class);
		Siviso[] sivisos = new Siviso[]{sivisoA, sivisoB};
		UseSharedPreferences useSharedPreferences = mock(UseSharedPreferences.class);
		when(useSharedPreferences.sivisos()).thenReturn(sivisos);
		
		Database_Siviso database = new Database_Siviso(useSharedPreferences);
		database.setRingmode(index, ringmode);
		
		InOrder inOrder = Mockito.inOrder(sivisoA, useSharedPreferences);
		inOrder.verify(sivisoA, times(1)).setRingmode(ringmode);
		inOrder.verify(useSharedPreferences, times(1)).setSivisos(sivisos);
	}
	
	@Test
	public void sivisos_savedABSivisos_ABSivisos()
	{
		Siviso sivisoA = mock(Siviso.class);
		Siviso sivisoB = mock(Siviso.class);
		Siviso[] sivisos = new Siviso[]{sivisoA, sivisoB};
		UseSharedPreferences useSharedPreferences = mock(UseSharedPreferences.class);
		when(useSharedPreferences.sivisos()).thenReturn(sivisos);
		
		Database_Siviso database = new Database_Siviso(useSharedPreferences);
		
		Siviso[] actualSivisos = database.sivisos();
		assertArrayEquals(sivisos, actualSivisos);
	}
	
	@Test
	public void setDefaultRingmode_Vibrate_saveVibrate()
	{
		Ringmode ringmode = Ringmode.VIBRATE;
		UseSharedPreferences useSharedPreferences = mock(UseSharedPreferences.class);
		
		Database_Siviso database = new Database_Siviso(useSharedPreferences);
		
		database.setDefaultRingmode(ringmode);
		verify(useSharedPreferences,times(1)).setDefaultRingmode(ringmode);
	}
	
	@Test
	public void setDefaultRingmode_Silent_saveSilent()
	{
		Ringmode ringmode = Ringmode.SILENT;
		UseSharedPreferences useSharedPreferences = mock(UseSharedPreferences.class);
		
		Database_Siviso database = new Database_Siviso(useSharedPreferences);
		
		database.setDefaultRingmode(ringmode);
		verify(useSharedPreferences,times(1)).setDefaultRingmode(ringmode);
	}
	
	@Test
	public void defaultRingmode_savedVibrate_Vibrate()
	{
		Ringmode ringmode = Ringmode.VIBRATE;
		UseSharedPreferences useSharedPreferences = mock(UseSharedPreferences.class);
		when(useSharedPreferences.defaultRingmode()).thenReturn(ringmode);
		
		Database_Siviso database = new Database_Siviso(useSharedPreferences);
		
		Ringmode actualRingmode = database.defaultRingmode();
		assertEquals(ringmode, actualRingmode);
	}
	
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