package com.jordan.betcher.siviso.siviso.map;

import androidx.annotation.NonNull;

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.LatLng;
import com.jordan.betcher.siviso.siviso.database.PossibleSivisoData;

class OnMapClickListener_SelectCircle implements GoogleMap.OnMapClickListener
{
	Wrapper_Circle circle;
	private Wrapper_GoogleMap googleMap;
	private Factory_CircleOptions_NewSivisoCircle factory;
	private PossibleSivisoData possibleSivisoData;
	
	public OnMapClickListener_SelectCircle(Wrapper_GoogleMap googleMap, Factory_CircleOptions_NewSivisoCircle factory, PossibleSivisoData possibleSivisoData)
	{
		this.googleMap = googleMap;
		this.factory = factory;
		this.possibleSivisoData = possibleSivisoData;
	}
	
	@Override
	public void onMapClick(@NonNull LatLng latLng)
	{
		if(circle != null)
		{
			circle.setCenter(latLng);
		}
		else
		{
			circle = googleMap.createCircle(factory.create(latLng));
		}
		possibleSivisoData.setLatLng(latLng);
	}
}
