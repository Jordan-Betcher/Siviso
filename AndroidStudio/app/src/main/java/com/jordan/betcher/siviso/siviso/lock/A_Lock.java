package com.jordan.betcher.siviso.siviso.lock;

import android.view.View;
import android.widget.Button;

import com.jordan.betcher.siviso.siviso.permissions.OnPermissionGranted;
import com.jordan.betcher.siviso.siviso.permissions.Permission;
import com.jordan.betcher.siviso.siviso.permissions.Permissions;

public class A_Lock
{
	LockState lockState;
	
	public A_Lock(View map, Button mapLock, Permission... permissionArray)
	{
		lockState = new LockState(map, mapLock);
		Permissions permissions = new Permissions(permissionArray);
		
		View.OnClickListener requestPermission = new OnClickListener_RequestPermission(permissions);
		mapLock.setOnClickListener(requestPermission);
		
		OnPermissionGranted unlock = new OnPermissionGranted_Unlock(lockState);
		permissions.addOnGranted(unlock);
	}
	
	public void addOnUnlock(OnUnlock onUnlock)
	{
		lockState.addOnUnlock(onUnlock);
	}
}
