package com.jordan.betcher.siviso.siviso.map;

import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.SupportMapFragment;
import com.jordan.betcher.siviso.siviso.R;
import com.jordan.betcher.siviso.siviso.database.Database;
import com.jordan.betcher.siviso.siviso.database.Siviso;
import com.jordan.betcher.siviso.siviso.list.SivisoList;
import com.jordan.betcher.siviso.siviso.lock.EventUnlock;
import com.jordan.betcher.siviso.siviso.lock.Factory_SetupEventUnLock;
import com.jordan.betcher.siviso.siviso.permissions.Permission_AccessFineLocation;

public class A_Map_Main
{
	private final AppCompatActivity activity;
	private final Permission_AccessFineLocation permission;
	private final Database database;
	private final SivisoList sivisoList;
	
	public A_Map_Main(
	AppCompatActivity activity,
	Permission_AccessFineLocation permission, Database database,
	SivisoList sivisoList)
	{
		this.activity = activity;
		this.permission = permission;
		this.database = database;
		this.sivisoList = sivisoList;
		
		SupportMapFragment supportMapFragment = (SupportMapFragment)activity.getSupportFragmentManager().findFragmentById(R.id.homeMap);
		
		EventUnlock mapUnlock = getMapUnlock(supportMapFragment);
		OnMapReady_CallOnMapReadys onMapReady = createCallOnMapReady(supportMapFragment, mapUnlock);
		OnMapReady_OnPermissionGranted_EnableCurrentLocation enableCurrentLocation = createEnableCurrentLocation();
		OnMapReady_LocationListener_StartAtCurrentLocation startAtCurrentLocation = createStartAtCurrentLocation();
		OnMapReady_CreateSivisoCircles createSivisoCircles = createCreateSivisoCircles();
		OnMapReady_AddOnCircleClickListener selectSiviso = createSelectSiviso();
		
		onMapReady.add(enableCurrentLocation);
		onMapReady.add(startAtCurrentLocation);
		onMapReady.add(createSivisoCircles);
		onMapReady.add(selectSiviso);
	}
	
	private EventUnlock getMapUnlock(
	SupportMapFragment supportMapFragment)
	{
		Button mapLock = activity.findViewById(R.id.homeMapLock);
		View mapView = supportMapFragment.getView();
		Factory_SetupEventUnLock lockFactory = new Factory_SetupEventUnLock(mapView, mapLock, permission);
		
		return lockFactory.eventUnlock();
	}
	
	private OnMapReady_AddOnCircleClickListener createSelectSiviso()
	{
		GoogleMap.OnCircleClickListener listener = new A_OnCircleClickListener_SelectSiviso(sivisoList);
		return new OnMapReady_AddOnCircleClickListener(listener);
	}
	
	private OnMapReady_CreateSivisoCircles createCreateSivisoCircles()
	{
		Siviso[] sivisos = database.sivisos();
		Factory_CircleOptions factory = new Factory_CircleOptions();
		return new OnMapReady_CreateSivisoCircles(sivisos, factory);
	}
	
	private OnMapReady_LocationListener_StartAtCurrentLocation createStartAtCurrentLocation()
	{
		Factory_StartAtCurrentLocation startAtCurrentLocationFactory = new Factory_StartAtCurrentLocation(activity, permission);
		
		return startAtCurrentLocationFactory.create();
	}
	
	private OnMapReady_OnPermissionGranted_EnableCurrentLocation createEnableCurrentLocation()
	{
		Factory_EnableCurrentLocation enableCurrentLocationFactory = new Factory_EnableCurrentLocation(permission);
		
		return enableCurrentLocationFactory.create();
	}
	
	private OnMapReady_CallOnMapReadys createCallOnMapReady(
	SupportMapFragment supportMapFragment, EventUnlock mapUnlock)
	{

		OnMapReady_CallOnMapReadys onMapReady = new OnMapReady_CallOnMapReadys();
		A_OnMapReadyCallback_OnMapReady onMapReadyCallback = new A_OnMapReadyCallback_OnMapReady(onMapReady);
		OnUnlock_AddOnMapReadyCallback addOnMapReadyCallback = new OnUnlock_AddOnMapReadyCallback(supportMapFragment, onMapReadyCallback);
		
		mapUnlock.addOnUnlock(addOnMapReadyCallback);
		return onMapReady;
	}
}
