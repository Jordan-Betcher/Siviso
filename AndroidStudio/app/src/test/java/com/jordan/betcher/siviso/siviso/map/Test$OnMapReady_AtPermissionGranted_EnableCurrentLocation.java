package com.jordan.betcher.siviso.siviso.map;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import org.junit.Test;

public class Test$OnMapReady_AtPermissionGranted_EnableCurrentLocation
{
	
	@Test
	public void readyGranted_wrapperGoogleMap_enableCurrentLocation()
	{
		Wrapper_GoogleMap googleMap = mock(Wrapper_GoogleMap.class);
		
		OnMapReady_AtPermissionGranted_EnableCurrentLocation enableCurrentLocation = new OnMapReady_AtPermissionGranted_EnableCurrentLocation();
		enableCurrentLocation.ready(googleMap);
		enableCurrentLocation.call();
		
		verify(googleMap, times(1)).enableCurrentLocation();
	}
	
	@Test
	public void ready_wrapperGoogleMap_0enableCurrentLocation()
	{
		Wrapper_GoogleMap googleMap = mock(Wrapper_GoogleMap.class);
		
		OnMapReady_AtPermissionGranted_EnableCurrentLocation enableCurrentLocation = new OnMapReady_AtPermissionGranted_EnableCurrentLocation();
		enableCurrentLocation.ready(googleMap);
		
		verify(googleMap, times(0)).enableCurrentLocation();
	}
	
	@Test
	public void grantedReady_wrapperGoogleMap_enableCurrentLocation()
	{
		Wrapper_GoogleMap googleMap = mock(Wrapper_GoogleMap.class);
		
		OnMapReady_AtPermissionGranted_EnableCurrentLocation enableCurrentLocation = new OnMapReady_AtPermissionGranted_EnableCurrentLocation();
		enableCurrentLocation.call();
		enableCurrentLocation.ready(googleMap);
		
		verify(googleMap, times(1)).enableCurrentLocation();
	}
}