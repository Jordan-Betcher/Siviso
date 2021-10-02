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
		return new GPSListener();
	}
	
	private NotificationChannelForeground createNotificationChannelForeground()
	{
		return new NotificationChannelForeground();
	}
	
	@Override
	public int onStartCommand(Intent intent, int flags, int startId)
	{
		notificationChannelForeground.start();
		gpsListener.start();
		return Service.START_STICKY;
	}
	
	@Override
	public void onDestroy()
	{
		notificationChannelForeground.stop();
		gpsListener.stop();
	}
	
	@Nullable
	@Override
	public IBinder onBind(Intent intent)
	{
		return null;
	}
}
