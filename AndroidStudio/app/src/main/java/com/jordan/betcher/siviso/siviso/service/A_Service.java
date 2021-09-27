package com.jordan.betcher.siviso.siviso.service;

import android.app.Activity;
import android.content.Intent;
import android.content.IntentFilter;
import android.widget.Button;

import androidx.appcompat.widget.SwitchCompat;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;

import com.jordan.betcher.siviso.siviso.R;
import com.jordan.betcher.siviso.siviso.lock.EventUnlock;
import com.jordan.betcher.siviso.siviso.lock.Factory_SetupEventUnLock;
import com.jordan.betcher.siviso.siviso.permissions.Permission_AccessNotificationPolicy;

public class A_Service
{
	private Activity activity;
	
	public A_Service(Activity activity, Permission_AccessNotificationPolicy permission)
	{
		this.activity = activity;
		SwitchCompat onOffSwitch = activity.findViewById(R.id.switchOnOff);
		Button onOffLock = activity.findViewById(R.id.onOffLock);
		Factory_SetupEventUnLock setupEventUnLock = new Factory_SetupEventUnLock(onOffSwitch, onOffLock, permission);
		EventUnlock eventUnlock = setupEventUnLock.eventUnlock();
		
		LocalBroadcastManager manager = LocalBroadcastManager.getInstance(activity);
		ifRunningSetOnOffTrue(manager);
		
		OnUnlock_AskIsRunning setOnOffSwitchToIfServiceRunning = createAskIsRunning(manager);
		eventUnlock.addOnUnlock(setOnOffSwitchToIfServiceRunning);
		//TODO onUnlock onClick (onOffSwitch.isChecked) ? startService : endService
	}
	
	private void ifRunningSetOnOffTrue(LocalBroadcastManager manager)
	{
		BroadcastReceiver_SetOnOffToTrue setOnOffToTrue = new BroadcastReceiver_SetOnOffToTrue(manager);
		IntentFilter lookForYesRunning = new IntentFilter("LOOK_FOR_YES_RUNNING"); //TODO change temp to service const
		manager.registerReceiver(setOnOffToTrue, lookForYesRunning);
	}
	
	private OnUnlock_AskIsRunning createAskIsRunning(LocalBroadcastManager manager)
	{
		Intent askIsRunning = new Intent("ASK_IS_RUNNING");
		return new OnUnlock_AskIsRunning(manager, askIsRunning);
	}
}
