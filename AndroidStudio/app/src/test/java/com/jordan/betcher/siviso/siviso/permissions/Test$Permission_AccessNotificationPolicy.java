package com.jordan.betcher.siviso.siviso.permissions;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import android.app.Activity;

import org.junit.Test;

import main.java.com.betcher.jordan.helper.library.event.atCaller.AtCaller;

public class Test$Permission_AccessNotificationPolicy
{
	@Test
	public void addOnGranted_onPermissionGranted_addOnPermissionGranted()
	{
		AtPermissionGranted atPermissionGranted = mock(AtPermissionGranted.class);
		AtCaller atCaller = mock(AtCaller.class);
		IsGranted_AccessNotificationPolicy isGranted = mock(IsGranted_AccessNotificationPolicy.class);
		
		Permission_AccessNotificationPolicy permission = new Permission_AccessNotificationPolicy(null, null, atCaller,
		                                                                                         isGranted);
		permission.addOnGranted(atPermissionGranted);
		
		verify(atCaller, times(1)).add(atPermissionGranted, 1);
	}
	
	@Test
	public void __0startActivityForResult()
	{
		Activity activity = mock(Activity.class);
		Intent_PermissionSettingNotification permissionSettingNotification = mock(Intent_PermissionSettingNotification.class);
		IsGranted_AccessNotificationPolicy isGranted = mock(IsGranted_AccessNotificationPolicy.class);
		
		new Permission_AccessNotificationPolicy(activity, permissionSettingNotification, null,
		                                        isGranted);
		
		verify(activity, times(0)).startActivityForResult(any(), anyInt());
	}
	
	@Test
	public void request__startActivityForResult()
	{
		Activity activity = mock(Activity.class);
		Intent_PermissionSettingNotification permissionSettingNotification = mock(Intent_PermissionSettingNotification.class);
		IsGranted_AccessNotificationPolicy isGranted = mock(IsGranted_AccessNotificationPolicy.class);
		
		Permission_AccessNotificationPolicy permission = new Permission_AccessNotificationPolicy(activity, permissionSettingNotification, null,
		                                                                                         isGranted);
		permission.request();
		
		verify(activity, times(1)).startActivityForResult(permissionSettingNotification, 1);
	}
}