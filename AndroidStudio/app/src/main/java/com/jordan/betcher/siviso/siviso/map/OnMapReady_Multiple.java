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
		
		onMapReadys.clear();
	}
	
	public void add(OnMapReady onMapReady)
	{
		if(googleMap != null)
		{
			onMapReady.ready(googleMap);
		}
		else if(notAlreadyAdded(onMapReady))
		{
			onMapReadys.add(onMapReady);
		}
	}
	
	private boolean notAlreadyAdded(OnMapReady onMapReady)
	{
		return !onMapReadys.contains(onMapReady);
	}
}
