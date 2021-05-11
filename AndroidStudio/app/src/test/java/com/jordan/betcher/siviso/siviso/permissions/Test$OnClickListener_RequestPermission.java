package com.jordan.betcher.siviso.siviso.permissions;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

public class Test$OnClickListener_RequestPermission
{
	@Test
	public void _permission_0Request()
	{
		Permission permission = mock(Permission.class);
		
		new OnClickListener_RequestPermission(permission);
		
		verify(permission, times(0)).request();
	}
	
	@Test
	public void onClick_permission_request()
	{
		Permission permission = mock(Permission.class);
		
		OnClickListener_RequestPermission requestPermission = new OnClickListener_RequestPermission(permission);
		requestPermission.onClick(null);
		
		verify(permission, times(1)).request();
	}
}