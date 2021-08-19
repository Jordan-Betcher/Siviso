package com.jordan.betcher.siviso.siviso.database;

import com.google.android.gms.maps.model.LatLng;

public class PossibleSivisoData
{
	int siviso;
	LatLng latLng;
	
	public void addOnComplete(OnComplete onComplete)
	{
		onComplete.onComplete(this);
	}
	
	public void setLatLng(LatLng latLng)
	{
	
	}
	
	public void setSiviso(int index)
	{
	
	}
}
