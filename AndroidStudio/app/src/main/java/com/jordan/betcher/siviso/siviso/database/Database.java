package com.jordan.betcher.siviso.siviso.database;

import com.google.android.gms.maps.model.LatLng;

public interface Database
{
	Ringmode defaultRingmode();
	
	void setDefaultRingmode(Ringmode ringmode);
	
	Siviso[] sivisos();
	
	void setRingmode(int sivisoIndex, Ringmode ringmode);
	
	void delete(LatLng selected);
	
	void save(Siviso siviso);
	
	void addOnDataChange(OnDataChanged onDataChanged);
}
