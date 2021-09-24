package com.jordan.betcher.siviso.siviso.database;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.mockito.ArgumentMatchers.any;
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
	public void delete_2siviso0_0saveSiviso()
	{
		int deleteIndex = 2;
		Siviso siviso0 = mock(Siviso.class);
		Siviso[] sivisos = new Siviso[]{siviso0};
		UseSharedPreferences useSharedPreferences = mock(UseSharedPreferences.class);
		when(useSharedPreferences.sivisos()).thenReturn(sivisos);
		
		Database_Siviso database_siviso = new Database_Siviso(useSharedPreferences);
		database_siviso.delete(deleteIndex);
		
		verify(useSharedPreferences,times(0)).setSivisos(any());
	}
	
	@Test
	public void delete_1siviso0_0saveSiviso()
	{
		int deleteIndex = 1;
		Siviso siviso0 = mock(Siviso.class);
		Siviso[] sivisos = new Siviso[]{siviso0};
		UseSharedPreferences useSharedPreferences = mock(UseSharedPreferences.class);
		when(useSharedPreferences.sivisos()).thenReturn(sivisos);
		
		Database_Siviso database_siviso = new Database_Siviso(useSharedPreferences);
		database_siviso.delete(deleteIndex);
		
		verify(useSharedPreferences,times(0)).setSivisos(any());
	}
	
	@Test
	public void delete_0siviso0siviso2_saveSiviso1Siviso2()
	{
		int deleteIndex = 0;
		Siviso siviso0 = mock(Siviso.class);
		Siviso siviso1 = mock(Siviso.class);
		Siviso siviso2 = mock(Siviso.class);
		Siviso[] sivisos = new Siviso[]{siviso0, siviso1, siviso2};
		Siviso[] newSivisos = new Siviso[]{siviso1, siviso2};
		UseSharedPreferences useSharedPreferences = mock(UseSharedPreferences.class);
		when(useSharedPreferences.sivisos()).thenReturn(sivisos);
		
		Database_Siviso database_siviso = new Database_Siviso(useSharedPreferences);
		database_siviso.delete(deleteIndex);
		
		verify(useSharedPreferences,times(1)).setSivisos(newSivisos);
	}
	
	@Test
	public void delete_1siviso0siviso1_saveSiviso0()
	{
		int deleteIndex = 1;
		Siviso siviso0 = mock(Siviso.class);
		Siviso siviso1 = mock(Siviso.class);
		Siviso[] sivisos = new Siviso[]{siviso0, siviso1};
		Siviso[] newSivisos = new Siviso[]{siviso0};
		UseSharedPreferences useSharedPreferences = mock(UseSharedPreferences.class);
		when(useSharedPreferences.sivisos()).thenReturn(sivisos);
		
		Database_Siviso database_siviso = new Database_Siviso(useSharedPreferences);
		database_siviso.delete(deleteIndex);
		
		verify(useSharedPreferences,times(1)).setSivisos(newSivisos);
	}
	
	@Test
	public void delete_0siviso0siviso1_saveSiviso1()
	{
		int deleteIndex = 0;
		Siviso siviso0 = mock(Siviso.class);
		Siviso siviso1 = mock(Siviso.class);
		Siviso[] sivisos = new Siviso[]{siviso0, siviso1};
		Siviso[] newSivisos = new Siviso[]{siviso1};
		UseSharedPreferences useSharedPreferences = mock(UseSharedPreferences.class);
		when(useSharedPreferences.sivisos()).thenReturn(sivisos);
		
		Database_Siviso database_siviso = new Database_Siviso(useSharedPreferences);
		database_siviso.delete(deleteIndex);
		
		verify(useSharedPreferences,times(1)).setSivisos(newSivisos);
	}
	
	@Test
	public void delete_0siviso0_save0Siviso()
	{
		int deleteIndex = 0;
		Siviso siviso0 = mock(Siviso.class);
		Siviso[] sivisos = new Siviso[]{siviso0};
		Siviso[] newSivisos = new Siviso[]{};
		UseSharedPreferences useSharedPreferences = mock(UseSharedPreferences.class);
		when(useSharedPreferences.sivisos()).thenReturn(sivisos);
		
		Database_Siviso database_siviso = new Database_Siviso(useSharedPreferences);
		database_siviso.delete(deleteIndex);
		
		verify(useSharedPreferences,times(1)).setSivisos(newSivisos);
	}
	
	@Test
	public void addOnDataChange_onDataChange_addOnDataChange()
	{
		UseSharedPreferences useSharedPreferences = mock(UseSharedPreferences.class);
		OnSharedPreferenceChangeListener_OnChangeEvent onChangeEvent = mock(OnSharedPreferenceChangeListener_OnChangeEvent.class);
		when(useSharedPreferences.onChangeEvent()).thenReturn(onChangeEvent);
		OnDataChange onDataChange = mock(OnDataChange.class);
		
		Database_Siviso database = new Database_Siviso(useSharedPreferences);
		database.addOnDataChange(onDataChange);
		
		verify(onChangeEvent, times(1)).add(onDataChange);
	}
	
	@Test
	public void save_SivisoB_setSivisoASivisoB()
	{
		Siviso sivisoA = mock(Siviso.class);
		Siviso sivisoB = mock(Siviso.class);
		Siviso[] sivisos = new Siviso[]{sivisoA};
		Siviso[] newSivisos = new Siviso[]{sivisoA, sivisoB};
		UseSharedPreferences useSharedPreferences = mock(UseSharedPreferences.class);
		when(useSharedPreferences.sivisos()).thenReturn(sivisos);
		
		Database_Siviso database = new Database_Siviso(useSharedPreferences);
		database.save(sivisoB);
		
		verify(useSharedPreferences, times(1)).setSivisos(newSivisos);
	}
	
	@Test
	public void save_SivisoA_setSivisoA()
	{
		Siviso sivisoA = mock(Siviso.class);
		Siviso[] sivisos = new Siviso[]{};
		Siviso[] newSivisos = new Siviso[]{sivisoA};
		UseSharedPreferences useSharedPreferences = mock(UseSharedPreferences.class);
		when(useSharedPreferences.sivisos()).thenReturn(sivisos);
		
		Database_Siviso database = new Database_Siviso(useSharedPreferences);
		database.save(sivisoA);
		
		verify(useSharedPreferences, times(1)).setSivisos(newSivisos);
	}
	
	@Test
	public void setRingmode_1Silent_changeSiviso1RingmodeSilent()
	{
		int index = 1;
		Ringmode ringmode = Ringmode.SILENT;
		Siviso sivisoA = mock(Siviso.class);
		Siviso sivisoB = mock(Siviso.class);
		Siviso[] sivisos = new Siviso[]{sivisoA, sivisoB};
		UseSharedPreferences useSharedPreferences = mock(UseSharedPreferences.class);
		when(useSharedPreferences.sivisos()).thenReturn(sivisos);
		
		Database_Siviso database = new Database_Siviso(useSharedPreferences);
		database.setRingmode(index, ringmode);
		
		verify(sivisoB, times(1)).setRingmode(ringmode);
	}
	
	@Test
	public void setRingmode_0Vibrate_changeSiviso0RingmodeVibrate()
	{
		int index = 0;
		Ringmode ringmode = Ringmode.VIBRATE;
		Siviso sivisoA = mock(Siviso.class);
		Siviso sivisoB = mock(Siviso.class);
		Siviso[] sivisos = new Siviso[]{sivisoA, sivisoB};
		UseSharedPreferences useSharedPreferences = mock(UseSharedPreferences.class);
		when(useSharedPreferences.sivisos()).thenReturn(sivisos);
		
		Database_Siviso database = new Database_Siviso(useSharedPreferences);
		database.setRingmode(index, ringmode);
		
		verify(sivisoA, times(1)).setRingmode(ringmode);
	}
	
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