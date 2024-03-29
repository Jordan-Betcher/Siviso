package com.jordan.betcher.siviso.siviso.map;

import android.annotation.SuppressLint;
import android.location.Criteria;
import android.location.LocationListener;
import android.location.LocationManager;

import com.jordan.betcher.siviso.siviso.permissions.OnPermissionGranted;

class OnPermissionGranted_RequestSingleUpdate implements OnPermissionGranted
{
	private final LocationManager locationManager;
	private final Criteria criteria;
	private final LocationListener locationListener;
	
	public OnPermissionGranted_RequestSingleUpdate(
	LocationManager locationManager,
	Criteria criteria,
	LocationListener locationListener)
	{
		this.locationManager = locationManager;
		this.criteria = criteria;
		this.locationListener = locationListener;
	}
	
	@SuppressLint("MissingPermission")
	@Override
	public void granted()
	{
		locationManager.requestSingleUpdate(criteria, locationListener, null);
	}
}
