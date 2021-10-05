package com.jordan.betcher.siviso.siviso.permissions;

import android.app.Activity;
import android.app.NotificationManager;
import android.os.Build;

import com.jordan.betcher.siviso.siviso.thirdparty.BuildVersion;

import main.java.com.betcher.jordan.helper.library.event.Event;

public class Permission_AccessNotificationPolicy implements Permission
{
	
	private final Activity activity;
	private final Intent_PermissionSettingNotification permissionSettingNotification;
	private Event event;
	private final NotificationManager notificationManager;
	private final BuildVersion buildVersion;
	
	public Permission_AccessNotificationPolicy(
	Activity activity, Intent_PermissionSettingNotification permissionSettingNotification,
	Event event, NotificationManager notificationManager,
	BuildVersion buildVersion)
	{
		this.activity = activity;
		this.permissionSettingNotification = permissionSettingNotification;
		this.event = event;
		this.notificationManager = notificationManager;
		this.buildVersion = buildVersion;
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
	
	
	@Override
	public boolean isGranted()
	{
		//TODO
		if( buildVersion.buildVersion() >= Build.VERSION_CODES.M) return false;
		return true;
	}
	
	@Override
	public void grant()
	{
		//TODO
	}
}
