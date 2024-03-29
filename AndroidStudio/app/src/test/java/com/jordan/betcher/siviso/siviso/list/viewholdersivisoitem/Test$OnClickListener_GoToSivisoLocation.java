package com.jordan.betcher.siviso.siviso.list.viewholdersivisoitem;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import com.google.android.gms.maps.model.LatLng;
import com.jordan.betcher.siviso.siviso.map.SivisoMap;

import org.junit.Test;

public class Test$OnClickListener_GoToSivisoLocation
{
	
	@Test
	public void _MapSivisoLocation00_0MapGoToSivisoLocation00()
	{
		LatLng sivisoLocation = new LatLng(0, 0);
		SivisoMap sivisoMap = mock(SivisoMap.class);
		
		OnClickListener_GoToSivisoLocation onClickListener = new OnClickListener_GoToSivisoLocation(sivisoMap, sivisoLocation);
		
		verify(sivisoMap, times(0)).goToLocation(sivisoLocation);
	}
	
	@Test
	public void onClick_MapSivisoLocation01_MapGoToSivisoLocation01()
	{
		LatLng sivisoLocation = new LatLng(0, 1);
		SivisoMap sivisoMap = mock(SivisoMap.class);
		
		OnClickListener_GoToSivisoLocation onClickListener = new OnClickListener_GoToSivisoLocation(sivisoMap, sivisoLocation);
		onClickListener.onClick(null);
		
		verify(sivisoMap, times(1)).goToLocation(sivisoLocation);
	}
	
	@Test
	public void onClick_MapSivisoLocation00_MapGoToSivisoLocation00()
	{
		LatLng sivisoLocation = new LatLng(0, 0);
		SivisoMap sivisoMap = mock(SivisoMap.class);
		
		OnClickListener_GoToSivisoLocation onClickListener = new OnClickListener_GoToSivisoLocation(sivisoMap, sivisoLocation);
		onClickListener.onClick(null);
		
		verify(sivisoMap, times(1)).goToLocation(sivisoLocation);
	}
}