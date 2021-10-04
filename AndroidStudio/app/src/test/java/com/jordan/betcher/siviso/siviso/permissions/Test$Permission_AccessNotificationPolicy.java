package com.jordan.betcher.siviso.siviso.permissions;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import android.app.Activity;

import org.junit.Test;

import main.java.com.betcher.jordan.helper.library.event.Event;

public class Test$Permission_AccessNotificationPolicy
{
	@Test
	public void isGranted__false()
	{
		Event event = mock(Event.class);
		
		Permission_AccessNotificationPolicy permission = new Permission_AccessNotificationPolicy(null, null, event);
		
		boolean actualIsGranted = permission.isGranted();
		assertFalse(actualIsGranted);
	}
	
	@Test
	public void isGrantedGrant__true()
	{
		Event event = mock(Event.class);
		
		Permission_AccessNotificationPolicy permission = new Permission_AccessNotificationPolicy(null, null, event);
		permission.grant();
		
		boolean actualIsGranted = permission.isGranted();
		assertTrue(actualIsGranted);
	}
	
	@Test
	public void addOnGranted_onPermissionGranted_addOnPermissionGranted()
	{
		OnPermissionGranted onPermissionGranted = mock(OnPermissionGranted.class);
		Event event = mock(Event.class);
		
		Permission_AccessNotificationPolicy permission = new Permission_AccessNotificationPolicy(null, null, event);
		permission.addOnGranted(onPermissionGranted);
		
		verify(event, times(1)).add(onPermissionGranted);
	}
	
	@Test
	public void __0startActivityForResult()
	{
		Activity activity = mock(Activity.class);
		Intent_PermissionSettingNotification permissionSettingNotification = mock(Intent_PermissionSettingNotification.class);
		
		new Permission_AccessNotificationPolicy(activity, permissionSettingNotification, null);
		
		verify(activity, times(0)).startActivityForResult(any(), anyInt());
	}
	
	@Test
	public void request__startActivityForResult()
	{
		Activity activity = mock(Activity.class);
		Intent_PermissionSettingNotification permissionSettingNotification = mock(Intent_PermissionSettingNotification.class);
		
		Permission_AccessNotificationPolicy permission = new Permission_AccessNotificationPolicy(activity, permissionSettingNotification, null);
		permission.request();
		
		verify(activity, times(1)).startActivityForResult(permissionSettingNotification, 1);
	}
}