package com.jordan.betcher.siviso.siviso.service;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import org.junit.Test;

public class Test$OnUnlock_AskIsRunning
{
	@Test
	public void __0sendBroadcast()
	{
		Wrapper_LocalBroadcastManager localBroadcastManager = mock(Wrapper_LocalBroadcastManager.class);
		Intent_AskIsRunning intent = mock(Intent_AskIsRunning.class);
		
		new OnUnlock_AskIsRunning(localBroadcastManager, intent);

		verify(localBroadcastManager, times(0)).sendBroadcast(any());
	}
	
	@Test
	public void unlock__sendBroadcast()
	{
		Wrapper_LocalBroadcastManager localBroadcastManager = mock(Wrapper_LocalBroadcastManager.class);
		Intent_AskIsRunning intent = mock(Intent_AskIsRunning.class);
		
		OnUnlock_AskIsRunning askIsRunning = new OnUnlock_AskIsRunning(localBroadcastManager, intent);
		askIsRunning.unlocked();
		
		verify(localBroadcastManager, times(1)).sendBroadcast(intent);
	}
	
}