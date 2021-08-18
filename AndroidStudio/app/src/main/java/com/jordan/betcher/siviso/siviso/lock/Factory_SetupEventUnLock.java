package com.jordan.betcher.siviso.siviso.lock;

import android.view.View;
import android.widget.Button;

import com.jordan.betcher.siviso.siviso.permissions.OnPermissionGranted;
import com.jordan.betcher.siviso.siviso.permissions.Permission;

public class Factory_SetupEventUnLock
{
	private ViewLock lock;
	
	
	public Factory_SetupEventUnLock(View view, Button mapLock, Permission permission)
	{
		this.lock = new ViewLock(view, mapLock);
		
		//On Button Press Call Permission Request
		View.OnClickListener requestPermission = new OnClickListener_RequestPermission(permission);
		mapLock.setOnClickListener(requestPermission);
		
		//On Permisson Granted Unlock
		OnPermissionGranted unlock = new OnPermissionGranted_Unlock(lock);
		permission.addOnGranted(unlock);
	}
	
	public EventUnlock eventUnlock()
	{
		return lock;
	}
}
