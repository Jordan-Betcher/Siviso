package com.jordan.betcher.siviso.siviso.service;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Build;

class PowerServiceSiviso
{
	private final Context context;
	private final Intent_ServiceSiviso intent;
	private final Helper_PowerServiceSiviso helper;
	
	public PowerServiceSiviso(
	Context context, Intent_ServiceSiviso intent, Helper_PowerServiceSiviso helper)
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
		//TODO PowerServiceSiviso stop
	}
}
