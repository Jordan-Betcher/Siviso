package com.jordan.betcher.siviso.siviso.database;

import com.google.android.gms.maps.model.LatLng;

public class Siviso
{
	private LatLng latLng;
	
	public Siviso(String name, LatLng latLng, int radius, Ringmode ringmode)
	{
		
		this.latLng = latLng;
	}
	
	public LatLng latLng()
	{
		return latLng;
	}
	
	public double radius()
	{
		return 0;
	}
	
	public int color()
	{
		return 0;
	}
	
	public Ringmode siviso()
	{
		return null;
	}
	
	public String name()
	{
		return "A";
	}
}
