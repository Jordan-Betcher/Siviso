package com.jordan.betcher.siviso.siviso.lock;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import org.junit.Test;

public class Test$AtPermissionGranted_Unlock
{
	@Test
	public void _lockState_0Unlock()
	{
		ViewLock lock = mock(ViewLock.class);
		
		new AtPermissionGranted_Unlock(lock);
		
		verify(lock, times(0)).unlock();
	}
	
	@Test
	public void granted_lockState_unlock()
	{
		ViewLock lock = mock(ViewLock.class);
		
		AtPermissionGranted_Unlock unlock = new AtPermissionGranted_Unlock(lock);
		unlock.call();
		
		verify(lock, times(1)).unlock();
	}
}