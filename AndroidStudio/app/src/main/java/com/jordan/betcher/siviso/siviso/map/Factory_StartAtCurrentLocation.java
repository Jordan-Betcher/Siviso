package com.jordan.betcher.siviso.siviso.map;

import android.content.Context;
import android.location.Criteria;
import android.location.LocationManager;

import com.jordan.betcher.siviso.siviso.R;
import com.jordan.betcher.siviso.siviso.permissions.Permission_AccessFineLocation;

public class Factory_StartAtCurrentLocation
{
	private Context context;
	private Permission_AccessFineLocation permission;
	
	public Factory_StartAtCurrentLocation(Context context, Permission_AccessFineLocation permission)
	{
		this.context = context;
		this.permission = permission;
	}
	
	public OnMapReady_LocationListener_StartAtCurrentLocation create()
	{
		LocationManager locationManager = (LocationManager)context.getSystemService(
		Context.LOCATION_SERVICE);
		float zoom = (float)context.getResources().getInteger(R.integer.initial_zoom_times_a_hundred) / 100;
		OnMapReady_LocationListener_StartAtCurrentLocation startAtCurrentLocation = new OnMapReady_LocationListener_StartAtCurrentLocation(zoom);
		Factory_Criteria_Accurate accurateCriteriaFactory = new Factory_Criteria_Accurate();
		Criteria accurateCriteria = accurateCriteriaFactory.build();
		OnPermissionGranted_RequestSingleUpdate requestSingleUpdate = new OnPermissionGranted_RequestSingleUpdate(locationManager, accurateCriteria, startAtCurrentLocation);
		permission.addOnGranted(requestSingleUpdate);
		return startAtCurrentLocation;
	}
}
