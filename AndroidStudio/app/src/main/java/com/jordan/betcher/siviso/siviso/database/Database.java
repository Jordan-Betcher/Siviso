package com.jordan.betcher.siviso.siviso.database;

import com.google.android.gms.maps.model.LatLng;

import java.util.ArrayList;

public interface Database
{
	Ringmode defaultRingmode();
	
	void setDefaultRingmode(Ringmode ringmodeFromPosition);
	
	int count();
	
	ArrayList<Siviso> sivisos();
	
	//TODO change from int ringmodeIndex to Ringmode ringmode
	void setRingmode(int sivisoIndex, int ringmodeIndex);
	
	LatLng sivisoLatLng(int index);
	
	void saveNewSiviso(PossibleSiviso possibleSiviso);
	
	void delete(LatLng selected);
}
