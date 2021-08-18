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
	public A_Map_Main(
	AppCompatActivity activity,
	Permission_AccessFineLocation permission, Database database,
	SivisoList sivisoList)
	{
		SupportMapFragment supportMapFragment = (SupportMapFragment)activity.getSupportFragmentManager().findFragmentById(R.id.homeMap);
		Button mapLock = activity.findViewById(R.id.homeMapLock);
		
		Factory_SetupMap setupMapFactory = new Factory_SetupMap(supportMapFragment, mapLock, permission);
		Factory_EnableCurrentLocation enableCurrentLocationFactory = new Factory_EnableCurrentLocation(permission);
		Factory_StartAtCurrentLocation startAtCurrentLocationFactory = new Factory_StartAtCurrentLocation(activity, permission);
		Factory_CreateCircles createCirclesFactory = new Factory_CreateCircles(database);
		Factory_AddOnCircleClickSelectSiviso addOnCircleClickSelectSivisoFactory = new Factory_AddOnCircleClickSelectSiviso(sivisoList);
		
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
