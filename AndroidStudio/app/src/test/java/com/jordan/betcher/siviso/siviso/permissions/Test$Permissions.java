package com.jordan.betcher.siviso.siviso.permissions;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class Test$Permissions
{
	@Test
	public void addOnGrantedGrant_permission2NotGranted_0Granted()
	{
		Permission permission1 = mock(Permission.class);
		Permission permission2 = mock(Permission.class);
		when(permission1.isGranted()).thenReturn(true);
		when(permission2.isGranted()).thenReturn(false);
		OnPermissionGranted onPermissionGranted = mock(OnPermissionGranted.class);
		
		Permissions permissions = new Permissions(permission1, permission2);
		permissions.addOnGranted(onPermissionGranted);
		permissions.grant();
		
		verify(onPermissionGranted, times(0)).granted();
	}
	
	@Test
	public void addOnGranted_permission2NotGranted_0Granted()
	{
		Permission permission1 = mock(Permission.class);
		Permission permission2 = mock(Permission.class);
		when(permission1.isGranted()).thenReturn(true);
		when(permission2.isGranted()).thenReturn(false);
		OnPermissionGranted onPermissionGranted = mock(OnPermissionGranted.class);
		
		Permissions permissions = new Permissions(permission1, permission2);
		permissions.addOnGranted(onPermissionGranted);
		
		verify(onPermissionGranted, times(0)).granted();
	}
	
	@Test
	public void addOnGrantedGrantGrant_permissionNotGrantedGranted_1GrantedAfter()
	{
		Permission permission = mock(Permission.class);
		when(permission.isGranted()).thenReturn(false);
		OnPermissionGranted onPermissionGranted = mock(OnPermissionGranted.class);
		
		Permissions permissions = new Permissions(permission);
		permissions.addOnGranted(onPermissionGranted);
		when(permission.isGranted()).thenReturn(true);
		permissions.grant();
		permissions.grant();
		
		verify(onPermissionGranted, times(1)).granted();
	}
	
	@Test
	public void addOnGrantedGrant_permissionGranted_1granted()
	{
		Permission permission = mock(Permission.class);
		when(permission.isGranted()).thenReturn(true);
		OnPermissionGranted onPermissionGranted = mock(OnPermissionGranted.class);
		
		Permissions permissions = new Permissions(permission);
		permissions.addOnGranted(onPermissionGranted);
		permissions.grant();
		
		verify(onPermissionGranted, times(1)).granted();
	}
	
	@Test
	public void addOnGrantedGrant_onPermissionGranted1onPermissionGranted2_onPermissionGranted1Granted()
	{
		Permission permission = mock(Permission.class);
		when(permission.isGranted()).thenReturn(false);
		OnPermissionGranted onPermissionGranted1 = mock(OnPermissionGranted.class);
		OnPermissionGranted onPermissionGranted2 = mock(OnPermissionGranted.class);
		
		Permissions permissions = new Permissions(permission);
		permissions.addOnGranted(onPermissionGranted1);
		permissions.addOnGranted(onPermissionGranted2);
		when(permission.isGranted()).thenReturn(true);
		permissions.grant();
		
		verify(onPermissionGranted1, times(1)).granted();
	}
	
	@Test
	public void addOnGrantedGrant_permissionNotGrantedNotGranted_0Granted()
	{
		Permission permission = mock(Permission.class);
		when(permission.isGranted()).thenReturn(false);
		OnPermissionGranted onPermissionGranted = mock(OnPermissionGranted.class);
		
		Permissions permissions = new Permissions(permission);
		permissions.addOnGranted(onPermissionGranted);
		when(permission.isGranted()).thenReturn(false);
		permissions.grant();
		
		verify(onPermissionGranted, times(0)).granted();
	}
	
	@Test
	public void addOnGrantedGrant_permissionNotGrantedGranted_grantedAfter()
	{
		Permission permission = mock(Permission.class);
		when(permission.isGranted()).thenReturn(false);
		OnPermissionGranted onPermissionGranted = mock(OnPermissionGranted.class);
		
		Permissions permissions = new Permissions(permission);
		permissions.addOnGranted(onPermissionGranted);
		when(permission.isGranted()).thenReturn(true);
		permissions.grant();
		
		verify(onPermissionGranted, times(1)).granted();
	}
	
	@Test
	public void addOnGranted_permissionNotGranted_0Granted()
	{
		Permission permission = mock(Permission.class);
		when(permission.isGranted()).thenReturn(false);
		OnPermissionGranted onPermissionGranted = mock(OnPermissionGranted.class);
		
		Permissions permissions = new Permissions(permission);
		permissions.addOnGranted(onPermissionGranted);
		
		verify(onPermissionGranted, times(0)).granted();
	}
	
	@Test
	public void addOnGranted_permissionGranted_granted()
	{
		Permission permission = mock(Permission.class);
		when(permission.isGranted()).thenReturn(true);
		OnPermissionGranted onPermissionGranted = mock(OnPermissionGranted.class);
		
		Permissions permissions = new Permissions(permission);
		permissions.addOnGranted(onPermissionGranted);
		
		verify(onPermissionGranted, times(1)).granted();
	}
	
	@Test
	public void grant_permission1Permission2_permission2Grant()
	{
		Permission permission1 = mock(Permission.class);
		Permission permission2 = mock(Permission.class);
		
		Permissions permissions = new Permissions(permission1, permission2);
		permissions.grant();
		
		verify(permission2, times(1)).grant();
	}
	
	@Test
	public void _permission1Permission2_0Permission1Grant()
	{
		Permission permission1 = mock(Permission.class);
		Permission permission2 = mock(Permission.class);
		
		Permissions permissions = new Permissions(permission1, permission2);
		
		verify(permission1, times(0)).grant();
	}
	
	@Test
	public void grant_permission1Permission2_permission1Grant()
	{
		Permission permission1 = mock(Permission.class);
		Permission permission2 = mock(Permission.class);
		
		Permissions permissions = new Permissions(permission1, permission2);
		permissions.grant();
		
		verify(permission1, times(1)).grant();
	}
	
	@Test
	public void request_permission1Granted_0Permission1Request()
	{
		Permission permission1 = mock(Permission.class);
		when(permission1.isGranted()).thenReturn(true);
		
		Permissions permissions = new Permissions(permission1);
		permissions.request();
		
		verify(permission1, times(0)).request();
	}
	
	@Test
	public void request_permission1UngrantedPermission2Ungranted_false()
	{
		Permission permission1 = mock(Permission.class);
		Permission permission2 = mock(Permission.class);
		when(permission1.isGranted()).thenReturn(true);
		when(permission2.isGranted()).thenReturn(false);
		
		Permissions permissions = new Permissions(permission1, permission2);
		permissions.request();
		
		boolean actual = permissions.isGranted();
		assertFalse(actual);
	}
	
	@Test
	public void isGranted_permission1ungranted_false()
	{
		Permission permission1 = mock(Permission.class);
		when(permission1.isGranted()).thenReturn(false);
		
		Permissions permissions = new Permissions(permission1);
		permissions.request();
		
		boolean actual = permissions.isGranted();
		assertFalse(actual);
	}
	
	@Test
	public void isGranted_permission1Granted_true()
	{
		Permission permission1 = mock(Permission.class);
		when(permission1.isGranted()).thenReturn(true);
		
		Permissions permissions = new Permissions(permission1);
		permissions.request();
		
		boolean actual = permissions.isGranted();
		assertTrue(actual);
	}
	
	@Test
	public void request_permission2Ungranted_permission2Request()
	{
		Permission permission1 = mock(Permission.class);
		Permission permission2 = mock(Permission.class);
		when(permission1.isGranted()).thenReturn(false);
		when(permission2.isGranted()).thenReturn(false);
		
		Permissions permissions = new Permissions(permission1, permission2);
		permissions.request();
		
		verify(permission2, times(1)).request();
	}
	
	@Test
	public void _permission1Ungranted_0Permission1Request()
	{
		Permission permission1 = mock(Permission.class);
		when(permission1.isGranted()).thenReturn(false);
		
		Permissions permissions = new Permissions(permission1);
		
		verify(permission1, times(0)).request();
	}
	
	@Test
	public void request_permission1Ungranted_permission1Request()
	{
		Permission permission1 = mock(Permission.class);
		when(permission1.isGranted()).thenReturn(false);
		
		Permissions permissions = new Permissions(permission1);
		permissions.request();
		
		verify(permission1, times(1)).request();
	}
}