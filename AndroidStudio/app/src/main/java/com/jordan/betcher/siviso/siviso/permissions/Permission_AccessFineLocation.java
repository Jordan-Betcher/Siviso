package com.jordan.betcher.siviso.siviso.permissions;

import com.jordan.betcher.siviso.siviso.A_Activity;

public class Permission_AccessFineLocation implements Permission
{
	public Permission_AccessFineLocation(A_Activity activity)
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
