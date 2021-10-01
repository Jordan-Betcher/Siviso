package com.jordan.betcher.siviso.siviso.service;

import static org.mockito.Mockito.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import android.content.Context;
import android.os.Build;

import org.junit.Test;

public class Test$PowerServiceSiviso
{
	@Test
	public void __0startForegroundService()
	{
		Context context = mock(Context.class);
		Intent_ServiceSiviso intent = mock(Intent_ServiceSiviso.class);
		Helper_PowerServiceSiviso helper = mock(Helper_PowerServiceSiviso.class);
		
		PowerServiceSiviso powerServiceSiviso = new PowerServiceSiviso(context, intent, helper);
		
		verify(context, times(0)).startForegroundService(any());
	}
	
	@Test
	public void __0startService()
	{
		Context context = mock(Context.class);
		Intent_ServiceSiviso intent = mock(Intent_ServiceSiviso.class);
		Helper_PowerServiceSiviso helper = mock(Helper_PowerServiceSiviso.class);
		
		PowerServiceSiviso powerServiceSiviso = new PowerServiceSiviso(context, intent, helper);
		
		verify(context, times(0)).startService(any());
	}
	
	
	@Test
	public void start_o_startForegroundService()
	{
		int buildVersion = Build.VERSION_CODES.O;
		Context context = mock(Context.class);
		Intent_ServiceSiviso intent = mock(Intent_ServiceSiviso.class);
		Helper_PowerServiceSiviso helper = mock(Helper_PowerServiceSiviso.class);
		when(helper.buildVersion()).thenReturn(buildVersion);
		
		PowerServiceSiviso powerServiceSiviso = new PowerServiceSiviso(context, intent, helper);
		powerServiceSiviso.start();
		
		verify(context, times(1)).startForegroundService(intent);
	}
	
	@Test
	public void start_o1higher_startForegroundService()
	{
		int buildVersion = Build.VERSION_CODES.O + 1;
		Context context = mock(Context.class);
		Intent_ServiceSiviso intent = mock(Intent_ServiceSiviso.class);
		Helper_PowerServiceSiviso helper = mock(Helper_PowerServiceSiviso.class);
		when(helper.buildVersion()).thenReturn(buildVersion);
		
		PowerServiceSiviso powerServiceSiviso = new PowerServiceSiviso(context, intent, helper);
		powerServiceSiviso.start();
		
		verify(context, times(1)).startForegroundService(intent);
	}
	
	@Test
	public void start_0_startService()
	{
		int buildVersion = 0;
		Context context = mock(Context.class);
		Intent_ServiceSiviso intent = mock(Intent_ServiceSiviso.class);
		Helper_PowerServiceSiviso helper = mock(Helper_PowerServiceSiviso.class);
		when(helper.buildVersion()).thenReturn(buildVersion);
		
		PowerServiceSiviso powerServiceSiviso = new PowerServiceSiviso(context, intent, helper);
		powerServiceSiviso.start();
		
		verify(context, times(1)).startService(intent);
	}
}