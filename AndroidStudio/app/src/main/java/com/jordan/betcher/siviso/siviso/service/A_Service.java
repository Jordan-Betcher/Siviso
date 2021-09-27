package com.jordan.betcher.siviso.siviso.service;

import android.app.Activity;
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
		
		Wrapper_LocalBroadcastManager manager = new Wrapper_LocalBroadcastManager(LocalBroadcastManager.getInstance(activity));
		ifRunningSetOnOffTrue(manager, onOffSwitch);
		
		OnUnlock_AskIsRunning setOnOffSwitchToIfServiceRunning = createAskIsRunning(manager);
		eventUnlock.addOnUnlock(setOnOffSwitchToIfServiceRunning);
		//TODO onUnlock onClick (onOffSwitch.isChecked) ? startService : endService
	}
	
	private void ifRunningSetOnOffTrue(
	Wrapper_LocalBroadcastManager manager, SwitchCompat onOffSwitch)
	{
		BroadcastReceiver_SetOnOffToTrue setOnOffToTrue = new BroadcastReceiver_SetOnOffToTrue(onOffSwitch);
		IntentFilter lookForYesRunning = new IntentFilter(Intent_YesRunning.ACTION); //TODO change temp to service const
		manager.registerReceiver(setOnOffToTrue, lookForYesRunning);
	}
	
	private OnUnlock_AskIsRunning createAskIsRunning(Wrapper_LocalBroadcastManager manager)
	{
		Intent_AskIsRunning askIsRunning = new Intent_AskIsRunning();
		return new OnUnlock_AskIsRunning(manager, askIsRunning);
	}
}
