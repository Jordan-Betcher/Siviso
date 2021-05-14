package com.jordan.betcher.siviso.siviso.lock;

import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

public class Test$OnPermissionGranted_Unlock
{
	@Test
	public void _lockState_0Unlock()
	{
		LockState lockState = mock(LockState.class);
		
		new OnPermissionGranted_Unlock(lockState);
		
		verify(lockState, times(0)).unlock();
	}
	
	@Test
	public void granted_lockState_unlock()
	{
		LockState lockState = mock(LockState.class);
		
		OnPermissionGranted_Unlock unlock = new OnPermissionGranted_Unlock(lockState);
		unlock.granted();
		
		verify(lockState, times(1)).unlock();
	}
}