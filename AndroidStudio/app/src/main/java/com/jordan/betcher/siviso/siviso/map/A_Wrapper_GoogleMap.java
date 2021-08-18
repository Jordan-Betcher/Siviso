package com.jordan.betcher.siviso.siviso.map;

import android.annotation.SuppressLint;
import android.location.Location;

import com.google.android.gms.maps.CameraUpdate;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.Circle;
import com.google.android.gms.maps.model.CircleOptions;
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
	
	@Override
	public void zoomTo(float zoom)
	{
		CameraUpdate cameraUpdate = CameraUpdateFactory.zoomTo(zoom);
		googleMap.moveCamera(cameraUpdate);
	}
	
	@Override
	public Wrapper_Circle createCircle(CircleOptions circleOptions)
	{
		Circle circle = googleMap.addCircle(circleOptions);
		A_Wrapper_Circle wrapper_circle = new A_Wrapper_Circle(circle);
		return wrapper_circle;
	}
	
	@Override
	public void addOnCircleClickListener(
	GoogleMap.OnCircleClickListener onCircleClicked)
	{
		googleMap.setOnCircleClickListener(onCircleClicked);
	}
	
	@Override
	public void addOnMapClickListener(GoogleMap.OnMapClickListener listener)
	{
		googleMap.setOnMapClickListener(listener);
	}
}
