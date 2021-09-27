package com.jordan.betcher.siviso.siviso.service;

import android.app.Activity;
import android.widget.Button;

import androidx.appcompat.widget.SwitchCompat;

import com.jordan.betcher.siviso.siviso.R;
import com.jordan.betcher.siviso.siviso.lock.EventUnlock;
import com.jordan.betcher.siviso.siviso.lock.Factory_SetupEventUnLock;
import com.jordan.betcher.siviso.siviso.permissions.Permission_AccessNotificationPolicy;

public class A_Service
{
	public A_Service(Activity activity, Permission_AccessNotificationPolicy permission)
	{
		SwitchCompat onOffSwitch = activity.findViewById(R.id.switchOnOff);
		Button onOffLock = activity.findViewById(R.id.onOffLock);
		Factory_SetupEventUnLock setupEventUnLock = new Factory_SetupEventUnLock(onOffSwitch, onOffLock, permission);
		EventUnlock eventUnlock = setupEventUnLock.eventUnlock();
		
		OnUnlock_SetOnOffSwitchToIfServiceRunning setOnOffSwitchToIfServiceRunning = new OnUnlock_SetOnOffSwitchToIfServiceRunning(activity, onOffSwitch);
		eventUnlock.addOnUnlock(setOnOffSwitchToIfServiceRunning);
		//TODO onUnlock onClick (onOffSwitch.isChecked) ? startService : endService
	}
}
