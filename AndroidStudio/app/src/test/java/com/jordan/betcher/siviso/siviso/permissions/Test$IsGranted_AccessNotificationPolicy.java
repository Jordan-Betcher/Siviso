package com.jordan.betcher.siviso.siviso.permissions;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import android.app.NotificationManager;
import android.os.Build;

import com.jordan.betcher.siviso.siviso.thirdparty.BuildVersion;

import org.junit.Test;

public class Test$IsGranted_AccessNotificationPolicy
{
	@Test
	public void isGranted_versionMGrantedFalse_false()
	{
		boolean granted = false;
		int version = Build.VERSION_CODES.M;
		NotificationManager notificationManager = mock(NotificationManager.class);
		when(notificationManager.isNotificationPolicyAccessGranted()).thenReturn(granted);
		BuildVersion buildVersion = mock(BuildVersion.class);
		when(buildVersion.buildVersion()).thenReturn(version);
		
		IsGranted_AccessNotificationPolicy isGranted = new IsGranted_AccessNotificationPolicy(
		notificationManager, buildVersion);
		
		boolean actualGranted = isGranted.isGranted();
		assertEquals(granted, actualGranted);
	}
	
	@Test
	public void isGranted_version0_0isNotificationPolicyAccessGranted()
	{
		int version = 0;
		NotificationManager notificationManager = mock(NotificationManager.class);
		BuildVersion buildVersion = mock(BuildVersion.class);
		when(buildVersion.buildVersion()).thenReturn(version);
		
		IsGranted_AccessNotificationPolicy isGranted = new IsGranted_AccessNotificationPolicy(
		notificationManager, buildVersion);
		isGranted.isGranted();
		
		verify(notificationManager, times(0)).isNotificationPolicyAccessGranted();
	}
	
	@Test
	public void isGranted_versionMminus1_0isNotificationPolicyAccessGranted()
	{
		int version = Build.VERSION_CODES.M - 1;
		NotificationManager notificationManager = mock(NotificationManager.class);
		BuildVersion buildVersion = mock(BuildVersion.class);
		when(buildVersion.buildVersion()).thenReturn(version);
		
		IsGranted_AccessNotificationPolicy isGranted = new IsGranted_AccessNotificationPolicy(
		notificationManager, buildVersion);
		isGranted.isGranted();
		
		verify(notificationManager, times(0)).isNotificationPolicyAccessGranted();
	}
	
	@Test
	public void isGranted_versionM_isNotificationPolicyAccessGranted()
	{
		int version = Build.VERSION_CODES.M;
		NotificationManager notificationManager = mock(NotificationManager.class);
		BuildVersion buildVersion = mock(BuildVersion.class);
		when(buildVersion.buildVersion()).thenReturn(version);
		
		IsGranted_AccessNotificationPolicy isGranted = new IsGranted_AccessNotificationPolicy(
		notificationManager, buildVersion);
		isGranted.isGranted();
		
		verify(notificationManager, times(1)).isNotificationPolicyAccessGranted();
	}
	
	@Test
	public void isGranted_version0_true()
	{
		int version = 0;
		NotificationManager notificationManager = mock(NotificationManager.class);
		BuildVersion buildVersion = mock(BuildVersion.class);
		when(buildVersion.buildVersion()).thenReturn(version);
		
		IsGranted_AccessNotificationPolicy isGranted = new IsGranted_AccessNotificationPolicy(
		notificationManager, buildVersion);
		
		boolean actualGranted = isGranted.isGranted();
		assertTrue(actualGranted);
	}
}