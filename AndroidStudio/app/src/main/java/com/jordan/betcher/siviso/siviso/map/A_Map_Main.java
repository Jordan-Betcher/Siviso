package com.jordan.betcher.siviso.siviso.map;

import android.content.Context;
import android.location.Criteria;
import android.location.LocationManager;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.SupportMapFragment;
import com.jordan.betcher.siviso.siviso.R;
import com.jordan.betcher.siviso.siviso.database.Database;
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
	SivisoMap_Siviso sivisoMap, SivisoList sivisoList)
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
		OnMapReady_AddOnClickListener_SaveNewSiviso saveNewSiviso = createSaveNewSiviso();
		
		onMapReady.add(enableCurrentLocation);
		onMapReady.add(startAtCurrentLocation);
		onMapReady.add(createSivisoCircles);
		onMapReady.add(selectSiviso);
		onMapReady.add(saveNewSiviso);
		onMapReady.add(sivisoMap);
		
		database.addOnDataChange(createSivisoCircles);
	}
	
	private OnMapReady_AddOnClickListener_SaveNewSiviso createSaveNewSiviso()
	{
		Factory_Siviso factorySiviso = new Factory_Siviso(activity);
		OnMapClickListener_SaveNewSiviso saveNewSiviso = new OnMapClickListener_SaveNewSiviso(database, factorySiviso);
		return new OnMapReady_AddOnClickListener_SaveNewSiviso(saveNewSiviso);
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
		IndexOfSiviso indexOfSiviso = new IndexOfSiviso(database);
		GoogleMap.OnCircleClickListener listener = new A_OnCircleClickListener_SelectSiviso(sivisoList, indexOfSiviso);
		return new OnMapReady_AddOnCircleClickListener(listener);
	}
	
	private OnMapReady_CreateSivisoCircles createCreateSivisoCircles()
	{
		Factory_CircleOptions factory = new Factory_CircleOptions();
		Factory_Circles factory_circles = new Factory_Circles(factory);
		return new OnMapReady_CreateSivisoCircles(database, factory_circles);
	}
	
	private OnMapReady_LocationListener_StartAtCurrentLocation createStartAtCurrentLocation()
	{
		LocationManager locationManager = (LocationManager)activity.getSystemService(
		Context.LOCATION_SERVICE);
		float zoom = (float)activity.getResources().getInteger(R.integer.initial_zoom_times_a_hundred) / 100;
		OnMapReady_LocationListener_StartAtCurrentLocation startAtCurrentLocation = new OnMapReady_LocationListener_StartAtCurrentLocation(zoom);
		Factory_Criteria_Accurate accurateCriteriaFactory = new Factory_Criteria_Accurate();
		Criteria accurateCriteria = accurateCriteriaFactory.build();
		OnPermissionGranted_RequestSingleUpdate requestSingleUpdate = new OnPermissionGranted_RequestSingleUpdate(locationManager, accurateCriteria, startAtCurrentLocation);
		permission.addOnGranted(requestSingleUpdate);
		return startAtCurrentLocation;
	}
	
	private OnMapReady_OnPermissionGranted_EnableCurrentLocation createEnableCurrentLocation()
	{
		OnMapReady_OnPermissionGranted_EnableCurrentLocation enableCurrentLocation = new OnMapReady_OnPermissionGranted_EnableCurrentLocation();
		permission.addOnGranted(enableCurrentLocation);
		return enableCurrentLocation;
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
