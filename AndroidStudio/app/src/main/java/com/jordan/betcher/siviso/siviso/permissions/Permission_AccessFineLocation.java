package com.jordan.betcher.siviso.siviso.permissions;

import android.Manifest;
import android.content.Context;

import com.jordan.betcher.siviso.siviso.thirdparty.Wrapper_ActivityCompat;

public class Permission_AccessFineLocation implements Permission
{
	Wrapper_ActivityCompat activityCompat;
	private Context context;
	
	public Permission_AccessFineLocation(Context context)
	{
		this.context = context;
		activityCompat = new Wrapper_ActivityCompat();
	}
	
	@Override
	public void request()
	{
		activityCompat.requestPermission(context, Manifest.permission.ACCESS_FINE_LOCATION);
	}
	
	@Override
	public void addOnGranted(OnGranted unlock)
	{
	
	}
}
