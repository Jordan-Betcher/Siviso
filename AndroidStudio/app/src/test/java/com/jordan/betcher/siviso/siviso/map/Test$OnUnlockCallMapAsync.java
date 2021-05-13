package com.jordan.betcher.siviso.siviso.map;

import com.google.android.gms.maps.OnMapReadyCallback;
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
		A_OnMapReadyCallback_Map map = mock(A_OnMapReadyCallback_Map.class);
		
		new OnUnlock_AddOnMapReady(supportMapFragment, map);
		
		verify(supportMapFragment, times(0)).getMapAsync(map);
	}
	
	@Test
	public void unlocked__mapAsync()
	{
		SupportMapFragment supportMapFragment = mock(SupportMapFragment.class);
		A_OnMapReadyCallback_Map map = mock(A_OnMapReadyCallback_Map.class);
		
		OnUnlock_AddOnMapReady initializeMap = new OnUnlock_AddOnMapReady(supportMapFragment, map);
		initializeMap.unlocked();
		
		verify(supportMapFragment, times(1)).getMapAsync(map);
	}
}