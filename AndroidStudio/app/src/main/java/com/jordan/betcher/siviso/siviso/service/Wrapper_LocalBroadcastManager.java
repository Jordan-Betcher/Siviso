package com.jordan.betcher.siviso.siviso.service;

import android.content.BroadcastReceiver;
import android.content.IntentFilter;

import androidx.localbroadcastmanager.content.LocalBroadcastManager;

class Wrapper_LocalBroadcastManager
{
	private LocalBroadcastManager manager;
	
	public Wrapper_LocalBroadcastManager(LocalBroadcastManager manager)
	{
		this.manager = manager;
	}
	
	public void sendBroadcast(Intent_AskIsRunning intent)
	{
		manager.sendBroadcast(intent);
	}
	
	public void registerReceiver(
	BroadcastReceiver broadcastReceiver, IntentFilter intentFilter)
	{
		manager.registerReceiver(broadcastReceiver, intentFilter);
	}
}
