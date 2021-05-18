package com.jordan.betcher.siviso.siviso.lock;

import android.view.View;

import com.jordan.betcher.siviso.siviso.permissions.Permission;

class OnClickListener_RequestPermission implements View.OnClickListener
{
	private Permission permission;
	
	public OnClickListener_RequestPermission(Permission permission)
	{
		this.permission = permission;
	}
	
	@Override
	public void onClick(View v)
	{
		permission.request();
	}
}
