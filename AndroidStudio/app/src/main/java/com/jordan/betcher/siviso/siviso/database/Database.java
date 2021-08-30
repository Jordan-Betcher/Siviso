package com.jordan.betcher.siviso.siviso.database;

import com.google.android.gms.maps.model.LatLng;

public interface Database
{
	Ringmode defaultRingmode();
	
	void setDefaultRingmode(Ringmode ringmodeFromPosition);
	
	Siviso[] sivisos();
	
	void setRingmode(int sivisoIndex, Ringmode ringmode);
	
	void saveNewSiviso(PossibleSiviso possibleSiviso);
	
	void delete(LatLng selected);
}
