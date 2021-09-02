package com.jordan.betcher.siviso.siviso.map;

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.Circle;
import com.google.android.gms.maps.model.LatLng;
import com.jordan.betcher.siviso.siviso.list.SivisoList;

class A_OnCircleClickListener_SelectSiviso implements GoogleMap.OnCircleClickListener
{
	private SivisoList sivisoList;
	private IndexOfSiviso indexOfSiviso;
	
	public A_OnCircleClickListener_SelectSiviso(
	SivisoList sivisoList, IndexOfSiviso indexOfSiviso)
	{
		this.sivisoList = sivisoList;
		this.indexOfSiviso = indexOfSiviso;
	}
	
	@Override
	public void onCircleClick(Circle circle)
	{
		LatLng latLng = circle.getCenter();
		int index = indexOfSiviso.from(latLng);
		sivisoList.select(index);
	}
}
