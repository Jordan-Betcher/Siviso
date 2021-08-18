package com.jordan.betcher.siviso.siviso.map;

import com.google.android.gms.maps.GoogleMap;
import com.jordan.betcher.siviso.siviso.list.SivisoList;

public class Factory_AddOnCircleClickSelectSiviso
{
	private SivisoList sivisoList;
	
	public Factory_AddOnCircleClickSelectSiviso(SivisoList sivisoList)
	{
		this.sivisoList = sivisoList;
	}
	
	public OnMapReady_AddOnCircleClickListener create()
	{
		GoogleMap.OnCircleClickListener listener = new A_OnCircleClickListener_SelectSiviso(sivisoList);
		return new OnMapReady_AddOnCircleClickListener(listener);
	}
}
