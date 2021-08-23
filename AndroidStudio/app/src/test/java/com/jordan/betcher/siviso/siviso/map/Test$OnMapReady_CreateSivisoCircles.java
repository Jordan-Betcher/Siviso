package com.jordan.betcher.siviso.siviso.map;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import com.google.android.gms.maps.model.CircleOptions;
import com.jordan.betcher.siviso.siviso.database.Siviso;

import org.junit.Test;

import java.util.ArrayList;

public class Test$OnMapReady_CreateSivisoCircles
{
	@Test
	public void ready_2SivisoDatas_()
	{
		CircleOptions circleOptions = new CircleOptions();
		Factory_CircleOptions factory = mock(Factory_CircleOptions.class);
		Siviso siviso1 = mock(Siviso.class);
		when(factory.create(siviso1)).thenReturn(circleOptions);
		Siviso siviso2 = mock(Siviso.class);
		when(factory.create(siviso2)).thenReturn(circleOptions);
		ArrayList<Siviso> sivisos = new ArrayList<>();
		sivisos.add(siviso1);
		sivisos.add(siviso2);
		
		Wrapper_GoogleMap googleMap = mock(Wrapper_GoogleMap.class);
		Wrapper_Circle wrapper_circle = mock(Wrapper_Circle.class);
		when(googleMap.createCircle(circleOptions)).thenReturn(wrapper_circle);
		
		OnMapReady_CreateSivisoCircles onMapReady = new OnMapReady_CreateSivisoCircles(
		sivisos, factory);
		onMapReady.ready(googleMap);
		
		verify(googleMap, times(2)).createCircle(circleOptions);
	}
	
	@Test
	public void ready__()
	{
		CircleOptions circleOptions = new CircleOptions();
		Factory_CircleOptions factory = mock(Factory_CircleOptions.class);
		ArrayList<Siviso> sivisos = new ArrayList<>();
		
		Wrapper_GoogleMap googleMap = mock(Wrapper_GoogleMap.class);
		
		OnMapReady_CreateSivisoCircles onMapReady = new OnMapReady_CreateSivisoCircles(
		sivisos, factory);
		onMapReady.ready(googleMap);
		
		verify(googleMap, times(0)).createCircle(circleOptions);
	}
	
	@Test
	public void ready_existsSivisoData_callCreateCircleWithLatLng()
	{
		CircleOptions circleOptions = new CircleOptions();
		Factory_CircleOptions factory = mock(Factory_CircleOptions.class);
		Siviso siviso = mock(Siviso.class);
		when(factory.create(siviso)).thenReturn(circleOptions);
		ArrayList<Siviso> sivisos = new ArrayList<>();
		sivisos.add(siviso);
		
		Wrapper_GoogleMap googleMap = mock(Wrapper_GoogleMap.class);
		Wrapper_Circle wrapper_circle = mock(Wrapper_Circle.class);
		when(googleMap.createCircle(circleOptions)).thenReturn(wrapper_circle);
		
		OnMapReady_CreateSivisoCircles onMapReady = new OnMapReady_CreateSivisoCircles(
		sivisos, factory);
		onMapReady.ready(googleMap);
		
		verify(googleMap, times(1)).createCircle(circleOptions);
	}
}