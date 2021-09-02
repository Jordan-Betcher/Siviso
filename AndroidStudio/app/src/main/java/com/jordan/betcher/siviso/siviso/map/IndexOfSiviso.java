package com.jordan.betcher.siviso.siviso.map;

import com.google.android.gms.maps.model.LatLng;
import com.jordan.betcher.siviso.siviso.database.Database;
import com.jordan.betcher.siviso.siviso.database.Siviso;

class IndexOfSiviso
{
	Siviso[] sivisos;
	
	public IndexOfSiviso(Database database)
	{
		//TODO IndexOfSiviso IndexOfSiviso
		this.sivisos = database.sivisos();
	}
	
	public int from(LatLng latLng)
	{
		for(int i = 0; i < sivisos.length; i++)
		{
			Siviso siviso = sivisos[i];
			if(siviso.latLng().equals(latLng)) return i;
		}
		return -1; //TODO IndexOfSiviso from
	}
	//TODO
}
