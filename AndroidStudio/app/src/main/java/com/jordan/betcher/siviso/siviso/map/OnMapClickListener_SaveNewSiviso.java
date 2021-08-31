package com.jordan.betcher.siviso.siviso.map;

import androidx.annotation.NonNull;

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.LatLng;
import com.jordan.betcher.siviso.siviso.database.Database;

class OnMapClickListener_SaveNewSiviso
implements GoogleMap.OnMapClickListener
{
	public OnMapClickListener_SaveNewSiviso(Database database, Factory_Siviso factorySiviso)
	{
		database.save(factorySiviso.create(new LatLng(0, 0)));
	}
	
	@Override
	public void onMapClick(@NonNull LatLng latLng)
	{
	
	}
	//TODO
}
