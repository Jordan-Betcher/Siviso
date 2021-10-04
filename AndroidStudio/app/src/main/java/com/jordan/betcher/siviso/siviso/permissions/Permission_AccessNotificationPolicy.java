package com.jordan.betcher.siviso.siviso.permissions;

import android.app.Activity;

public class Permission_AccessNotificationPolicy implements Permission
{
	
	private final Activity activity;
	private final Intent_PermissionSettingNotification permissionSettingNotification;
	
	public Permission_AccessNotificationPolicy(Activity activity, Intent_PermissionSettingNotification permissionSettingNotification)
	{
		this.activity = activity;
		this.permissionSettingNotification = permissionSettingNotification;
	}
	
	@Override
	public void request()
	{
		activity.startActivityForResult(permissionSettingNotification, 1);
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
