package com.jordan.betcher.siviso.siviso.database;

import com.google.android.gms.maps.model.LatLng;

public class Siviso
{
	String name;
	LatLng latLng;
	double radius;
	boolean isOn;
	
	public Siviso(String name, LatLng latLng, double radius, boolean isOn)
	{
		this.name = name;
		this.latLng = latLng;
		this.radius = radius;
		this.isOn = isOn;
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
	
	public boolean isOn()
	{
		//TODO isOn
		return true;
		//return isOn;
	}
	
	public void setIsOn(boolean isOn)
	{
		//TODO this.isOn = isOn;
	}
}
