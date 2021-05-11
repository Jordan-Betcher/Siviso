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