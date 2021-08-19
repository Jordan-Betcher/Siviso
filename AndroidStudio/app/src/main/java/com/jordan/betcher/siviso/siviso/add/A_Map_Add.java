package com.jordan.betcher.siviso.siviso.add;

import android.widget.Button;

import com.google.android.gms.maps.SupportMapFragment;
import com.jordan.betcher.siviso.siviso.R;
import com.jordan.betcher.siviso.siviso.database.PossibleSivisoData;
import com.jordan.betcher.siviso.siviso.map.Factory_EnableCurrentLocation;
import com.jordan.betcher.siviso.siviso.map.Factory_SelectCircle;
import com.jordan.betcher.siviso.siviso.map.Factory_SetupMap;
import com.jordan.betcher.siviso.siviso.map.Factory_StartAtCurrentLocation;
import com.jordan.betcher.siviso.siviso.map.OnMapReady_AddOnMapClick_SelectCircle;
import com.jordan.betcher.siviso.siviso.map.OnMapReady_CallOnMapReadys;
import com.jordan.betcher.siviso.siviso.map.OnMapReady_LocationListener_StartAtCurrentLocation;
import com.jordan.betcher.siviso.siviso.map.OnMapReady_OnPermissionGranted_EnableCurrentLocation;
import com.jordan.betcher.siviso.siviso.permissions.Permission_AccessFineLocation;

class A_Map_Add
{
	public A_Map_Add(
	A_Activity_Add activity, PossibleSivisoData possibleSivisoData,
	Permission_AccessFineLocation permission)
	{
		SupportMapFragment supportMapFragment = (SupportMapFragment)activity.getSupportFragmentManager().findFragmentById(R.id.addMap);
		Button mapLock = activity.findViewById(R.id.addMapLock);
		
		Factory_SetupMap setupMapFactory = new Factory_SetupMap(supportMapFragment, mapLock, permission);
		Factory_EnableCurrentLocation enableCurrentLocationFactory = new Factory_EnableCurrentLocation(permission);
		Factory_StartAtCurrentLocation startAtCurrentLocationFactory = new Factory_StartAtCurrentLocation(activity, permission);
		Factory_SelectCircle selectCircleFactory = new Factory_SelectCircle(possibleSivisoData);
		
		OnMapReady_CallOnMapReadys multiple = setupMapFactory.onMapReady();
		OnMapReady_OnPermissionGranted_EnableCurrentLocation enableCurrentLocation = enableCurrentLocationFactory.create();
		OnMapReady_LocationListener_StartAtCurrentLocation startAtCurrentLocation = startAtCurrentLocationFactory.create();
		OnMapReady_AddOnMapClick_SelectCircle selectCircle = selectCircleFactory.create();
		
		multiple.add(enableCurrentLocation);
		multiple.add(startAtCurrentLocation);
		multiple.add(selectCircle);
	}
	
}
