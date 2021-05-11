package com.jordan.betcher.siviso.siviso.lock;

import android.view.View;
import android.widget.Button;

import com.jordan.betcher.siviso.siviso.permissions.OnGranted;
import com.jordan.betcher.siviso.siviso.permissions.Permission;
import com.jordan.betcher.siviso.siviso.permissions.Permissions;

public class A_Lock
{
	LockState lockState;
	
	public A_Lock(View map, Button mapLock, Permission... permissionArray)
	{
		lockState = new LockState(map, mapLock);
		Permissions permissions = new Permissions(permissionArray);
		
		View.OnClickListener requestPermissions = new OnClickListener_RequestPermissions(permissions);
		mapLock.setOnClickListener(requestPermissions);
		
		OnGranted unlock = new OnGranted_Unlock(lockState);
		permissions.addOnGranted(unlock);
	}
	
	public void addOnUnlock(OnUnlock onUnlock)
	{
		lockState.addOnUnlock(onUnlock);
	}
}
