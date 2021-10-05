package com.jordan.betcher.siviso.siviso.permissions;

import android.annotation.SuppressLint;
import android.app.Activity;

import main.java.com.betcher.jordan.helper.library.event.atCaller.AtCaller;

public class Permission_AccessNotificationPolicy implements Permission
{
	
	private final Activity activity;
	private final Intent_PermissionSettingNotification permissionSettingNotification;
	private final AtCaller atCaller;
	private final IsGranted_AccessNotificationPolicy isGranted;
	
	public Permission_AccessNotificationPolicy(
	Activity activity, Intent_PermissionSettingNotification permissionSettingNotification,
	AtCaller atCaller, IsGranted_AccessNotificationPolicy isGranted)
	{
		this.activity = activity;
		this.permissionSettingNotification = permissionSettingNotification;
		this.atCaller = atCaller;
		this.isGranted = isGranted;
	}
	
	@Override
	public void request()
	{
		activity.startActivityForResult(permissionSettingNotification, 1);
	}
	
	@Override
	public void addOnGranted(AtPermissionGranted atPermissionGranted)
	{
		if(isGranted.isGranted()) atPermissionGranted.call();
		else atCaller.add(atPermissionGranted, 1);
	}
	
	
	@SuppressLint("NewApi")
	@Override
	public boolean isGranted()
	{
		return true;
	}
	
	@SuppressLint("NewApi")
	@Override
	public void grant()
	{
		//TODO
	}
}
