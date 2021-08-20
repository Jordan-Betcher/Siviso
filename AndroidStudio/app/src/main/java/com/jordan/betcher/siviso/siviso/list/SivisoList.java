package com.jordan.betcher.siviso.siviso.list;

import com.google.android.gms.maps.model.LatLng;

public interface SivisoList
{
	void select(LatLng latLng);
	
	void addOnSelect(OnSelect onSelect);
	
	LatLng selected();
}
