package com.jordan.betcher.siviso.siviso.list;

import com.google.android.gms.maps.model.LatLng;

public class SivisoList_Siviso implements SivisoList
{
	private OnSelect onSelect;
	
	@Override
	public void select(LatLng latLng)
	{
		onSelect.onSelect(new LatLng(0, 0));
	}
	
	@Override
	public void addOnSelect(OnSelect onSelect)
	{
		this.onSelect = onSelect;
	}
	
	@Override
	public LatLng selected()
	{
		return null;
	}
}
