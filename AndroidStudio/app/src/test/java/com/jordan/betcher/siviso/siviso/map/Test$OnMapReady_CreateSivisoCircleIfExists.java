package com.jordan.betcher.siviso.siviso.map;

import com.google.android.gms.maps.model.CircleOptions;
import com.google.android.gms.maps.model.LatLng;
import com.jordan.betcher.siviso.siviso.database.SivisoData;

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
		CircleOptions circleOptions = new CircleOptions();
		Factory_CircleOptions factory = mock(Factory_CircleOptions.class);
		SivisoData sivisoData = mock(SivisoData.class);
		when(sivisoData.exists()).thenReturn(exists);
		when(factory.create(sivisoData)).thenReturn(circleOptions);
		
		Wrapper_GoogleMap googleMap = mock(Wrapper_GoogleMap.class);
		
		OnMapReady_CreateSivisoCircleIfExists onMapReady = new OnMapReady_CreateSivisoCircleIfExists(
		sivisoData, factory);
		onMapReady.ready(googleMap);
		
		verify(googleMap, times(0)).createCircle(circleOptions);
	}
	
	@Test
	public void ready_existsSivisoData_callCreateCircleWithLatLng()
	{
		Boolean exists = true;
		CircleOptions circleOptions = new CircleOptions();
		Factory_CircleOptions factory = mock(Factory_CircleOptions.class);
		SivisoData sivisoData = mock(SivisoData.class);
		when(sivisoData.exists()).thenReturn(exists);
		when(factory.create(sivisoData)).thenReturn(circleOptions);
		
		Wrapper_GoogleMap googleMap = mock(Wrapper_GoogleMap.class);
		
		OnMapReady_CreateSivisoCircleIfExists onMapReady = new OnMapReady_CreateSivisoCircleIfExists(
		sivisoData, factory);
		onMapReady.ready(googleMap);
		
		verify(googleMap, times(1)).createCircle(circleOptions);
	}
}