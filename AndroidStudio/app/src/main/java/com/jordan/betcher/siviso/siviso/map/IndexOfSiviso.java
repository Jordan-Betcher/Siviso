package com.jordan.betcher.siviso.siviso.map;

import com.google.android.gms.maps.model.LatLng;
import com.jordan.betcher.siviso.siviso.database.Database;
import com.jordan.betcher.siviso.siviso.database.Siviso;

class IndexOfSiviso
{
	private Database database;
	
	public IndexOfSiviso(Database database)
	{
		this.database = database;
	}
	
	public int from(LatLng latLng)
	{
		Siviso[] sivisos = database.sivisos();
		for(int i = 0; i < sivisos.length; i++)
		{
			Siviso siviso = sivisos[i];
			if(siviso.latLng().equals(latLng)) return i;
		}
		return -1;
	}
}
