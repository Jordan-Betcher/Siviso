package com.jordan.betcher.siviso.siviso.map;

import com.google.android.gms.maps.SupportMapFragment;
import com.jordan.betcher.siviso.siviso.lock.OnUnlock;

public class OnUnlock_AddOnMapReadyCallback implements OnUnlock
{
	private SupportMapFragment supportMapFragment;
	private A_OnMapReadyCallback_OnMapReady map;
	
	public OnUnlock_AddOnMapReadyCallback(
	SupportMapFragment supportMapFragment,
	A_OnMapReadyCallback_OnMapReady map)
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
