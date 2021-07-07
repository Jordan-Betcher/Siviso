package com.jordan.betcher.siviso.siviso.map;

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.Circle;
import com.jordan.betcher.siviso.siviso.list.SivisoList;

class A_OnCircleClickListener_SelectSiviso implements GoogleMap.OnCircleClickListener
{
	private SivisoList sivisoList;
	
	public A_OnCircleClickListener_SelectSiviso(SivisoList sivisoList)
	{
		this.sivisoList = sivisoList;
	}
	
	@Override
	public void onCircleClick(Circle circle)
	{
		sivisoList.select(circle.getCenter());
	}
}
