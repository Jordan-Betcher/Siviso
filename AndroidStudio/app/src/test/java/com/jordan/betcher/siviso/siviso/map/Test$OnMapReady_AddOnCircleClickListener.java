package com.jordan.betcher.siviso.siviso.map;

import com.google.android.gms.maps.GoogleMap;

import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

public class Test$OnMapReady_AddOnCircleClickListener
{
	@Test
	public void ready_onClickListener_googleMapAddOnCircleClickListener()
	{
		Wrapper_GoogleMap googleMap = mock(Wrapper_GoogleMap.class);
		GoogleMap.OnCircleClickListener listener = mock(GoogleMap.OnCircleClickListener.class);
		
		OnMapReady_AddOnCircleClickListener onMapReady = new OnMapReady_AddOnCircleClickListener(listener);
		onMapReady.ready(googleMap);
		
		verify(googleMap, times(1)).addOnCircleClickListener(listener);
	}
}