package com.jordan.betcher.siviso.siviso.map;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import android.location.Location;

import com.google.android.gms.maps.model.LatLng;

import org.junit.Test;

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
	public void readyOnLocationChanged_00_moveTo()
	{
		float zoom = 0;
		Wrapper_GoogleMap googleMap = mock(Wrapper_GoogleMap.class);
		LatLng latLng = new LatLng(0 ,0);
		Location location = mock(Location.class);
		when(location.getLongitude()).thenReturn(latLng.longitude);
		when(location.getLatitude()).thenReturn(latLng.latitude);
		
		OnMapReady_LocationListener_StartAtCurrentLocation startAtCurrentLocation = new OnMapReady_LocationListener_StartAtCurrentLocation(zoom);
		startAtCurrentLocation.ready(googleMap);
		startAtCurrentLocation.onLocationChanged(location);
		
		verify(googleMap, times(1)).moveTo(latLng);
	}
	
	@Test
	public void onLocationChangedReady_00_moveTo()
	{
		float zoom = 0;
		Wrapper_GoogleMap googleMap = mock(Wrapper_GoogleMap.class);
		LatLng latLng = new LatLng(0 ,0);
		Location location = mock(Location.class);
		when(location.getLongitude()).thenReturn(latLng.longitude);
		when(location.getLatitude()).thenReturn(latLng.latitude);
		
		OnMapReady_LocationListener_StartAtCurrentLocation startAtCurrentLocation = new OnMapReady_LocationListener_StartAtCurrentLocation(zoom);
		startAtCurrentLocation.onLocationChanged(location);
		startAtCurrentLocation.ready(googleMap);
		
		verify(googleMap, times(1)).moveTo(latLng);
	}
}