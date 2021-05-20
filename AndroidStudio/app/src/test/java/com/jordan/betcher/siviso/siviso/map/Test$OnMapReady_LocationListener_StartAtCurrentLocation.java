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
	public void onLocationChangedReady_1_zoomTo1()
	{
		float zoom = 1;
		Wrapper_GoogleMap googleMap = mock(Wrapper_GoogleMap.class);
		Location location = mock(Location.class);
		
		OnMapReady_LocationListener_StartAtCurrentLocation startAtCurrentLocation = new OnMapReady_LocationListener_StartAtCurrentLocation(zoom);
		startAtCurrentLocation.onLocationChanged(location);
		startAtCurrentLocation.ready(googleMap);
		
		verify(googleMap, times(1)).zoomTo(zoom);
	}
	
	@Test
	public void ready__0zoomTo()
	{
		float zoom = 0;
		Wrapper_GoogleMap googleMap = mock(Wrapper_GoogleMap.class);
		Location location = mock(Location.class);
		
		OnMapReady_LocationListener_StartAtCurrentLocation startAtCurrentLocation = new OnMapReady_LocationListener_StartAtCurrentLocation(zoom);
		startAtCurrentLocation.ready(googleMap);
		
		verify(googleMap, times(0)).zoomTo(zoom);
	}
	
	@Test
	public void onLocationChangedReady_0_zoomTo0()
	{
		float zoom = 0;
		Wrapper_GoogleMap googleMap = mock(Wrapper_GoogleMap.class);
		Location location = mock(Location.class);
		
		OnMapReady_LocationListener_StartAtCurrentLocation startAtCurrentLocation = new OnMapReady_LocationListener_StartAtCurrentLocation(zoom);
		startAtCurrentLocation.onLocationChanged(location);
		startAtCurrentLocation.ready(googleMap);
		
		verify(googleMap, times(1)).zoomTo(zoom);
	}
	
	@Test
	public void ready__notNull()
	{
		float zoom = 0;
		Wrapper_GoogleMap googleMap = mock(Wrapper_GoogleMap.class);
		Location location = mock(Location.class);
		
		OnMapReady_LocationListener_StartAtCurrentLocation startAtCurrentLocation = new OnMapReady_LocationListener_StartAtCurrentLocation(zoom);
		startAtCurrentLocation.ready(googleMap);
		
		verify(googleMap, times(0)).moveTo(null);
	}
	
	@Test
	public void readyOnLocationChanged__moveTo()
	{
		float zoom = 0;
		Wrapper_GoogleMap googleMap = mock(Wrapper_GoogleMap.class);
		Location location = mock(Location.class);
		
		OnMapReady_LocationListener_StartAtCurrentLocation startAtCurrentLocation = new OnMapReady_LocationListener_StartAtCurrentLocation(zoom);
		startAtCurrentLocation.ready(googleMap);
		startAtCurrentLocation.onLocationChanged(location);
		
		verify(googleMap, times(1)).moveTo(location);
	}
	
	@Test
	public void onLocationChangedReady__moveTo()
	{
		float zoom = 0;
		Wrapper_GoogleMap googleMap = mock(Wrapper_GoogleMap.class);
		Location location = mock(Location.class);
		
		OnMapReady_LocationListener_StartAtCurrentLocation startAtCurrentLocation = new OnMapReady_LocationListener_StartAtCurrentLocation(zoom);
		startAtCurrentLocation.onLocationChanged(location);
		startAtCurrentLocation.ready(googleMap);
		
		verify(googleMap, times(1)).moveTo(location);
	}
}