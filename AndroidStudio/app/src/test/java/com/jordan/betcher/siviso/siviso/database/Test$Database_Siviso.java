package com.jordan.betcher.siviso.siviso.database;

import static org.junit.Assert.assertArrayEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.Test;

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
}