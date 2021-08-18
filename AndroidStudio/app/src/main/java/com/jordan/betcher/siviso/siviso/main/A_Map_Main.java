package com.jordan.betcher.siviso.siviso.main;

import androidx.appcompat.app.AppCompatActivity;

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
	public A_Map_Main(
	AppCompatActivity activity,
	Permission_AccessFineLocation permission, Database database,
	SivisoList sivisoList)
	{
//		Button mapLock = activity.findViewById(R.id.homeMapLock);
//		SupportMapFragment supportMapFragment = (SupportMapFragment)this.getSupportFragmentManager().findFragmentById(R.id.homeMap);
		
		Factory_SetupMap setupMapFactory = new Factory_SetupMap();
		Factory_EnableCurrentLocation enableCurrentLocationFactory = new Factory_EnableCurrentLocation();
		Factory_StartAtCurrentLocation startAtCurrentLocationFactory = new Factory_StartAtCurrentLocation();
		Factory_CreateCircles createCirclesFactory = new Factory_CreateCircles();
		Factory_AddOnCircleClickSelectSiviso addOnCircleClickSelectSivisoFactory = new Factory_AddOnCircleClickSelectSiviso();
		
		OnMapReady_CallOnMapReadys onMapReady = setupMapFactory.onMapReady();
		OnMapReady_OnPermissionGranted_EnableCurrentLocation enableCurrentLocation = enableCurrentLocationFactory.create();
		OnMapReady_LocationListener_StartAtCurrentLocation startAtCurrentLocation = startAtCurrentLocationFactory.create();
		OnMapReady_CreateSivisoCircles createSivisoCircles = createCirclesFactory.create();
		OnMapReady_AddOnCircleClickListener selectSiviso = addOnCircleClickSelectSivisoFactory.create();
		
		onMapReady.add(enableCurrentLocation);
		onMapReady.add(startAtCurrentLocation);
		onMapReady.add(createSivisoCircles);
		onMapReady.add(selectSiviso);
	}
}
