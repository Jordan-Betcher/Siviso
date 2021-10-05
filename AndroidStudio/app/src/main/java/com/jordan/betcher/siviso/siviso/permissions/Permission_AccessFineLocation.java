package com.jordan.betcher.siviso.siviso.permissions;

import android.Manifest;
import android.app.Activity;

import com.jordan.betcher.siviso.siviso.thirdparty.Wrapper_ActivityCompat;

import java.util.ArrayList;

public class Permission_AccessFineLocation implements Permission
{
	Wrapper_ActivityCompat activityCompat;
	private Activity activity;
	private ArrayList<AtPermissionGranted> atPermissionGranteds = new ArrayList<>();
	
	public Permission_AccessFineLocation(Activity activity)
	{
		this.activity = activity;
		activityCompat = new Wrapper_ActivityCompat();
	}
	
	@Override
	public boolean isGranted()
	{
		return activityCompat.checkSelfPermission(activity, Manifest.permission.ACCESS_FINE_LOCATION);
	}
	
	@Override
	public void grant()
	{
		if(isGranted())
		{
			for(AtPermissionGranted atPermissionGranted : atPermissionGranteds)
			{
				atPermissionGranted.call();
			}
			
			atPermissionGranteds.clear();
		}
		
	}
	
	@Override
	public void request()
	{
		activityCompat.requestPermission(activity, Manifest.permission.ACCESS_FINE_LOCATION);
	}
	
	@Override
	public void addOnGranted(AtPermissionGranted atPermissionGranted)
	{
		atPermissionGranteds.add(atPermissionGranted);
		grant();
	}
}
