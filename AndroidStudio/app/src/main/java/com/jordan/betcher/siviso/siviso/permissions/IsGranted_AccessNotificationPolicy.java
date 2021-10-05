package com.jordan.betcher.siviso.siviso.permissions;

import android.app.NotificationManager;

import com.jordan.betcher.siviso.siviso.thirdparty.BuildVersion;

class IsGranted_AccessNotificationPolicy implements IsGranted
{
	public IsGranted_AccessNotificationPolicy(
	NotificationManager notificationManager,
	BuildVersion buildVersion)
	{
	
	}
	
	@Override
	public boolean isGranted()
	{
		return false;//TODO
	}
}
