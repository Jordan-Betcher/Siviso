package com.jordan.betcher.siviso.siviso;

import android.content.Context;
import android.location.LocationManager;
import android.view.View;
import android.widget.Button;

import com.google.android.gms.maps.SupportMapFragment;
import com.jordan.betcher.siviso.siviso.lock.Lock;
import com.jordan.betcher.siviso.siviso.lock.OnUnlock;
import com.jordan.betcher.siviso.siviso.permissions.Permission;
import com.jordan.betcher.siviso.siviso.permissions.Permission_AccessFineLocation;
import com.jordan.betcher.siviso.siviso.permissions.PermissionsButton;
import com.jordan.betcher.siviso.siviso.viewMap.OnUnlock_InitializeMap;

class View_Map
{
	public View_Map(MainActivity activity)
	{
		SupportMapFragment supportMapFragment = (SupportMapFragment)activity.getSupportFragmentManager().findFragmentById(R.id.homeMap);
		LocationManager locationManager = (LocationManager)activity.getSystemService(Context.LOCATION_SERVICE);
		Button mapLock = activity.findViewById(R.id.mapLock);
		View map = supportMapFragment.getView();
		
		Permission accessFineLocation = new Permission_AccessFineLocation(activity);
		PermissionsButton permissionsButton = new PermissionsButton(mapLock, accessFineLocation);
		
		Lock lock = new Lock(map, mapLock, permissionsButton);
		OnUnlock initializeMap = new OnUnlock_InitializeMap(supportMapFragment);
		lock.addOnUnlock(initializeMap);
	}
}
