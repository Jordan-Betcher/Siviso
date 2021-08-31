package com.jordan.betcher.siviso.siviso.main;

import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.maps.SupportMapFragment;
import com.jordan.betcher.siviso.siviso.R;
import com.jordan.betcher.siviso.siviso.database.Database;
import com.jordan.betcher.siviso.siviso.list.SivisoList;
import com.jordan.betcher.siviso.siviso.map.Factory_AddOnCircleClickSelectSiviso;
import com.jordan.betcher.siviso.siviso.map.Factory_CreateCircles;
import com.jordan.betcher.siviso.siviso.map.Factory_EnableCurrentLocation;
import com.jordan.betcher.siviso.siviso.map.Factory_SetupMap;
import com.jordan.betcher.siviso.siviso.map.Factory_StartAtCurrentLocation;
import com.jordan.betcher.siviso.siviso.map.OnMapReady_AddOnCircleClickListener;
import com.jordan.betcher.siviso.siviso.map.OnMapReady_CallOnMapReadys;
import com.jordan.betcher.siviso.siviso.map.OnMapReady_CreateSivisoCircles;
import com.jordan.betcher.siviso.siviso.map.OnMapReady_LocationListener_StartAtCurrentLocation;
import com.jordan.betcher.siviso.siviso.map.OnMapReady_OnPermissionGranted_EnableCurrentLocation;
import com.jordan.betcher.siviso.siviso.permissions.Permission_AccessFineLocation;

class A_Map_Main
{
	@androidx.annotation.NonNull
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
		
		OnMapReady_CallOnMapReadys onMapReady = createCallOnMapReady();
		OnMapReady_OnPermissionGranted_EnableCurrentLocation enableCurrentLocation = createEnableCurrentLocation();
		OnMapReady_LocationListener_StartAtCurrentLocation startAtCurrentLocation = createStartAtCurrentLocation();
		OnMapReady_CreateSivisoCircles createSivisoCircles = createCreateSivisoCircles();
		OnMapReady_AddOnCircleClickListener selectSiviso = createSelectSiviso();
		
		onMapReady.add(enableCurrentLocation);
		onMapReady.add(startAtCurrentLocation);
		onMapReady.add(createSivisoCircles);
		onMapReady.add(selectSiviso);
	}
	
	private OnMapReady_AddOnCircleClickListener createSelectSiviso()
	{
		Factory_AddOnCircleClickSelectSiviso addOnCircleClickSelectSivisoFactory = new Factory_AddOnCircleClickSelectSiviso(sivisoList);
		
		return addOnCircleClickSelectSivisoFactory.create();
	}
	
	private OnMapReady_CreateSivisoCircles createCreateSivisoCircles()
	{
		Factory_CreateCircles createCirclesFactory = new Factory_CreateCircles(database);
		return createCirclesFactory.create();
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
	
	private OnMapReady_CallOnMapReadys createCallOnMapReady()
	{
		SupportMapFragment supportMapFragment = (SupportMapFragment)activity.getSupportFragmentManager().findFragmentById(R.id.homeMap);
		Button mapLock = activity.findViewById(R.id.homeMapLock);
		Factory_SetupMap setupMapFactory = new Factory_SetupMap(supportMapFragment, mapLock, permission);
		
		return setupMapFactory.onMapReady();
	}
}
