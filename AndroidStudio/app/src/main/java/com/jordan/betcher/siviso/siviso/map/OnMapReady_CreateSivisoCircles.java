package com.jordan.betcher.siviso.siviso.map;

import com.google.android.gms.maps.model.CircleOptions;
import com.jordan.betcher.siviso.siviso.database.SivisoData;

import java.util.ArrayList;

class OnMapReady_CreateSivisoCircles implements OnMapReady
{
	private ArrayList<SivisoData> sivisoDatas;
	private Factory_CircleOptions factory;
	private OnCircleClicked onCircleClicked;
	
	public OnMapReady_CreateSivisoCircles(
	ArrayList<SivisoData> sivisoDatas, Factory_CircleOptions factory,
	OnCircleClicked onCircleClicked)
	{
		this.sivisoDatas = sivisoDatas;
		this.factory = factory;
		this.onCircleClicked = onCircleClicked;
	}
	
	@Override
	public void ready(Wrapper_GoogleMap googleMap)
	{
		for(SivisoData sivisoData : sivisoDatas)
		{
			CircleOptions circleOptions = factory.create(sivisoData);
			Wrapper_Circle circle = googleMap.createCircle(circleOptions);
			circle.add(onCircleClicked);
		}
	}
}
