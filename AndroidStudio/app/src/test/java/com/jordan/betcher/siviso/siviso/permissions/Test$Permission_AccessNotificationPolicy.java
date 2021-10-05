package com.jordan.betcher.siviso.siviso.permissions;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import android.app.Activity;
import android.app.NotificationManager;
import android.os.Build;

import com.jordan.betcher.siviso.siviso.thirdparty.BuildVersion;

import org.junit.Test;

import main.java.com.betcher.jordan.helper.library.event.Event;

public class Test$Permission_AccessNotificationPolicy
{
	@Test
	public void grant_buildVersionMminus1PolicyNotGranted_call()
	{
		int version = Build.VERSION_CODES.M - 1;
		boolean isGranted = false;
		Event event = mock(Event.class);
		NotificationManager notificationManager = mock(NotificationManager.class);
		when(notificationManager.isNotificationPolicyAccessGranted()).thenReturn(isGranted);
		BuildVersion buildVersion = mock(BuildVersion.class);
		when(buildVersion.buildVersion()).thenReturn(version);
		
		Permission_AccessNotificationPolicy permission = new Permission_AccessNotificationPolicy(null, null, event, notificationManager, buildVersion);
		permission.grant();
		
		verify(event, times(1)).call();
	}
	
	@Test
	public void grant_buildVersion1PolicyNotGranted_call()
	{
		int version = 1;
		boolean isGranted = false;
		Event event = mock(Event.class);
		NotificationManager notificationManager = mock(NotificationManager.class);
		when(notificationManager.isNotificationPolicyAccessGranted()).thenReturn(isGranted);
		BuildVersion buildVersion = mock(BuildVersion.class);
		when(buildVersion.buildVersion()).thenReturn(version);
		
		Permission_AccessNotificationPolicy permission = new Permission_AccessNotificationPolicy(null, null, event, notificationManager, buildVersion);
		permission.grant();
		
		verify(event, times(1)).call();
	}
	
	@Test
	public void grant_buildVersion0PolicyNotGranted_call()
	{
		int version = 0;
		boolean isGranted = false;
		Event event = mock(Event.class);
		NotificationManager notificationManager = mock(NotificationManager.class);
		when(notificationManager.isNotificationPolicyAccessGranted()).thenReturn(isGranted);
		BuildVersion buildVersion = mock(BuildVersion.class);
		when(buildVersion.buildVersion()).thenReturn(version);
		
		Permission_AccessNotificationPolicy permission = new Permission_AccessNotificationPolicy(null, null, event, notificationManager, buildVersion);
		permission.grant();
		
		verify(event, times(1)).call();
	}
	
	@Test
	public void grant_buildVersionMPolicyNotGranted_0call()
	{
		int version = Build.VERSION_CODES.M;
		boolean isGranted = false;
		Event event = mock(Event.class);
		NotificationManager notificationManager = mock(NotificationManager.class);
		when(notificationManager.isNotificationPolicyAccessGranted()).thenReturn(isGranted);
		BuildVersion buildVersion = mock(BuildVersion.class);
		when(buildVersion.buildVersion()).thenReturn(version);
		
		Permission_AccessNotificationPolicy permission = new Permission_AccessNotificationPolicy(null, null, event, notificationManager, buildVersion);
		permission.grant();
		
		verify(event, times(0)).call();
	}
	
	@Test
	public void grant_buildVersion0PolicyGranted_call()
	{
		int version = 0;
		boolean isGranted = true;
		Event event = mock(Event.class);
		NotificationManager notificationManager = mock(NotificationManager.class);
		when(notificationManager.isNotificationPolicyAccessGranted()).thenReturn(isGranted);
		BuildVersion buildVersion = mock(BuildVersion.class);
		when(buildVersion.buildVersion()).thenReturn(version);
		
		Permission_AccessNotificationPolicy permission = new Permission_AccessNotificationPolicy(null, null, event, notificationManager, buildVersion);
		permission.grant();
		
		verify(event, times(1)).call();
	}
	
	@Test
	public void isGranted_buildVersionMPolicyGranted_true()
	{
		int version = Build.VERSION_CODES.M;
		boolean isGranted = true;
		NotificationManager notificationManager = mock(NotificationManager.class);
		when(notificationManager.isNotificationPolicyAccessGranted()).thenReturn(isGranted);
		BuildVersion buildVersion = mock(BuildVersion.class);
		when(buildVersion.buildVersion()).thenReturn(version);
		
		Permission_AccessNotificationPolicy permission = new Permission_AccessNotificationPolicy(null, null, null, notificationManager, buildVersion);
		
		boolean actualIsGranted = permission.isGranted();
		assertTrue(actualIsGranted);
	}
	
	@Test
	public void isGranted_buildVersionMplus1PolicyNotGranted_false()
	{
		int version = Build.VERSION_CODES.M + 1;
		boolean isGranted = false;
		NotificationManager notificationManager = mock(NotificationManager.class);
		when(notificationManager.isNotificationPolicyAccessGranted()).thenReturn(isGranted);
		BuildVersion buildVersion = mock(BuildVersion.class);
		when(buildVersion.buildVersion()).thenReturn(version);
		
		Permission_AccessNotificationPolicy permission = new Permission_AccessNotificationPolicy(null, null, null, notificationManager, buildVersion);
		
		boolean actualIsGranted = permission.isGranted();
		assertFalse(actualIsGranted);
	}
	
	@Test
	public void isGranted_buildVersionMPolicyNotGranted_false()
	{
		int version = Build.VERSION_CODES.M;
		boolean isGranted = false;
		NotificationManager notificationManager = mock(NotificationManager.class);
		when(notificationManager.isNotificationPolicyAccessGranted()).thenReturn(isGranted);
		BuildVersion buildVersion = mock(BuildVersion.class);
		when(buildVersion.buildVersion()).thenReturn(version);
		
		Permission_AccessNotificationPolicy permission = new Permission_AccessNotificationPolicy(null, null, null, notificationManager, buildVersion);
		
		boolean actualIsGranted = permission.isGranted();
		assertFalse(actualIsGranted);
	}
	
	@Test
	public void isGranted_policyGranted_true()
	{
		boolean isGranted = true;
		BuildVersion buildVersion = mock(BuildVersion.class);
		NotificationManager notificationManager = mock(NotificationManager.class);
		when(notificationManager.isNotificationPolicyAccessGranted()).thenReturn(isGranted);
		
		Permission_AccessNotificationPolicy permission = new Permission_AccessNotificationPolicy(null, null, null, notificationManager, buildVersion);
	
		boolean actualIsGranted = permission.isGranted();
		assertTrue(actualIsGranted);
	}
	
	@Test
	public void addOnGranted_onPermissionGranted_addOnPermissionGranted()
	{
		OnPermissionGranted onPermissionGranted = mock(OnPermissionGranted.class);
		Event event = mock(Event.class);
		
		Permission_AccessNotificationPolicy permission = new Permission_AccessNotificationPolicy(null, null, event,
		                                                                                         null,
		                                                                                         null);
		permission.addOnGranted(onPermissionGranted);
		
		verify(event, times(1)).add(onPermissionGranted);
	}
	
	@Test
	public void __0startActivityForResult()
	{
		Activity activity = mock(Activity.class);
		Intent_PermissionSettingNotification permissionSettingNotification = mock(Intent_PermissionSettingNotification.class);
		
		new Permission_AccessNotificationPolicy(activity, permissionSettingNotification, null,
		                                        null, null);
		
		verify(activity, times(0)).startActivityForResult(any(), anyInt());
	}
	
	@Test
	public void request__startActivityForResult()
	{
		Activity activity = mock(Activity.class);
		Intent_PermissionSettingNotification permissionSettingNotification = mock(Intent_PermissionSettingNotification.class);
		
		Permission_AccessNotificationPolicy permission = new Permission_AccessNotificationPolicy(activity, permissionSettingNotification, null,
		                                                                                         null,
		                                                                                         null);
		permission.request();
		
		verify(activity, times(1)).startActivityForResult(permissionSettingNotification, 1);
	}
}