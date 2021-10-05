package com.jordan.betcher.siviso.siviso.permissions;

import android.annotation.SuppressLint;
import android.app.NotificationManager;
import android.os.Build;

import com.jordan.betcher.siviso.siviso.thirdparty.BuildVersion;

class IsGranted_AccessNotificationPolicy implements IsGranted
{
	private final NotificationManager notificationManager;
	private final BuildVersion buildVersion;
	
	public IsGranted_AccessNotificationPolicy(
	NotificationManager notificationManager,
	BuildVersion buildVersion)
	{
		this.notificationManager = notificationManager;
		this.buildVersion = buildVersion;
	}
	
	@SuppressLint("NewApi")
	@Override
	public boolean isGranted()
	{
		if(buildVersion.buildVersion() < Build.VERSION_CODES.M){ return true; }
		return notificationManager.isNotificationPolicyAccessGranted();
	}
}
