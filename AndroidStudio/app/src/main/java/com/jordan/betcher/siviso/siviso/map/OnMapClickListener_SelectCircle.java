package com.jordan.betcher.siviso.siviso.map;

import androidx.annotation.NonNull;

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.LatLng;

class OnMapClickListener_SelectCircle implements GoogleMap.OnMapClickListener
{
	public OnMapClickListener_SelectCircle(Wrapper_GoogleMap googleMap, Factory_CircleOptions_NewSivisoCircle factory)
	{
		googleMap.createCircle(factory.create(new LatLng(0, 0)));
	}
	
	@Override
	public void onMapClick(@NonNull LatLng latLng)
	{
	//TODO
	}
}
