package com.jordan.betcher.siviso.siviso.service;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import org.junit.Test;

public class Test$OnCheckedChangeListener_StartStopService
{
	@Test
	public void onCheckedChanged_false_0start()
	{
		boolean isChecked = false;
		PowerServiceSiviso powerServiceSiviso = mock(PowerServiceSiviso.class);
		
		OnCheckedChangeListener_StartStopService startStopService = new OnCheckedChangeListener_StartStopService(powerServiceSiviso);
		startStopService.onCheckedChanged(null, isChecked);
		
		verify(powerServiceSiviso, times(0)).start();
	}
	
	@Test
	public void __0start()
	{
		PowerServiceSiviso powerServiceSiviso = mock(PowerServiceSiviso.class);
		
		new OnCheckedChangeListener_StartStopService(powerServiceSiviso);
		
		verify(powerServiceSiviso, times(0)).start();
	}
	
	@Test
	public void onCheckedChanged_true_start()
	{
		boolean isChecked = true;
		PowerServiceSiviso powerServiceSiviso = mock(PowerServiceSiviso.class);
		
		OnCheckedChangeListener_StartStopService startStopService = new OnCheckedChangeListener_StartStopService(powerServiceSiviso);
		startStopService.onCheckedChanged(null, isChecked);
		
		verify(powerServiceSiviso, times(1)).start();
	}
}