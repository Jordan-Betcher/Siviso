package com.jordan.betcher.siviso.siviso.map;

import android.location.Criteria;
import android.location.LocationManager;

import com.jordan.betcher.siviso.siviso.permissions.OnPermissionGranted;

class OnPermissionGranted_RequestSingleUpdate implements OnPermissionGranted
{
	public OnPermissionGranted_RequestSingleUpdate(
	LocationManager locationManager,
	Factory_Criteria_Accurate accurateCriteriaFactory,
	OnMapReady_LocationListener_StartAtCurrentLocation startAtCurrentLocation)
	{
	
	}
	
	@Override
	public void granted()
	{
		//Criteria criteria = accurateFactory.build();
		//locationManager.requestSingleUpdate(criteria, startAtCurrentLocation, null);
	}
}
