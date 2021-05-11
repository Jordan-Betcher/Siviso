package com.jordan.betcher.siviso.siviso.permissions;

public class Permissions implements Permission
{
	public Permissions(Permission... permissionArray)
	{
	
	}
	
	@Override
	public boolean isGranted()
	{
		return false;
	}
	
	@Override
	public void request()
	{
	
	}
	
	@Override
	public void addOnGranted(OnGranted unlock)
	{
	
	}
}
