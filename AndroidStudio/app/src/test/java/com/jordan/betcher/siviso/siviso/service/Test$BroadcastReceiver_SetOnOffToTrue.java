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
	public void onReceive_B_0checkedTrue()
	{
		String action = "B";
		SwitchCompat onOff = mock(SwitchCompat.class);
		Intent intent = mock(Intent.class);
		when(intent.getAction()).thenReturn(action);
		
		
		BroadcastReceiver_SetOnOffToTrue setOnOffToTrue = new BroadcastReceiver_SetOnOffToTrue(onOff);
		setOnOffToTrue.onReceive(null, intent);
		
		verify(onOff, times(0)).setChecked(true);
	}
	
	@Test
	public void onReceive_A_0checkedTrue()
	{
		String action = "A";
		SwitchCompat onOff = mock(SwitchCompat.class);
		Intent intent = mock(Intent.class);
		when(intent.getAction()).thenReturn(action);
		
		
		BroadcastReceiver_SetOnOffToTrue setOnOffToTrue = new BroadcastReceiver_SetOnOffToTrue(onOff);
		setOnOffToTrue.onReceive(null, intent);
		
		verify(onOff, times(0)).setChecked(true);
	}
	
	@Test
	public void onReceive_YesRunning_checkedTrue()
	{
		String action = Intent_YesRunning.ACTION;
		SwitchCompat onOff = mock(SwitchCompat.class);
		Intent intent = mock(Intent.class);
		when(intent.getAction()).thenReturn(action);
		
		
		BroadcastReceiver_SetOnOffToTrue setOnOffToTrue = new BroadcastReceiver_SetOnOffToTrue(onOff);
		setOnOffToTrue.onReceive(null, intent);
		
		verify(onOff, times(1)).setChecked(true);
	}
}