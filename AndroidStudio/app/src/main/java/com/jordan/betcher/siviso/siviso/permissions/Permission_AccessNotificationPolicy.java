package com.jordan.betcher.siviso.siviso.permissions;

import android.app.Activity;

public class Permission_AccessNotificationPolicy implements Permission
{
	
	public Permission_AccessNotificationPolicy(Activity activity, Intent_PermissionSettingNotification permissionSettingNotification)
	{
		activity.startActivityForResult(permissionSettingNotification, 1);
	}
	
	@Override
	public void request()
	{
		//TODO
	}
	
	@Override
	public void addOnGranted(
	OnPermissionGranted onPermissionGranted)
	{
		//TODO
	}
	
	@Override
	public boolean isGranted()
	{
		return false;
	}
	
	@Override
	public void grant()
	{
		//TODO
	}
}
