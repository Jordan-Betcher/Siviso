package com.jordan.betcher.siviso.siviso.map;

import java.util.ArrayList;

class OnMapReady_Multiple
{
	private ArrayList<OnMapReady> onMapReadys = new ArrayList<>();
	private Wrapper_GoogleMap googleMap;
	
	public void onMapReady(Wrapper_GoogleMap googleMap)
	{
		this.googleMap = googleMap;
		
		for(OnMapReady onMapReady : onMapReadys)
		{
			onMapReady.ready(googleMap);
		}
	}
	
	public void add(OnMapReady onMapReady)
	{
		onMapReadys.add(onMapReady);
		
		if(googleMap != null)
		{
			onMapReady.ready(googleMap);
		}
	}
}
