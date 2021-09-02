package com.jordan.betcher.siviso.siviso.database;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import com.google.android.gms.maps.model.LatLng;

import org.junit.Test;
import org.mockito.InOrder;
import org.mockito.Mockito;

public class Test$Database_Siviso
{
	
	@Test
	public void setRingmode_onDataChange_callDataChanged()
	{
		int index = 1;
		Ringmode ringmode = Ringmode.SILENT;
		Siviso sivisoA = mock(Siviso.class);
		Siviso sivisoB = mock(Siviso.class);
		Siviso[] sivisos = new Siviso[]{sivisoA, sivisoB};
		UseSharedPreferences useSharedPreferences = mock(UseSharedPreferences.class);
		when(useSharedPreferences.sivisos()).thenReturn(sivisos);
		OnDataChange onDataChange = mock(OnDataChange.class);
		
		Database_Siviso database = new Database_Siviso(useSharedPreferences);
		database.addOnDataChange(onDataChange);
		database.setRingmode(index, ringmode);
		
		verify(onDataChange, times(1)).dataChanged();
	}
	
	@Test
	public void setDefaultRingmode_onDataChange1onDataChange2_callOnDataChange2()
	{
		Ringmode ringmode = Ringmode.VIBRATE;
		UseSharedPreferences useSharedPreferences = mock(UseSharedPreferences.class);
		OnDataChange onDataChange1 = mock(OnDataChange.class);
		OnDataChange onDataChange2 = mock(OnDataChange.class);
		
		Database_Siviso database = new Database_Siviso(useSharedPreferences);
		database.addOnDataChange(onDataChange1);
		database.addOnDataChange(onDataChange2);
		database.setDefaultRingmode(ringmode);
		
		verify(onDataChange2, times(1)).dataChanged();
	}
	
	@Test
	public void setDefaultRingmode_onDataChange1onDataChange2_callOnDataChange1()
	{
		Ringmode ringmode = Ringmode.VIBRATE;
		UseSharedPreferences useSharedPreferences = mock(UseSharedPreferences.class);
		OnDataChange onDataChange1 = mock(OnDataChange.class);
		OnDataChange onDataChange2 = mock(OnDataChange.class);
		
		Database_Siviso database = new Database_Siviso(useSharedPreferences);
		database.addOnDataChange(onDataChange1);
		database.addOnDataChange(onDataChange2);
		database.setDefaultRingmode(ringmode);
		
		verify(onDataChange1, times(1)).dataChanged();
	}
	
	@Test
	public void addOnDataChange__0callOnDataChange()
	{
		UseSharedPreferences useSharedPreferences = mock(UseSharedPreferences.class);
		OnDataChange onDataChange = mock(OnDataChange.class);
		
		Database_Siviso database = new Database_Siviso(useSharedPreferences);
		database.addOnDataChange(onDataChange);
		
		verify(onDataChange, times(0)).dataChanged();
	}
	
	@Test
	public void setDefaultRingmode_onDataChange_callOnDataChange()
	{
		Ringmode ringmode = Ringmode.VIBRATE;
		UseSharedPreferences useSharedPreferences = mock(UseSharedPreferences.class);
		OnDataChange onDataChange = mock(OnDataChange.class);
		
		Database_Siviso database = new Database_Siviso(useSharedPreferences);
		database.addOnDataChange(onDataChange);
		database.setDefaultRingmode(ringmode);
		
		verify(onDataChange, times(1)).dataChanged();
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
	public void delete_LatLng00SivisoAHas01SivisoBHas01_0delete()
	{
		LatLng latLng = new LatLng(0, 0);
		
		Siviso sivisoA = mock(Siviso.class);
		LatLng latLngA = new LatLng(0, 1);
		when(sivisoA.latLng()).thenReturn(latLngA);
		
		Siviso sivisoB = mock(Siviso.class);
		LatLng latLngB = new LatLng(0, 1);
		when(sivisoB.latLng()).thenReturn(latLngB);
		
		UseSharedPreferences useSharedPreferences = mock(UseSharedPreferences.class);
		Siviso[] sivisos = new Siviso[]{sivisoA, sivisoB};
		when(useSharedPreferences.sivisos()).thenReturn(sivisos);
		
		Database_Siviso database = new Database_Siviso(useSharedPreferences);
		database.delete(latLng);
		
		verify(useSharedPreferences, times(0)).setSivisos(any());
	}
	
	@Test
	public void delete_LatLng01SivisoAHas01SivisoBHas00_deleteSivisoA()
	{
		LatLng latLng = new LatLng(0, 1);
		
		Siviso sivisoA = mock(Siviso.class);
		LatLng latLngA = latLng;
		when(sivisoA.latLng()).thenReturn(latLngA);
		
		Siviso sivisoB = mock(Siviso.class);
		LatLng latLngB = new LatLng(0, 0);
		when(sivisoB.latLng()).thenReturn(latLngB);
		
		Siviso[] expectedSivisos = new Siviso[]{sivisoB};
		UseSharedPreferences useSharedPreferences = mock(UseSharedPreferences.class);
		Siviso[] sivisos = new Siviso[]{sivisoA, sivisoB};
		when(useSharedPreferences.sivisos()).thenReturn(sivisos);
		
		Database_Siviso database = new Database_Siviso(useSharedPreferences);
		database.delete(latLng);
		
		verify(useSharedPreferences, times(1)).setSivisos(expectedSivisos);
	}
	
	@Test
	public void delete_LatLng00SivisoAHas00SivisoBHas11_deleteSivisoA()
	{
		LatLng latLng = new LatLng(0, 0);
		
		Siviso sivisoA = mock(Siviso.class);
		LatLng latLngA = latLng;
		when(sivisoA.latLng()).thenReturn(latLngA);
		
		Siviso sivisoB = mock(Siviso.class);
		LatLng latLngB = new LatLng(1, 1);
		when(sivisoB.latLng()).thenReturn(latLngB);
		
		Siviso[] expectedSivisos = new Siviso[]{sivisoB};
		UseSharedPreferences useSharedPreferences = mock(UseSharedPreferences.class);
		Siviso[] sivisos = new Siviso[]{sivisoA, sivisoB};
		when(useSharedPreferences.sivisos()).thenReturn(sivisos);
		
		Database_Siviso database = new Database_Siviso(useSharedPreferences);
		database.delete(latLng);
		
		verify(useSharedPreferences, times(1)).setSivisos(expectedSivisos);
	}
	
	@Test
	public void delete_LatLng00SivisoAHas01SivisoBHas00_deleteSivisoB()
	{
		LatLng latLng = new LatLng(0, 0);
		
		Siviso sivisoA = mock(Siviso.class);
		LatLng latLngA = new LatLng(0, 1);;
		when(sivisoA.latLng()).thenReturn(latLngA);
		
		Siviso sivisoB = mock(Siviso.class);
		LatLng latLngB = latLng;
		when(sivisoB.latLng()).thenReturn(latLngB);
		
		Siviso[] expectedSivisos = new Siviso[]{sivisoA};
		UseSharedPreferences useSharedPreferences = mock(UseSharedPreferences.class);
		Siviso[] sivisos = new Siviso[]{sivisoA, sivisoB};
		when(useSharedPreferences.sivisos()).thenReturn(sivisos);
		
		Database_Siviso database = new Database_Siviso(useSharedPreferences);
		database.delete(latLng);
		
		verify(useSharedPreferences, times(1)).setSivisos(expectedSivisos);
	}
	
	@Test
	public void delete_LatLng00SivisoAHas00SivisoBHas01_deleteSivisoA()
	{
		LatLng latLng = new LatLng(0, 0);
		
		Siviso sivisoA = mock(Siviso.class);
		LatLng latLngA = latLng;
		when(sivisoA.latLng()).thenReturn(latLngA);
		
		Siviso sivisoB = mock(Siviso.class);
		LatLng latLngB = new LatLng(0, 1);
		when(sivisoB.latLng()).thenReturn(latLngB);
		
		Siviso[] expectedSivisos = new Siviso[]{sivisoB};
		UseSharedPreferences useSharedPreferences = mock(UseSharedPreferences.class);
		Siviso[] sivisos = new Siviso[]{sivisoA, sivisoB};
		when(useSharedPreferences.sivisos()).thenReturn(sivisos);
		
		Database_Siviso database = new Database_Siviso(useSharedPreferences);
		database.delete(latLng);
		
		verify(useSharedPreferences, times(1)).setSivisos(expectedSivisos);
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