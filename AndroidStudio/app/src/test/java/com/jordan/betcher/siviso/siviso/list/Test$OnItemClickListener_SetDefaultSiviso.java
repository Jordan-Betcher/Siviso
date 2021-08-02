package com.jordan.betcher.siviso.siviso.list;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import com.jordan.betcher.siviso.siviso.database.Database;
import com.jordan.betcher.siviso.siviso.database.Siviso;

import org.junit.Test;

public class Test$OnItemClickListener_SetDefaultSiviso
{
	
	@Test
	public void onItemClick_DatabasePosition1_DatabaseSetDefaultSivisoVIBRATE()
	{
		int position = 1;
		Siviso sivisoFromPosition = Siviso.VIBRATE;
		Database database = mock(Database.class);
		SivisoConverter sivisoConverter = mock(SivisoConverter.class);
		when(sivisoConverter.SivisoFrom(position)).thenReturn(sivisoFromPosition);
		
		OnItemClickListener_SetDefaultSiviso onItemClickListener_setDefaultSiviso = new OnItemClickListener_SetDefaultSiviso(database, sivisoConverter);
		onItemClickListener_setDefaultSiviso.onItemClick(null, null, position, 0);
		
		verify(database, times(1)).setDefaultSiviso(sivisoFromPosition);
	}
	
	@Test
	public void __0DatabaseSetDefaultSiviso()
	{
		int position = 0;
		Siviso sivisoFromPosition = Siviso.SILENT;
		Database database = mock(Database.class);
		SivisoConverter sivisoConverter = mock(SivisoConverter.class);
		when(sivisoConverter.SivisoFrom(position)).thenReturn(sivisoFromPosition);
		
		new OnItemClickListener_SetDefaultSiviso(database, sivisoConverter);
		
		verify(database, times(0)).setDefaultSiviso(any());
	}
	
	@Test
	public void onItemClick_DatabasePosition0_DatabaseSetDefaultSivisoSILENT()
	{
		int position = 0;
		Siviso sivisoFromPosition = Siviso.SILENT;
		Database database = mock(Database.class);
		SivisoConverter sivisoConverter = mock(SivisoConverter.class);
		when(sivisoConverter.SivisoFrom(position)).thenReturn(sivisoFromPosition);
		
		OnItemClickListener_SetDefaultSiviso onItemClickListener_setDefaultSiviso = new OnItemClickListener_SetDefaultSiviso(database, sivisoConverter);
		onItemClickListener_setDefaultSiviso.onItemClick(null, null, position, 0);
		
		verify(database, times(1)).setDefaultSiviso(sivisoFromPosition);
	}
}