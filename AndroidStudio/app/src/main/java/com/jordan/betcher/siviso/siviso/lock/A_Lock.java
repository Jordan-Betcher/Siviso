package com.jordan.betcher.siviso.siviso.lock;

import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.jordan.betcher.siviso.siviso.permissions.OnPermissionGranted;
import com.jordan.betcher.siviso.siviso.permissions.Permission;

public class A_Lock
{
	LockState lockState;
	
	public A_Lock(View map, Button mapLock, Permission permission)
	{
		lockState = new LockState(map, mapLock);
		
		View.OnClickListener requestPermission = new OnClickListener_RequestPermission(permission);
		mapLock.setOnClickListener(requestPermission);
		
		OnPermissionGranted unlock = new OnPermissionGranted_Unlock(lockState);
		permission.addOnGranted(unlock);
	}
	
	public void addOnUnlock(OnUnlock onUnlock)
	{
		lockState.addOnUnlock(onUnlock);
	}
}
