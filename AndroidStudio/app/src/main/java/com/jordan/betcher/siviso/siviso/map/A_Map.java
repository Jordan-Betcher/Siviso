package com.jordan.betcher.siviso.siviso.map;

import android.content.Context;
import android.location.Criteria;
import android.location.LocationManager;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.SupportMapFragment;
import com.jordan.betcher.siviso.siviso.R;
import com.jordan.betcher.siviso.siviso.database.Database;
import com.jordan.betcher.siviso.siviso.database.SivisoData;
import com.jordan.betcher.siviso.siviso.list.SivisoList;
import com.jordan.betcher.siviso.siviso.lock.A_Lock;
import com.jordan.betcher.siviso.siviso.permissions.Permission;
import com.jordan.betcher.siviso.siviso.permissions.Permission_AccessFineLocation;

import java.util.ArrayList;

public class A_Map
{
	
	public A_Map(
	AppCompatActivity activity,
	OnMapReady_CallOnMapReadys multiple,
	SupportMapFragment supportMapFragment,
	Button mapLock,
	Permission_AccessFineLocation permission, Database database,
	SivisoList sivisoList)
	{
		A_Lock viewLock = createViewLock(mapLock, permission, supportMapFragment);
		setupMultiple(multiple, supportMapFragment, viewLock);
		
		enableCurrentLocation(permission, multiple);
		startAtCurrentLocation(activity, permission, multiple);
		onMapReadyCreateCircles(multiple, database.sivisos());
		onMapReadyAddOnCircleClick(multiple, sivisoList);
	}
	
	private void onMapReadyAddOnCircleClick(
	OnMapReady_CallOnMapReadys multiple,
	SivisoList sivisoList)
	{
		GoogleMap.OnCircleClickListener listener = new A_OnCircleClickListener_SelectSiviso(sivisoList);
		OnMapReady onMapReady = new OnMapReady_AddOnCircleClickListener(listener);
		multiple.add(onMapReady);
	}
	
	private void onMapReadyCreateCircles(
	OnMapReady_CallOnMapReadys multiple, ArrayList<SivisoData> sivisoDatas)
	{
		Factory_CircleOptions factory = new Factory_CircleOptions();
		OnMapReady createSiviso = new OnMapReady_CreateSivisoCircles(sivisoDatas, factory);
		multiple.add(createSiviso);
	}
	
	private A_Lock createViewLock(Button mapLock, Permission_AccessFineLocation permission, SupportMapFragment supportMapFragment)
	{
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
