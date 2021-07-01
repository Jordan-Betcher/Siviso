package com.jordan.betcher.siviso.siviso.map;

import com.google.android.gms.maps.model.CircleOptions;
import com.google.android.gms.maps.model.LatLng;
import com.jordan.betcher.siviso.siviso.database.LatLngData;

import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class Test$OnMapReady_CreateSivisoCircleIfExists
{
	@Test
	public void ready_notExists_callCreateCircleWithLatLng()
	{
		Boolean exists = false;
		LatLng latLng = new LatLng(0, 0);
		CircleOptions circleOptions = new CircleOptions();
		Factory_CircleOptions factory = mock(Factory_CircleOptions.class);
		LatLngData latLngData = mock(LatLngData.class);
		when(latLngData.latLng()).thenReturn(latLng);
		when(latLngData.exists()).thenReturn(exists);
		when(factory.create(latLng)).thenReturn(circleOptions);
		
		Wrapper_GoogleMap googleMap = mock(Wrapper_GoogleMap.class);
		
		OnMapReady_CreateSivisoCircleIfExists onMapReady = new OnMapReady_CreateSivisoCircleIfExists(latLngData, factory);
		onMapReady.ready(googleMap);
		
		verify(googleMap, times(0)).createCircle(circleOptions);
	}
	
	@Test
	public void ready_existsLatLng01_callCreateCircleWithLatLng()
	{
		Boolean exists = true;
		LatLng latLng = new LatLng(0, 1);
		CircleOptions circleOptions = new CircleOptions();
		Factory_CircleOptions factory = mock(Factory_CircleOptions.class);
		LatLngData latLngData = mock(LatLngData.class);
		when(latLngData.latLng()).thenReturn(latLng);
		when(latLngData.exists()).thenReturn(exists);
		when(factory.create(latLng)).thenReturn(circleOptions);
		
		Wrapper_GoogleMap googleMap = mock(Wrapper_GoogleMap.class);
		
		OnMapReady_CreateSivisoCircleIfExists onMapReady = new OnMapReady_CreateSivisoCircleIfExists(latLngData, factory);
		onMapReady.ready(googleMap);
		
		verify(googleMap, times(1)).createCircle(circleOptions);
	}
	
	@Test
	public void ready_existsLatLng00_callCreateCircleWithLatLng()
	{
		Boolean exists = true;
		LatLng latLng = new LatLng(0, 0);
		CircleOptions circleOptions = new CircleOptions();
		Factory_CircleOptions factory = mock(Factory_CircleOptions.class);
		LatLngData latLngData = mock(LatLngData.class);
		when(latLngData.latLng()).thenReturn(latLng);
		when(latLngData.exists()).thenReturn(exists);
		when(factory.create(latLng)).thenReturn(circleOptions);
		
		Wrapper_GoogleMap googleMap = mock(Wrapper_GoogleMap.class);
		
		OnMapReady_CreateSivisoCircleIfExists onMapReady = new OnMapReady_CreateSivisoCircleIfExists(latLngData, factory);
		onMapReady.ready(googleMap);
		
		verify(googleMap, times(1)).createCircle(circleOptions);
	}
}