package com.jordan.betcher.siviso.siviso.service;

import com.jordan.betcher.siviso.siviso.lock.OnUnlock;

class OnUnlock_AskIsRunning implements OnUnlock
{
	
	public OnUnlock_AskIsRunning(Wrapper_LocalBroadcastManager manager, Intent_AskIsRunning askIsRunning)
	{
		//TODO OnUnlock_AskIsRunning OnUnlock_AskIsRunning
		manager.sendBroadcast(askIsRunning);
	}
	
	@Override
	public void unlocked()
	{
		//TODO
	}
}
