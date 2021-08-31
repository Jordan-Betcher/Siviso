package com.jordan.betcher.siviso.siviso.map;

import androidx.annotation.NonNull;

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.LatLng;
import com.jordan.betcher.siviso.siviso.database.Database;
import com.jordan.betcher.siviso.siviso.database.Siviso;

class OnMapClickListener_SaveNewSiviso
implements GoogleMap.OnMapClickListener
{
	private Database database;
	private Factory_Siviso factorySiviso;
	
	public OnMapClickListener_SaveNewSiviso(Database database, Factory_Siviso factorySiviso)
	{
		this.database = database;
		this.factorySiviso = factorySiviso;
	}
	
	@Override
	public void onMapClick(@NonNull LatLng latLng)
	{
		Siviso siviso = factorySiviso.create(latLng);
		database.save(siviso);
	}
}
