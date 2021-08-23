package com.jordan.betcher.siviso.siviso.database;

import com.google.android.gms.maps.model.LatLng;

public interface Database
{
	Ringmode defaultRingmode();
	
	void setDefaultRingmode(Ringmode ringmodeFromPosition);
	
	int count();
	
	Siviso[] sivisos();
	
	//TODO change from int ringmodeIndex to Ringmode ringmode
	void setRingmode(int sivisoIndex, int ringmodeIndex);
	
	//TODO change this to just get siviso instead of latlng
	LatLng sivisoLatLng(int index);
	
	void saveNewSiviso(PossibleSiviso possibleSiviso);
	
	void delete(LatLng selected);
}
