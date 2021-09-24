package com.jordan.betcher.siviso.siviso.map;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.Test;

public class Test$OnMapReady_CreateSivisoCircles
{
	@Test
	public void dataChanged_null_noError()
	{
		OnMapReady_CreateSivisoCircles createSivisoCircles = new OnMapReady_CreateSivisoCircles(null);
		createSivisoCircles.circles = null;
		createSivisoCircles.dataChanged();
	}
	
	@Test
	public void dataChanged_circles_recreate()
	{
		Circles circles = mock(Circles.class);
		
		OnMapReady_CreateSivisoCircles createSivisoCircles = new OnMapReady_CreateSivisoCircles(null);
		createSivisoCircles.circles = circles;
		createSivisoCircles.dataChanged();
		
		verify(circles, times(1)).recreate();
	}
	
	@Test
	public void ready__recreate()
	{
		Circles circles = mock(Circles.class);
		Wrapper_GoogleMap googleMap = mock(Wrapper_GoogleMap.class);
		Factory_Circles factory = mock(Factory_Circles.class);
		when(factory.create(googleMap)).thenReturn(circles);
		
		OnMapReady_CreateSivisoCircles createSivisoCircles = new OnMapReady_CreateSivisoCircles(factory);
		createSivisoCircles.ready(googleMap);
		
		verify(circles, times(1)).recreate();
	}
}