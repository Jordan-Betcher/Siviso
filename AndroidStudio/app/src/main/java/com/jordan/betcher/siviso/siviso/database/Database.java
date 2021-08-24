package com.jordan.betcher.siviso.siviso.database;

import com.google.android.gms.maps.model.LatLng;

public interface Database
{
	Ringmode defaultRingmode();
	
	void setDefaultRingmode(Ringmode ringmodeFromPosition);
	
	int count();
	
	Siviso[] sivisos();
	
	void setRingmode(int sivisoIndex, int ringmodeIndex);
	
	LatLng sivisoLatLng(int index);
	
	void saveNewSiviso(PossibleSiviso possibleSiviso);
	
	void delete(LatLng selected);
}
