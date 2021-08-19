package com.jordan.betcher.siviso.siviso.map;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.Test;

public class Test$OnMapReady_AddOnMapClick_SelectCircle
{
	@Test
	public void ready_googleMap_addOnMapClick()
	{
		Wrapper_GoogleMap googleMap = mock(Wrapper_GoogleMap.class);
		Factory_OnMapClickListener_SelectCircle factory = mock(Factory_OnMapClickListener_SelectCircle.class);
		OnMapClickListener_SelectCircle selectCircle = mock(OnMapClickListener_SelectCircle.class);
		when(factory.create(googleMap)).thenReturn(selectCircle);
		
		OnMapReady_AddOnMapClick_SelectCircle onMapReady = new OnMapReady_AddOnMapClick_SelectCircle(factory);
		onMapReady.ready(googleMap);
		
		verify(googleMap, times(1)).addOnMapClickListener(selectCircle);
	}
}