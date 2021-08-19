package com.jordan.betcher.siviso.siviso.database;

import com.google.android.gms.maps.model.LatLng;

public class PossibleSivisoData
{
	private OnComplete onComplete;
	
	public void setOnComplete(OnComplete onComplete)
	{
		this.onComplete = onComplete;
	}
	
	public void setLatLng(LatLng latLng)
	{
		onComplete.onComplete(this);
	}
	
	public void setSiviso(int index)
	{
	
	}
}
