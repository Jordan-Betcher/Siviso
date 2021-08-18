package com.jordan.betcher.siviso.siviso.map;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import com.google.android.gms.maps.GoogleMap;

import org.junit.Test;

public class Test$OnMapReady_AddOnMapClickListener
{
	@Test
	public void ready_googleMap_addOnMapClick()
	{
		Wrapper_GoogleMap googleMap = mock(Wrapper_GoogleMap.class);
		GoogleMap.OnMapClickListener listener = mock(GoogleMap.OnMapClickListener.class);
		
		OnMapReady_AddOnMapClickListener onMapReady = new OnMapReady_AddOnMapClickListener(listener);
		onMapReady.ready(googleMap);
		
		verify(googleMap, times(1)).addOnMapClickListener(listener);
	}
}