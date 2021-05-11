package com.jordan.betcher.siviso.siviso.permissions;

import android.view.View;

public class OnClickListener_RequestPermission implements View.OnClickListener
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
