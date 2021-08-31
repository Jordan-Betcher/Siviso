package com.jordan.betcher.siviso.siviso.map;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import org.junit.Test;

public class Test$OnMapReady_AddOnClickListener_SaveNewSiviso
{
	@Test
	public void ready__addOnClickListenerSaveNewSiviso()
	{
		OnMapClickListener_SaveNewSiviso onMapClickListener = mock(OnMapClickListener_SaveNewSiviso.class);
		Wrapper_GoogleMap googleMap = mock(Wrapper_GoogleMap.class);
		
		OnMapReady_AddOnClickListener_SaveNewSiviso saveNewSiviso = new OnMapReady_AddOnClickListener_SaveNewSiviso(onMapClickListener);
		saveNewSiviso.ready(googleMap);
		
		verify(googleMap,  times(1)).addOnMapClickListener(onMapClickListener);
	}
}