package com.jordan.betcher.siviso.siviso.service;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

import androidx.appcompat.widget.SwitchCompat;

class BroadcastReceiver_SetOnOffToTrue extends BroadcastReceiver
{
	
	public BroadcastReceiver_SetOnOffToTrue(SwitchCompat onOff)
	{
		//TODO BroadcastReceiver_SetOnOffToTrue BroadcastReceiver_SetOnOffToTrue
		onOff.setChecked(true);
	}
	
	@Override
	public void onReceive(Context context, Intent intent)
	{
		//TODO
	}
}
