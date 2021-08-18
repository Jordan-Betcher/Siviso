package com.jordan.betcher.siviso.siviso.map;

import android.view.View;
import android.widget.Button;

import com.google.android.gms.maps.SupportMapFragment;
import com.jordan.betcher.siviso.siviso.lock.EventUnlock;
import com.jordan.betcher.siviso.siviso.lock.Factory_SetupEventUnLock;
import com.jordan.betcher.siviso.siviso.permissions.Permission_AccessFineLocation;

public class Factory_SetupMap
{
	private Factory_SetupEventUnLock lockFactory;
	private SupportMapFragment supportMapFragment;
	
	public Factory_SetupMap(SupportMapFragment supportMapFragment, Button mapLock, Permission_AccessFineLocation permission)
	{
		this.supportMapFragment = supportMapFragment;
		View mapView = supportMapFragment.getView();
		lockFactory = new Factory_SetupEventUnLock(mapView, mapLock, permission);
	}
	
	public OnMapReady_CallOnMapReadys onMapReady()
	{
		OnMapReady_CallOnMapReadys onMapReady = new OnMapReady_CallOnMapReadys();
		A_OnMapReadyCallback_OnMapReady onMapReadyCallback = new A_OnMapReadyCallback_OnMapReady(onMapReady);
		OnUnlock_AddOnMapReadyCallback addOnMapReadyCallback = new OnUnlock_AddOnMapReadyCallback(supportMapFragment, onMapReadyCallback);
		EventUnlock lock = lockFactory.eventUnlock();
		lock.addOnUnlock(addOnMapReadyCallback);
		return onMapReady;
	}
}
