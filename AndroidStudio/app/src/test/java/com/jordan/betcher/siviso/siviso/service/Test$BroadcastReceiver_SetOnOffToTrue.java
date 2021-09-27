package com.jordan.betcher.siviso.siviso.service;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import android.content.Intent;

import androidx.appcompat.widget.SwitchCompat;

import org.junit.Test;

public class Test$BroadcastReceiver_SetOnOffToTrue
{
	@Test
	public void onReceive_Different_0checkedTrue()
	{
		SwitchCompat onOff = mock(SwitchCompat.class);
		Intent intent = mock(Intent.class);
		when(intent.getAction()).thenReturn("A");
		
		
		BroadcastReceiver_SetOnOffToTrue setOnOffToTrue = new BroadcastReceiver_SetOnOffToTrue(onOff);
		setOnOffToTrue.onReceive(null, intent);
		
		verify(onOff, times(0)).setChecked(true);
	}
	
	@Test
	public void onReceive_YesRunning_checkedTrue()
	{
		SwitchCompat onOff = mock(SwitchCompat.class);
		Intent intent = mock(Intent.class);
		when(intent.getAction()).thenReturn(Intent_YesRunning.ACTION);
		
		
		BroadcastReceiver_SetOnOffToTrue setOnOffToTrue = new BroadcastReceiver_SetOnOffToTrue(onOff);
		setOnOffToTrue.onReceive(null, intent);
		
		verify(onOff, times(1)).setChecked(true);
	}
}