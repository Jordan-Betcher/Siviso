package com.jordan.betcher.siviso.siviso.service;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

import androidx.annotation.Nullable;

class A_Service_Siviso extends Service
{
	NotificationChannelForeground notificationChannelForeground;
	GPSListener gpsListener;
	
	@Override
	public void onCreate()
	{
		notificationChannelForeground = createNotificationChannelForeground();
		gpsListener = createGPSListener();
	}
	
	private GPSListener createGPSListener()
	{
		return null; //TODO A_Service_Siviso createGPSListener
	}
	
	private NotificationChannelForeground createNotificationChannelForeground()
	{
		return null; //TODO A_Service_Siviso createNotificationChannelForeground
	}
	
	@Override
	public int onStartCommand(Intent intent, int flags, int startId)
	{
		//TODO Start Foreground Notification
		//TODO Start GPS Listener
		return Service.START_STICKY;
	}
	
	@Override
	public void onDestroy()
	{
		//TODO stop foreground
		//TODO remove GPS Listener
	}
	
	@Nullable
	@Override
	public IBinder onBind(Intent intent)
	{
		return null;
	}
}
