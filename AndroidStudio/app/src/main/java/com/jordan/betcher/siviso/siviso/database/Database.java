package com.jordan.betcher.siviso.siviso.database;

import com.google.android.gms.maps.model.LatLng;

import java.util.ArrayList;

public interface Database
{
	Siviso defaultSiviso();
	
	void setDefaultSiviso(Siviso sivisoFromPosition);
	
	int count();
	
	ArrayList<SivisoData> sivisos();
	
	void setSiviso(int sivisoIndex, int itemIndex);
	
	LatLng sivisoLatLng(int index);
}
