package com.jordan.betcher.siviso.siviso.permissions;

import android.widget.Button;

public class PermissionsButton
{
	public PermissionsButton(Button mapLock, OnClickListenerRequestPermission requestPermissions)
	{
		mapLock.setOnClickListener(requestPermissions);
	}
}
