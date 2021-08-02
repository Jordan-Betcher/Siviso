package com.jordan.betcher.siviso.siviso.list;

import android.view.View;

import com.jordan.betcher.siviso.siviso.map.SivisoMap;

class OnClickListener_GoToCurrentLocation implements View.OnClickListener
{
	private SivisoMap sivisoMap;
	
	public OnClickListener_GoToCurrentLocation(SivisoMap sivisoMap)
	{
		this.sivisoMap = sivisoMap;
	}
	
	@Override
	public void onClick(View view)
	{
		sivisoMap.goToCurrentLocation();
	}
}
