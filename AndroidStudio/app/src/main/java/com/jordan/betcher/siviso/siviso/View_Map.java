package com.jordan.betcher.siviso.siviso;

import android.content.Context;
import android.location.LocationManager;
import android.widget.Button;

import com.google.android.gms.maps.SupportMapFragment;

import java.util.concurrent.locks.Lock;

class View_Map
{
	public View_Map(MainActivity mainActivity)
	{
		SupportMapFragment supportMapFragment = (SupportMapFragment)mainActivity.getSupportFragmentManager().findFragmentById(R.id.homeMap);
		LocationManager locationManager = (LocationManager)mainActivity.getSystemService(Context.LOCATION_SERVICE);
		Button mapLock = mainActivity.findViewById(R.id.mapLock);
		permissionFineLocation = new Permission$AccessFineLocation(this);
		
		Lock lock = new Lock_Map(supportMapFragment, mapLock, )
	}
}
