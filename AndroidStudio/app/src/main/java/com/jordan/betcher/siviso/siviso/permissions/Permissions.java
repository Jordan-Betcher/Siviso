package com.jordan.betcher.siviso.siviso.permissions;

public class Permissions implements Permission
{
	private Permission[] permissionArray;
	
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
	public void addOnGranted(OnGranted onGranted)
	{
	
	}
}
