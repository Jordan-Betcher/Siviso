package com.jordan.betcher.siviso.siviso.permissions;

import android.content.Intent;

public class Intent_PermissionSettingNotification extends Intent
{
	public Intent_PermissionSettingNotification()
	{
		super(android.provider.Settings.ACTION_NOTIFICATION_POLICY_ACCESS_SETTINGS);
	}
}
