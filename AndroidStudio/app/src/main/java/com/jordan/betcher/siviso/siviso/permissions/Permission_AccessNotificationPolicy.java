package com.jordan.betcher.siviso.siviso.permissions;

import android.app.Activity;

import main.java.com.betcher.jordan.helper.library.event.Event;

public class Permission_AccessNotificationPolicy implements Permission
{
	
	private final Activity activity;
	private final Intent_PermissionSettingNotification permissionSettingNotification;
	private Event event;
	
	public Permission_AccessNotificationPolicy(Activity activity, Intent_PermissionSettingNotification permissionSettingNotification, Event event)
	{
		this.activity = activity;
		this.permissionSettingNotification = permissionSettingNotification;
		this.event = event;
	}
	
	@Override
	public void request()
	{
		activity.startActivityForResult(permissionSettingNotification, 1);
	}
	
	@Override
	public void addOnGranted(OnPermissionGranted onPermissionGranted)
	{
		event.add(onPermissionGranted);
	}
	
	boolean isGranted = false;
	
	@Override
	public boolean isGranted()
	{
		return isGranted;
	}
	
	@Override
	public void grant()
	{
		isGranted = !isGranted;
		//TODO
	}
}
