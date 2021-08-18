package com.jordan.betcher.siviso.siviso.map;

import com.jordan.betcher.siviso.siviso.permissions.Permission_AccessFineLocation;

public class Factory_EnableCurrentLocation
{
	private Permission_AccessFineLocation permission;
	
	public Factory_EnableCurrentLocation(Permission_AccessFineLocation permission)
	{
		this.permission = permission;
	}
	
	public OnMapReady_OnPermissionGranted_EnableCurrentLocation create()
	{
		OnMapReady_OnPermissionGranted_EnableCurrentLocation enableCurrentLocation = new OnMapReady_OnPermissionGranted_EnableCurrentLocation();
		permission.addOnGranted(enableCurrentLocation);
		return enableCurrentLocation;
	}
}
