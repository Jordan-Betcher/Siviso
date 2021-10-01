package com.jordan.betcher.siviso.siviso.service;

import android.widget.CompoundButton;

import androidx.appcompat.widget.SwitchCompat;

import com.jordan.betcher.siviso.siviso.lock.OnUnlock;

class OnUnlock_SetSwitchCheckedChangeListener
implements OnUnlock
{
	
	private final SwitchCompat onOffSwitch;
	private final CompoundButton.OnCheckedChangeListener onCheckedChangeListener;
	
	public OnUnlock_SetSwitchCheckedChangeListener(
	SwitchCompat onOffSwitch, CompoundButton.OnCheckedChangeListener onCheckedChangeListener)
	{
		this.onOffSwitch = onOffSwitch;
		this.onCheckedChangeListener = onCheckedChangeListener;
	}
	
	@Override
	public void unlocked()
	{
		onOffSwitch.setOnCheckedChangeListener(onCheckedChangeListener);
	}
}
