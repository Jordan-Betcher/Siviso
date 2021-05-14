package com.jordan.betcher.siviso.siviso.map;

import com.google.android.gms.maps.SupportMapFragment;

import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

public class Test$OnUnlockCallMapAsync
{
	@Test
	public void _0MapAsync()
	{
		SupportMapFragment supportMapFragment = mock(SupportMapFragment.class);
		A_OnMapReadyCallback_OnMapReady map = mock(A_OnMapReadyCallback_OnMapReady.class);
		
		new OnUnlock_AddOnMapReadyCallback(supportMapFragment, map);
		
		verify(supportMapFragment, times(0)).getMapAsync(map);
	}
	
	@Test
	public void unlocked__mapAsync()
	{
		SupportMapFragment supportMapFragment = mock(SupportMapFragment.class);
		A_OnMapReadyCallback_OnMapReady map = mock(A_OnMapReadyCallback_OnMapReady.class);
		
		OnUnlock_AddOnMapReadyCallback initializeMap = new OnUnlock_AddOnMapReadyCallback(supportMapFragment, map);
		initializeMap.unlocked();
		
		verify(supportMapFragment, times(1)).getMapAsync(map);
	}
}