package com.jordan.betcher.siviso.siviso.lock;

import com.jordan.betcher.siviso.siviso.permissions.Permission;

import junit.framework.TestCase;

import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

public class Test$OnClickListener_RequestPermission
{
	@Test
	public void _permissions_0RequestPermissions()
	{
		Permission permission = mock(Permission.class);
		
		OnClickListener_RequestPermission requestPermission = new OnClickListener_RequestPermission(permission);
		
		verify(permission, times(0)).request();
	}
	
	@Test
	public void click_permissions_requestPermissions()
	{
		Permission permission = mock(Permission.class);
		
		OnClickListener_RequestPermission requestPermission = new OnClickListener_RequestPermission(permission);
		requestPermission.onClick(null);
		
		verify(permission, times(1)).request();
	}
}