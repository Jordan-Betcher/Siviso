package com.jordan.betcher.siviso.siviso.service;

import com.jordan.betcher.siviso.siviso.lock.OnUnlock;

class OnUnlock_AskIsRunning implements OnUnlock
{
	
	private Wrapper_LocalBroadcastManager manager;
	private Intent_AskIsRunning askIsRunning;
	
	public OnUnlock_AskIsRunning(Wrapper_LocalBroadcastManager manager, Intent_AskIsRunning askIsRunning)
	{
		this.manager = manager;
		this.askIsRunning = askIsRunning;
	}
	
	@Override
	public void unlocked()
	{
		manager.sendBroadcast(askIsRunning);
	}
}
