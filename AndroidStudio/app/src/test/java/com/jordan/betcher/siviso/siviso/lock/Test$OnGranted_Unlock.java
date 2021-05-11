package com.jordan.betcher.siviso.siviso.lock;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

public class Test$OnGranted_Unlock
{
	@Test
	public void _lockState_0Unlock()
	{
		LockState lockState = mock(LockState.class);
		
		new OnGranted_Unlock(lockState);
		
		verify(lockState, times(0)).unlock();
	}
	
	@Test
	public void granted_lockState_unlock()
	{
		LockState lockState = mock(LockState.class);
		
		OnGranted_Unlock unlock = new OnGranted_Unlock(lockState);
		unlock.granted();
		
		verify(lockState, times(1)).unlock();
	}
}