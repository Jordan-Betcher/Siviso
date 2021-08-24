package com.jordan.betcher.siviso.siviso.database;

import com.google.android.gms.maps.model.LatLng;

public class Siviso
{
	private final String name;
	private LatLng latLng;
	private final int radius;
	private final Ringmode ringmode;
	
	public Siviso(String name, LatLng latLng, int radius, Ringmode ringmode)
	{
		this.name = name;
		this.latLng = latLng;
		this.radius = radius;
		this.ringmode = ringmode;
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
		return name;
	}
}
