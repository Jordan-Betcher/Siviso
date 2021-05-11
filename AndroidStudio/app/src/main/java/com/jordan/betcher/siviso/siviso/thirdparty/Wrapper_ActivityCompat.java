package com.jordan.betcher.siviso.siviso.thirdparty;

import android.app.Activity;
import android.content.Context;

import androidx.core.app.ActivityCompat;

public class Wrapper_ActivityCompat
{
	public void requestPermission(Activity activity, String manifestName)
	{
		ActivityCompat
		.requestPermissions(activity, new String[]{manifestName}, 0);
	}
}
