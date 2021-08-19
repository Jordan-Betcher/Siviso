package com.jordan.betcher.siviso.siviso.map;

import androidx.annotation.NonNull;

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.LatLng;

class OnMapClickListener_SelectCircle implements GoogleMap.OnMapClickListener
{
	Wrapper_Circle circle;
	private Wrapper_GoogleMap googleMap;
	private Factory_CircleOptions_NewSivisoCircle factory;
	
	public OnMapClickListener_SelectCircle(Wrapper_GoogleMap googleMap, Factory_CircleOptions_NewSivisoCircle factory)
	{
		this.googleMap = googleMap;
		this.factory = factory;
	}
	
	@Override
	public void onMapClick(@NonNull LatLng latLng)
	{
		if(circle != null)
		{
			circle.setCenter(latLng);
		}
		circle = googleMap.createCircle(factory.create(latLng));
	}
}
