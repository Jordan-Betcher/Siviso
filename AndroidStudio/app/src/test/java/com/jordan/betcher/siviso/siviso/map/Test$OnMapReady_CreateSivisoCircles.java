package com.jordan.betcher.siviso.siviso.map;

import com.google.android.gms.maps.model.CircleOptions;
import com.jordan.betcher.siviso.siviso.database.SivisoData;

import org.junit.Test;

import java.util.ArrayList;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class Test$OnMapReady_CreateSivisoCircles
{
	@Test
	public void ready_2SivisoDatas_()
	{
		CircleOptions circleOptions = new CircleOptions();
		Factory_CircleOptions factory = mock(Factory_CircleOptions.class);
		SivisoData sivisoData1 = mock(SivisoData.class);
		when(factory.create(sivisoData1)).thenReturn(circleOptions);
		SivisoData sivisoData2 = mock(SivisoData.class);
		when(factory.create(sivisoData2)).thenReturn(circleOptions);
		ArrayList<SivisoData> sivisoDatas = new ArrayList<>();
		sivisoDatas.add(sivisoData1);
		sivisoDatas.add(sivisoData2);
		
		Wrapper_GoogleMap googleMap = mock(Wrapper_GoogleMap.class);
		Wrapper_Circle wrapper_circle = mock(Wrapper_Circle.class);
		when(googleMap.createCircle(circleOptions)).thenReturn(wrapper_circle);
		
		OnMapReady_CreateSivisoCircles onMapReady = new OnMapReady_CreateSivisoCircles(
		sivisoDatas, factory);
		onMapReady.ready(googleMap);
		
		verify(googleMap, times(2)).createCircle(circleOptions);
	}
	
	@Test
	public void ready__()
	{
		CircleOptions circleOptions = new CircleOptions();
		Factory_CircleOptions factory = mock(Factory_CircleOptions.class);
		ArrayList<SivisoData> sivisoDatas = new ArrayList<>();
		
		Wrapper_GoogleMap googleMap = mock(Wrapper_GoogleMap.class);
		
		OnMapReady_CreateSivisoCircles onMapReady = new OnMapReady_CreateSivisoCircles(
		sivisoDatas, factory);
		onMapReady.ready(googleMap);
		
		verify(googleMap, times(0)).createCircle(circleOptions);
	}
	
	@Test
	public void ready_existsSivisoData_callCreateCircleWithLatLng()
	{
		CircleOptions circleOptions = new CircleOptions();
		Factory_CircleOptions factory = mock(Factory_CircleOptions.class);
		SivisoData sivisoData = mock(SivisoData.class);
		when(factory.create(sivisoData)).thenReturn(circleOptions);
		ArrayList<SivisoData> sivisoDatas = new ArrayList<>();
		sivisoDatas.add(sivisoData);
		
		Wrapper_GoogleMap googleMap = mock(Wrapper_GoogleMap.class);
		Wrapper_Circle wrapper_circle = mock(Wrapper_Circle.class);
		when(googleMap.createCircle(circleOptions)).thenReturn(wrapper_circle);
		
		OnMapReady_CreateSivisoCircles onMapReady = new OnMapReady_CreateSivisoCircles(
		sivisoDatas, factory);
		onMapReady.ready(googleMap);
		
		verify(googleMap, times(1)).createCircle(circleOptions);
	}
}