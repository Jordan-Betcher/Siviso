package com.jordan.betcher.siviso.siviso.map;

import android.content.Context;
import android.location.LocationManager;
import android.view.View;
import android.widget.Button;

import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.jordan.betcher.siviso.siviso.A_Activity;
import com.jordan.betcher.siviso.siviso.R;
import com.jordan.betcher.siviso.siviso.lock.A_Lock;
import com.jordan.betcher.siviso.siviso.permissions.Permission;
import com.jordan.betcher.siviso.siviso.permissions.Permission_AccessFineLocation;

public class A_Map
{
	public A_Map(A_Activity activity)
	{
		SupportMapFragment supportMapFragment = (SupportMapFragment)activity.getSupportFragmentManager().findFragmentById(
		R.id.homeMap);
		LocationManager locationManager = (LocationManager)activity.getSystemService(Context.LOCATION_SERVICE);
		Button mapLock = activity.findViewById(R.id.mapLock);
		View mapView = supportMapFragment.getView();
		
		Permission accessFineLocationPermission = new Permission_AccessFineLocation(activity);
		
		A_Lock viewLock = new A_Lock(mapView, mapLock, accessFineLocationPermission);
		
		
		A_OnMapReadyCallback_Map map = new A_OnMapReadyCallback_Map();
		OnUnlock_AddOnMapReady addOnMapReady = new OnUnlock_AddOnMapReady(supportMapFragment, map);
		viewLock.addOnUnlock(addOnMapReady);
	}
	
}
