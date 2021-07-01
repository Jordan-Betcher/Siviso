package com.jordan.betcher.siviso.siviso.map;

import android.content.Context;
import android.location.Criteria;
import android.location.LocationManager;
import android.view.View;
import android.widget.Button;

import com.google.android.gms.maps.SupportMapFragment;
import com.jordan.betcher.siviso.siviso.A_Activity;
import com.jordan.betcher.siviso.siviso.R;
import com.jordan.betcher.siviso.siviso.database.SivisoData;
import com.jordan.betcher.siviso.siviso.lock.A_Lock;
import com.jordan.betcher.siviso.siviso.permissions.Permission;
import com.jordan.betcher.siviso.siviso.permissions.Permission_AccessFineLocation;

public class A_Map
{
	
	public A_Map(A_Activity activity, Permission_AccessFineLocation permission, SivisoData sivisoLatLng)
	{
		SupportMapFragment supportMapFragment = (SupportMapFragment)activity.getSupportFragmentManager().findFragmentById(R.id.homeMap);
		
		A_Lock viewLock = createViewLock(activity, permission, supportMapFragment);
		OnMapReady_Multiple multiple = createMultiple(supportMapFragment, viewLock);
		
		enableCurrentLocation(permission, multiple);
		startAtCurrentLocation(activity, permission, multiple);
		onMapReadyIfLatLngExistsCreateCircle(multiple, sivisoLatLng);
		//onClickSetSivisoLatLng();
	}
	
	private void onMapReadyIfLatLngExistsCreateCircle(
	OnMapReady_Multiple multiple, SivisoData sivisoLatLng)
	{
		Factory_CircleOptions factory = new Factory_CircleOptions();
		OnMapReady createSiviso = new OnMapReady_CreateSivisoCircleIfExists(sivisoLatLng, factory);
		multiple.add(createSiviso);
	}
	
	private A_Lock createViewLock(A_Activity activity, Permission_AccessFineLocation permission, SupportMapFragment supportMapFragment)
	{
		Button mapLock = activity.findViewById(R.id.mapLock);
		View mapView = supportMapFragment.getView();
		A_Lock viewLock = new A_Lock(mapView, mapLock, permission);
		return viewLock;
	}
	
	private OnMapReady_Multiple createMultiple(SupportMapFragment supportMapFragment, A_Lock viewLock)
	{
		OnMapReady_Multiple	multiple = new OnMapReady_Multiple();
		A_OnMapReadyCallback_OnMapReady onMapReadyCallback = new A_OnMapReadyCallback_OnMapReady(multiple);
		OnUnlock_AddOnMapReadyCallback addOnMapReadyCallback = new OnUnlock_AddOnMapReadyCallback(supportMapFragment, onMapReadyCallback);
		viewLock.addOnUnlock(addOnMapReadyCallback);
		return multiple;
	}
	
	private void startAtCurrentLocation(
	Context context,
	Permission_AccessFineLocation permission,
	OnMapReady_Multiple multiple)
	{
		LocationManager locationManager = (LocationManager)context.getSystemService(Context.LOCATION_SERVICE);
		float zoom = context.getResources().getInteger(R.integer.initial_zoom_times_a_hundred)/100;
		OnMapReady_LocationListener_StartAtCurrentLocation startAtCurrentLocation = new OnMapReady_LocationListener_StartAtCurrentLocation(zoom);
		Factory_Criteria_Accurate accurateCriteriaFactory = new Factory_Criteria_Accurate();
		Criteria accurateCriteria = accurateCriteriaFactory.build();
		OnPermissionGranted_RequestSingleUpdate requestSingleUpdate = new OnPermissionGranted_RequestSingleUpdate(locationManager, accurateCriteria, startAtCurrentLocation);
		permission.addOnGranted(requestSingleUpdate);
		multiple.add(startAtCurrentLocation);
	}
	
	private void enableCurrentLocation(
	Permission permission,
	OnMapReady_Multiple multiple)
	{
		OnMapReady_OnPermissionGranted_EnableCurrentLocation enableCurrentLocation = new OnMapReady_OnPermissionGranted_EnableCurrentLocation();
		permission.addOnGranted(enableCurrentLocation);
		multiple.add(enableCurrentLocation);
	}
	
}
