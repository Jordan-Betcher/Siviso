package com.jordan.betcher.siviso.siviso.add;

import android.widget.Button;

import com.google.android.gms.maps.SupportMapFragment;
import com.jordan.betcher.siviso.siviso.R;
import com.jordan.betcher.siviso.siviso.database.Database;
import com.jordan.betcher.siviso.siviso.map.Factory_EnableCurrentLocation;
import com.jordan.betcher.siviso.siviso.map.Factory_SetupMap;
import com.jordan.betcher.siviso.siviso.map.Factory_StartAtCurrentLocation;
import com.jordan.betcher.siviso.siviso.map.OnMapReady_CallOnMapReadys;
import com.jordan.betcher.siviso.siviso.map.OnMapReady_LocationListener_StartAtCurrentLocation;
import com.jordan.betcher.siviso.siviso.map.OnMapReady_OnPermissionGranted_EnableCurrentLocation;
import com.jordan.betcher.siviso.siviso.permissions.Permission_AccessFineLocation;

class A_Map_Add
{
	public A_Map_Add(
	A_Activity_Add activity, Database database,
	Permission_AccessFineLocation permission)
	{
		Button mapLock = activity.findViewById(R.id.addMapLock);
		SupportMapFragment supportMapFragment = (SupportMapFragment)activity.getSupportFragmentManager().findFragmentById(R.id.addMap);
		
		Factory_SetupMap setupMapFactory = new Factory_SetupMap();
		Factory_EnableCurrentLocation enableCurrentLocationFactory = new Factory_EnableCurrentLocation(permission);
		Factory_StartAtCurrentLocation startAtCurrentLocationFactory = new Factory_StartAtCurrentLocation(activity, permission);
		
		OnMapReady_CallOnMapReadys multiple = setupMapFactory.onMapReady();
		OnMapReady_OnPermissionGranted_EnableCurrentLocation enableCurrentLocation = enableCurrentLocationFactory.create();
		OnMapReady_LocationListener_StartAtCurrentLocation startAtCurrentLocation = startAtCurrentLocationFactory.create();
		
		multiple.add(enableCurrentLocation);
		multiple.add(startAtCurrentLocation);
	}
	
	//enableCurrentLocation(permission, multiple);
	//startAtCurrentLocation(activity, permission, multiple);
	//TODO map OnClick set circle
	//TODO map onClick again move circle
	
}
