package com.jordan.betcher.siviso.siviso.permissions;

import android.annotation.SuppressLint;
import android.app.Activity;

import main.java.com.betcher.jordan.helper.library.event.atCaller.AtCaller;

public class Permission_AccessNotificationPolicy implements Permission
{
	
	private final Activity activity;
	private final Intent_PermissionSettingNotification permissionSettingNotification;
	private AtCaller atCaller;
	private IsGranted_AccessNotificationPolicy isGranted;
	
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
		atPermissionGranted.call();
		if(!isGranted.isGranted()) atCaller.add(atPermissionGranted, 1);
		//TODO run grant
	}
	
	
	@SuppressLint("NewApi")
	@Override
	public boolean isGranted()
	{
		return false; //TODO
	}
	
	@SuppressLint("NewApi")
	@Override
	public void grant()
	{
		//TODO
	}
}
