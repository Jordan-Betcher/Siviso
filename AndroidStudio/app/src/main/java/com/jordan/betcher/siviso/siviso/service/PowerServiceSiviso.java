package com.jordan.betcher.siviso.siviso.service;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Build;

import com.jordan.betcher.siviso.siviso.thirdparty.BuildVersion;

class PowerServiceSiviso
{
	private final Context context;
	private final Intent_ServiceSiviso intent;
	private final BuildVersion helper;
	
	public PowerServiceSiviso(
	Context context, Intent_ServiceSiviso intent, BuildVersion helper)
	{
		
		this.context = context;
		this.intent = intent;
		this.helper = helper;
	}
	
	@SuppressLint("NewApi")
	public void start()
	{
		int buildVersion = helper.buildVersion();
		if(buildVersion >= Build.VERSION_CODES.O)
		{
			context.startForegroundService(intent);
		}
		else
		{
			context.startService(intent);
		}
	}
	
	public void stop()
	{
		context.stopService(intent);
	}
}
