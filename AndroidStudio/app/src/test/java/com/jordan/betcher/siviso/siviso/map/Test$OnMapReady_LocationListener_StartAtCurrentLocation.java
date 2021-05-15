package com.jordan.betcher.siviso.siviso.map;

import android.location.Location;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

public class Test$OnMapReady_LocationListener_StartAtCurrentLocation
{
	@Test
	public void ready__notNull()
	{
		Wrapper_GoogleMap googleMap = mock(Wrapper_GoogleMap.class);
		Location location = mock(Location.class);
		
		OnMapReady_LocationListener_StartAtCurrentLocation startAtCurrentLocation = new OnMapReady_LocationListener_StartAtCurrentLocation();
		startAtCurrentLocation.ready(googleMap);
		
		verify(googleMap, times(0)).moveTo(null);
	}
	
	@Test
	public void readyOnLocationChanged__moveTo()
	{
		Wrapper_GoogleMap googleMap = mock(Wrapper_GoogleMap.class);
		Location location = mock(Location.class);
		
		OnMapReady_LocationListener_StartAtCurrentLocation startAtCurrentLocation = new OnMapReady_LocationListener_StartAtCurrentLocation();
		startAtCurrentLocation.ready(googleMap);
		startAtCurrentLocation.onLocationChanged(location);
		
		verify(googleMap, times(1)).moveTo(location);
	}
	
	@Test
	public void onLocationChangedReady__moveTo()
	{
		Wrapper_GoogleMap googleMap = mock(Wrapper_GoogleMap.class);
		Location location = mock(Location.class);
		
		OnMapReady_LocationListener_StartAtCurrentLocation startAtCurrentLocation = new OnMapReady_LocationListener_StartAtCurrentLocation();
		startAtCurrentLocation.onLocationChanged(location);
		startAtCurrentLocation.ready(googleMap);
		
		verify(googleMap, times(1)).moveTo(location);
	}
}