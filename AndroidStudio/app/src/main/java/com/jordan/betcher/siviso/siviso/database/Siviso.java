package com.jordan.betcher.siviso.siviso.database;

import com.google.android.gms.maps.model.LatLng;

public class Siviso
{
	String name;
	LatLng latLng;
	double radius;
	Ringmode ringmode;
	
	public Siviso(String name, LatLng latLng, double radius, Ringmode ringmode)
	{
		this.name = name;
		this.latLng = latLng;
		this.radius = radius;
		this.ringmode = ringmode;
	}
	
	
	public String name()
	{
		return name;
	}
	
	public LatLng latLng()
	{
		return latLng;
	}
	
	public double radius()
	{
		return radius;
	}
	
	public Ringmode ringmode()
	{
		return ringmode;
	}
	
	public void setRingmode(Ringmode ringmode)
	{
		this.ringmode = ringmode;
	}
}
