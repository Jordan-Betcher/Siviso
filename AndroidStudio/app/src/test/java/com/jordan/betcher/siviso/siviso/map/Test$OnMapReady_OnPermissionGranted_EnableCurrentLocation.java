package com.jordan.betcher.siviso.siviso.map;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

public class Test$OnMapReady_OnPermissionGranted_EnableCurrentLocation
{
	
	@Test
	public void readyGranted_wrapperGoogleMap_enableCurrentLocation()
	{
		Wrapper_GoogleMap googleMap = mock(Wrapper_GoogleMap.class);
		
		OnMapReady_OnPermissionGranted_EnableCurrentLocation enableCurrentLocation = new OnMapReady_OnPermissionGranted_EnableCurrentLocation();
		enableCurrentLocation.ready(googleMap);
		enableCurrentLocation.granted();
		
		verify(googleMap, times(1)).enableCurrentLocation();
	}
	
	@Test
	public void ready_wrapperGoogleMap_0enableCurrentLocation()
	{
		Wrapper_GoogleMap googleMap = mock(Wrapper_GoogleMap.class);
		
		OnMapReady_OnPermissionGranted_EnableCurrentLocation enableCurrentLocation = new OnMapReady_OnPermissionGranted_EnableCurrentLocation();
		enableCurrentLocation.ready(googleMap);
		
		verify(googleMap, times(0)).enableCurrentLocation();
	}
	
	@Test
	public void grantedReady_wrapperGoogleMap_enableCurrentLocation()
	{
		Wrapper_GoogleMap googleMap = mock(Wrapper_GoogleMap.class);
		
		OnMapReady_OnPermissionGranted_EnableCurrentLocation enableCurrentLocation = new OnMapReady_OnPermissionGranted_EnableCurrentLocation();
		enableCurrentLocation.granted();
		enableCurrentLocation.ready(googleMap);
		
		verify(googleMap, times(1)).enableCurrentLocation();
	}
}