package com.jordan.betcher.siviso.siviso.list;

import com.google.android.gms.maps.model.LatLng;

import java.util.ArrayList;

public class SivisoList_Siviso implements SivisoList
{
	private ArrayList<OnSelect> onSelects = new ArrayList<>();
	
	@Override
	public void select(LatLng latLng)
	{
		for(OnSelect onSelect : onSelects)
		{
			onSelect.onSelect(latLng);
		}
	}
	
	@Override
	public void addOnSelect(OnSelect onSelect)
	{
		onSelects.add(onSelect);
	}
	
	@Override
	public LatLng selected()
	{
		return null;
	}
}
