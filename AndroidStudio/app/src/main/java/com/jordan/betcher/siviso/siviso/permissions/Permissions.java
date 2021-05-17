package com.jordan.betcher.siviso.siviso.permissions;

import java.util.ArrayList;

public class Permissions implements Permission
{
	private Permission[] permissionArray;
	private ArrayList<OnPermissionGranted> onPermissionGranteds = new ArrayList<>();
	
	public Permissions(Permission... permissionArray)
	{
		this.permissionArray = permissionArray;
	}
	
	@Override
	public boolean isGranted()
	{
		for(Permission permission : permissionArray)
		{
			if(permission.isGranted() == false)
			{
				return false;
			}
		}
		
		return true;
	}
	
	@Override
	public void request()
	{
		for(Permission permission : permissionArray)
		{
			if(permission.isGranted() == false)
			{
				permission.request();
			}
		}
	}
	
	@Override
	public void grant()
	{
		ifIsGrantedThenAllOnPermissionGrantedAndClear();
		
		for(Permission permission : permissionArray)
		{
			permission.grant();
		}
	}
	
	@Override
	public void addOnGranted(OnPermissionGranted onPermissionGranted)
	{
		onPermissionGranteds.add(onPermissionGranted);
		ifIsGrantedThenAllOnPermissionGrantedAndClear();
	}
	
	private void ifIsGrantedThenAllOnPermissionGrantedAndClear()
	{
		if(isGranted())
		{
			for(OnPermissionGranted onPermissionGranted : onPermissionGranteds)
			{
				onPermissionGranted.granted();
			}
			
			onPermissionGranteds.clear();
		}
	}
}
