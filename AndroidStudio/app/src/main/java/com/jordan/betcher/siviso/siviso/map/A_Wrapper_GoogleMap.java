package com.jordan.betcher.siviso.siviso.map;

import android.annotation.SuppressLint;
import android.location.Location;

import com.google.android.gms.maps.CameraUpdate;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.LatLng;

class A_Wrapper_GoogleMap implements Wrapper_GoogleMap
{
	private GoogleMap googleMap;
	
	public A_Wrapper_GoogleMap(GoogleMap googleMap)
	{
		this.googleMap = googleMap;
	}
	
	@SuppressLint("MissingPermission")
	@Override
	public void enableCurrentLocation()
	{
		googleMap.setMyLocationEnabled(true);
	}
	
	@Override
	public void moveTo(Location location)
	{
		double latitude = location.getLatitude();
		double longitude = location.getLongitude();
		LatLng latLng = new LatLng(latitude, longitude);
		CameraUpdate cameraUpdate = CameraUpdateFactory.newLatLng(latLng);
		googleMap.moveCamera(cameraUpdate);
	}
}
