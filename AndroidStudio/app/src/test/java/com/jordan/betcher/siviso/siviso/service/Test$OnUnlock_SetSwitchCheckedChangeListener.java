package com.jordan.betcher.siviso.siviso.service;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import android.widget.CompoundButton;

import androidx.appcompat.widget.SwitchCompat;

import org.junit.Test;

public class Test$OnUnlock_SetSwitchCheckedChangeListener
{
	@Test
	public void unlocked__0setOnCheckedChangeListener()
	{
		SwitchCompat switchCompat = mock(SwitchCompat.class);
		CompoundButton.OnCheckedChangeListener onCheckedChangeListener = mock(CompoundButton.OnCheckedChangeListener.class);
		
		new OnUnlock_SetSwitchCheckedChangeListener(switchCompat, onCheckedChangeListener);
		
		verify(switchCompat, times(0)).setOnCheckedChangeListener(any());
	}
	
	@Test
	public void unlocked__setOnCheckedChangeListener()
	{
		SwitchCompat switchCompat = mock(SwitchCompat.class);
		CompoundButton.OnCheckedChangeListener onCheckedChangeListener = mock(CompoundButton.OnCheckedChangeListener.class);
		
		OnUnlock_SetSwitchCheckedChangeListener setSwitchCheckedChangeListener = new OnUnlock_SetSwitchCheckedChangeListener(switchCompat, onCheckedChangeListener);
		setSwitchCheckedChangeListener.unlocked();
		
		verify(switchCompat, times(1)).setOnCheckedChangeListener(onCheckedChangeListener);
	}
}