package com.jordan.betcher.siviso.siviso.main.delete.button;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import com.google.android.gms.maps.model.LatLng;
import com.jordan.betcher.siviso.siviso.database.Database;
import com.jordan.betcher.siviso.siviso.list.SivisoList;

import org.junit.Test;

public class Test$OnClickListener_DeleteSelected
{
	
	@Test
	public void __0databaseDeleteSelected00()
	{
		LatLng selected = new LatLng(0, 0);
		Database database = mock(Database.class);
		SivisoList sivisoList = mock(SivisoList.class);
		when(sivisoList.selected()).thenReturn(selected);
		
		OnClickListener_DeleteSelected deleteSelected = new OnClickListener_DeleteSelected(database, sivisoList);
		
		verify(database, times(0)).delete(selected);
	}
	
	@Test
	public void onClick_sivisoListSelected01_databaseDeleteSelected01()
	{
		LatLng selected = new LatLng(0, 1);
		Database database = mock(Database.class);
		SivisoList sivisoList = mock(SivisoList.class);
		when(sivisoList.selected()).thenReturn(selected);
		
		OnClickListener_DeleteSelected deleteSelected = new OnClickListener_DeleteSelected(database, sivisoList);
		deleteSelected.onClick(null);
		
		verify(database, times(1)).delete(selected);
	}
	
	@Test
	public void onClick_sivisoListSelected00_databaseDeleteSelected00()
	{
		LatLng selected = new LatLng(0, 0);
		Database database = mock(Database.class);
		SivisoList sivisoList = mock(SivisoList.class);
		when(sivisoList.selected()).thenReturn(selected);
		
		OnClickListener_DeleteSelected deleteSelected = new OnClickListener_DeleteSelected(database, sivisoList);
		deleteSelected.onClick(null);
		
		verify(database, times(1)).delete(selected);
	}
}