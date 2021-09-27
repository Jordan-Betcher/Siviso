package com.jordan.betcher.siviso.siviso.service;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

import androidx.appcompat.widget.SwitchCompat;

class BroadcastReceiver_SetOnOffToTrue extends BroadcastReceiver
{
	
	private SwitchCompat onOff;
	
	public BroadcastReceiver_SetOnOffToTrue(SwitchCompat onOff)
	{
		this.onOff = onOff;
	}
	
	@Override
	public void onReceive(Context context, Intent intent)
	{
		if(intent.getAction() == Intent_YesRunning.ACTION) onOff.setChecked(true);
	}
}
