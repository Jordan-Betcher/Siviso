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

import java.util.ArrayList;

public class A_Map
{
	
	public A_Map(
	A_Activity activity, OnMapReady_CallOnMapReadys multiple,
	Permission_AccessFineLocation permission, ArrayList<SivisoData> sivisoDatas,
	OnCircleClicked onCircleClicked)
	{
		SupportMapFragment supportMapFragment = (SupportMapFragment)activity.getSupportFragmentManager().findFragmentById(R.id.homeMap);
		A_Lock viewLock = createViewLock(activity, permission, supportMapFragment);
		setupMultiple(multiple, supportMapFragment, viewLock);
		
		enableCurrentLocation(permission, multiple);
		startAtCurrentLocation(activity, permission, multiple);
		onMapReadyCreateCircles(multiple, sivisoDatas, onCircleClicked);
		onMapReadyAddOnCircleClick(multiple, onCircleClicked);
	}
	
	private void onMapReadyAddOnCircleClick(
	OnMapReady_CallOnMapReadys multiple,
	OnCircleClicked onCircleClicked)
	{
		OnMapReady onMapReady = new OnMapReady_AddOnCircleClick(onCircleClicked);
		multiple.add(onMapReady);
	}
	
	private void onMapReadyCreateCircles(
	OnMapReady_CallOnMapReadys multiple, ArrayList<SivisoData> sivisoDatas,
	OnCircleClicked onCircleClicked)
	{
		Factory_CircleOptions factory = new Factory_CircleOptions();
		OnMapReady createSiviso = new OnMapReady_CreateSivisoCircles(sivisoDatas, factory, onCircleClicked);
		multiple.add(createSiviso);
	}
	
	private A_Lock createViewLock(A_Activity activity, Permission_AccessFineLocation permission, SupportMapFragment supportMapFragment)
	{
		Button mapLock = activity.findViewById(R.id.mapLock);
		View mapView = supportMapFragment.getView();
		return new A_Lock(mapView, mapLock, permission);
	}
	
	private void setupMultiple(
	OnMapReady_CallOnMapReadys multiple,
	SupportMapFragment supportMapFragment, A_Lock viewLock)
	{
		A_OnMapReadyCallback_OnMapReady onMapReadyCallback = new A_OnMapReadyCallback_OnMapReady(multiple);
		OnUnlock_AddOnMapReadyCallback addOnMapReadyCallback = new OnUnlock_AddOnMapReadyCallback(supportMapFragment, onMapReadyCallback);
		viewLock.addOnUnlock(addOnMapReadyCallback);
	}
	
	private void startAtCurrentLocation(
	Context context,
	Permission_AccessFineLocation permission,
	OnMapReady_CallOnMapReadys multiple)
	{
		LocationManager locationManager = (LocationManager)context.getSystemService(Context.LOCATION_SERVICE);
		float zoom = (float)context.getResources().getInteger(R.integer.initial_zoom_times_a_hundred)/100;
		OnMapReady_LocationListener_StartAtCurrentLocation startAtCurrentLocation = new OnMapReady_LocationListener_StartAtCurrentLocation(zoom);
		Factory_Criteria_Accurate accurateCriteriaFactory = new Factory_Criteria_Accurate();
		Criteria accurateCriteria = accurateCriteriaFactory.build();
		OnPermissionGranted_RequestSingleUpdate requestSingleUpdate = new OnPermissionGranted_RequestSingleUpdate(locationManager, accurateCriteria, startAtCurrentLocation);
		permission.addOnGranted(requestSingleUpdate);
		multiple.add(startAtCurrentLocation);
	}
	
	private void enableCurrentLocation(
	Permission permission,
	OnMapReady_CallOnMapReadys multiple)
	{
		OnMapReady_OnPermissionGranted_EnableCurrentLocation enableCurrentLocation = new OnMapReady_OnPermissionGranted_EnableCurrentLocation();
		permission.addOnGranted(enableCurrentLocation);
		multiple.add(enableCurrentLocation);
	}
	
}
