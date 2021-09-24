package com.jordan.betcher.siviso.siviso.map;

import com.jordan.betcher.siviso.siviso.database.Database;
import com.jordan.betcher.siviso.siviso.database.OnDataChange;

public class OnMapReady_CreateSivisoCircles implements OnMapReady, OnDataChange
{
	private Database database;
	private Factory_Circles factory;
	Circles circles;
	
	public OnMapReady_CreateSivisoCircles(
	Database database, Factory_Circles factory)
	{
		this.database = database;
		this.factory = factory;
	}
	
	@Override
	public void ready(Wrapper_GoogleMap googleMap)
	{
		circles = factory.create(googleMap);
		circles.setCircles(database.sivisos());
	}
	
	@Override
	public void dataChanged()
	{
		if(circles != null) circles.setCircles(database.sivisos());
	}
}
