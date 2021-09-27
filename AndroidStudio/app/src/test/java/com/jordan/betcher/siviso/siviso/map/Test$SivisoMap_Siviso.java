package com.jordan.betcher.siviso.siviso.map;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import com.google.android.gms.maps.model.LatLng;

import org.junit.Test;

public class Test$SivisoMap_Siviso
{
	
	
	@Test
	public void goToLocation_00_noError()
	{
		LatLng latLng = new LatLng(0, 0);
		Wrapper_GoogleMap googleMap = mock(Wrapper_GoogleMap.class);
		
		SivisoMap_Siviso sivisoMap = new SivisoMap_Siviso();
		sivisoMap.goToLocation(latLng);
	}
	
	@Test
	public void goToLocationReady_10map_moveTo10()
	{
		LatLng latLng = new LatLng(1, 0);
		Wrapper_GoogleMap googleMap = mock(Wrapper_GoogleMap.class);
		
		SivisoMap_Siviso sivisoMap = new SivisoMap_Siviso();
		sivisoMap.ready(googleMap);
		sivisoMap.goToLocation(latLng);
		
		verify(googleMap, times(1)).moveTo(latLng);
	}
	
	@Test
	public void goToLocationReady_01map_moveTo01()
	{
		LatLng latLng = new LatLng(0, 1);
		Wrapper_GoogleMap googleMap = mock(Wrapper_GoogleMap.class);
		
		SivisoMap_Siviso sivisoMap = new SivisoMap_Siviso();
		sivisoMap.ready(googleMap);
		sivisoMap.goToLocation(latLng);
		
		verify(googleMap, times(1)).moveTo(latLng);
	}
	
	@Test
	public void goToLocationReady_00map_moveTo00()
	{
		LatLng latLng = new LatLng(0, 0);
		Wrapper_GoogleMap googleMap = mock(Wrapper_GoogleMap.class);
		
		SivisoMap_Siviso sivisoMap = new SivisoMap_Siviso();
		sivisoMap.ready(googleMap);
		sivisoMap.goToLocation(latLng);
		
		verify(googleMap, times(1)).moveTo(latLng);
	}
}