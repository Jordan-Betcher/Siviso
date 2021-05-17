package com.jordan.betcher.siviso.siviso.thirdparty;

import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageManager;

import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

public class Wrapper_ActivityCompat
{
	public void requestPermission(Activity activity, String manifestName)
	{
		ActivityCompat
		.requestPermissions(activity, new String[]{manifestName}, 0);
	}
	
	public boolean checkSelfPermission(Activity activity, String permissionName)
	{
		return ActivityCompat.checkSelfPermission(activity, permissionName) == PackageManager.PERMISSION_GRANTED;
	}
}
