package com.jordan.betcher.siviso.siviso.map;

import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.jordan.betcher.siviso.siviso.lock.OnUnlock;

import java.util.ArrayList;

public class OnUnlock_AddOnMapReady implements OnUnlock
{
	private SupportMapFragment supportMapFragment;
	private A_OnMapReadyCallback_Map map;
	
	public OnUnlock_AddOnMapReady(
	SupportMapFragment supportMapFragment,
	A_OnMapReadyCallback_Map map)
	{
		this.supportMapFragment = supportMapFragment;
		this.map = map;
	}
	
	@Override
	public void unlocked()
	{
		supportMapFragment.getMapAsync(map);
	}
}
