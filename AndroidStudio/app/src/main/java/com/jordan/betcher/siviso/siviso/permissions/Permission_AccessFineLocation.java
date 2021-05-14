package com.jordan.betcher.siviso.siviso.permissions;

import android.Manifest;
import android.app.Activity;

import com.jordan.betcher.siviso.siviso.thirdparty.Wrapper_ActivityCompat;

public class Permission_AccessFineLocation implements Permission
{
	Wrapper_ActivityCompat activityCompat;
	private Activity activity;
	
	public Permission_AccessFineLocation(Activity activity)
	{
		this.activity = activity;
		activityCompat = new Wrapper_ActivityCompat();
	}
	
	@Override
	public boolean isGranted()
	{
		return false;
	}
	
	@Override
	public void request()
	{
		activityCompat.requestPermission(activity, Manifest.permission.ACCESS_FINE_LOCATION);
	}
	
	@Override
	public void addOnGranted(OnPermissionGranted onPermissionGranted)
	{
	
	}
}
