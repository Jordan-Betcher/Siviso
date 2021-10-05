package com.jordan.betcher.siviso.siviso.permissions;

import android.app.Activity;
import android.app.NotificationManager;
import android.content.Context;

import com.jordan.betcher.siviso.siviso.thirdparty.BuildVersion;

import main.java.com.betcher.jordan.helper.library.event.atCaller.AtCaller;

public class Factory_PermissionAccessNotificationPolicy
{
	public Permission_AccessNotificationPolicy createPermission(Activity activity)
	{
		Intent_PermissionSettingNotification permissionSettingNotification = new Intent_PermissionSettingNotification();
		AtCaller atCaller = new AtCaller();
		NotificationManager notificationManager = (NotificationManager) activity.getSystemService(
		Context.NOTIFICATION_SERVICE);
		BuildVersion buildVersion = new BuildVersion();
		IsGranted_AccessNotificationPolicy isGranted_accessNotificationPolicy = new IsGranted_AccessNotificationPolicy(notificationManager, buildVersion);
		return new Permission_AccessNotificationPolicy(activity, permissionSettingNotification, atCaller, isGranted_accessNotificationPolicy);
	}
}
