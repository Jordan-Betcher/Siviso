package com.jordan.betcher.siviso.siviso.list;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import com.google.android.gms.maps.model.LatLng;

import org.junit.Test;

public class Test$SivisoList_Siviso
{
	
	@Test
	public void select_01OnSelect_onSelect01()
	{
		LatLng latLng = new LatLng(0, 1);
		OnSelect onSelect = mock(OnSelect.class);
		
		SivisoList_Siviso sivisoList = new SivisoList_Siviso();
		sivisoList.addOnSelect(onSelect);
		sivisoList.select(latLng);
		
		verify(onSelect, times(1)).onSelect(latLng);
	}
	
	@Test
	public void select_00OnSelect_onSelect00()
	{
		LatLng latLng = new LatLng(0, 0);
		OnSelect onSelect = mock(OnSelect.class);
		
		SivisoList_Siviso sivisoList = new SivisoList_Siviso();
		sivisoList.addOnSelect(onSelect);
		sivisoList.select(latLng);
		
		verify(onSelect, times(1)).onSelect(latLng);
	}
}