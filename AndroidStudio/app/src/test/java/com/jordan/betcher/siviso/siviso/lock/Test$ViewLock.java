package com.jordan.betcher.siviso.siviso.lock;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import android.view.View;

import org.junit.Test;

public class Test$ViewLock
{
	@Test
	public void addOnUnlock__0Unlocked()
	{
		View item = mock(View.class);
		View lock = mock(View.class);
		OnUnlock onUnlock = mock(OnUnlock.class);
		
		ViewLock lockState = new ViewLock(item, lock);
		lockState.addOnUnlock(onUnlock);
		
		verify(onUnlock, times(0)).unlocked();
	}
	
	@Test
	public void __lockVisible()
	{
		View item = mock(View.class);
		View lock = mock(View.class);
		
		new ViewLock(item, lock);
		
		verify(lock, times(1)).setVisibility(View.VISIBLE);
	}
	
	@Test
	public void __itemGone()
	{
		View item = mock(View.class);
		View lock = mock(View.class);
		
		new ViewLock(item, lock);
		
		verify(item, times(1)).setVisibility(View.GONE);
	}
	
	@Test
	public void unlockaddOnUnlockUnlock_onUnlock_1onUnlockUnlocked()
	{
		View item = mock(View.class);
		View lock = mock(View.class);
		OnUnlock onUnlock = mock(OnUnlock.class);
		
		ViewLock lockState = new ViewLock(item, lock);
		lockState.unlock();
		lockState.addOnUnlock(onUnlock);
		lockState.unlock();
		
		verify(onUnlock, times(1)).unlocked();
	}
	
	@Test
	public void addOnUnlockUnlockUnlock_onUnlock_1onUnlockUnlocked()
	{
		View item = mock(View.class);
		View lock = mock(View.class);
		OnUnlock onUnlock = mock(OnUnlock.class);
		
		ViewLock lockState = new ViewLock(item, lock);
		lockState.addOnUnlock(onUnlock);
		lockState.unlock();
		lockState.unlock();
		
		verify(onUnlock, times(1)).unlocked();
	}
	
	@Test
	public void unlockLockAddOnUnlock_onUnlock_0OnUnlockUnlocked()
	{
		View item = mock(View.class);
		View lock = mock(View.class);
		OnUnlock onUnlock = mock(OnUnlock.class);
		
		ViewLock lockState = new ViewLock(item, lock);
		lockState.unlock();
		lockState.lock();
		lockState.addOnUnlock(onUnlock);
		
		verify(onUnlock, times(0)).unlocked();
	}
	
	@Test
	public void unlockAddOnUnlock_onUnlock_onUnlockUnlocked()
	{
		View item = mock(View.class);
		View lock = mock(View.class);
		OnUnlock onUnlock = mock(OnUnlock.class);
		
		ViewLock lockState = new ViewLock(item, lock);
		lockState.unlock();
		lockState.addOnUnlock(onUnlock);
		
		verify(onUnlock, times(1)).unlocked();
	}
	
	@Test
	public void addOnUnlockUnlock_onUnlock_onUnlockUnlocked()
	{
		View item = mock(View.class);
		View lock = mock(View.class);
		OnUnlock onUnlock = mock(OnUnlock.class);
		
		ViewLock lockState = new ViewLock(item, lock);
		lockState.addOnUnlock(onUnlock);
		lockState.unlock();
		
		verify(onUnlock, times(1)).unlocked();
	}
	
	@Test
	public void unlock__lockGone()
	{
		View item = mock(View.class);
		View lock = mock(View.class);
		
		ViewLock lockState = new ViewLock(item, lock);
		lockState.unlock();
		
		verify(lock, times(1)).setVisibility(View.GONE);
	}
	
	@Test
	public void unlock__itemVisible()
	{
		View item = mock(View.class);
		View lock = mock(View.class);
		
		ViewLock lockState = new ViewLock(item, lock);
		lockState.unlock();
		
		verify(item, times(1)).setVisibility(View.VISIBLE);
	}
	
	@Test
	public void lock__lockVisible()
	{
		View item = mock(View.class);
		View lock = mock(View.class);
		
		ViewLock lockState = new ViewLock(item, lock);
		lockState.lock();
		
		verify(lock, times(2)).setVisibility(View.VISIBLE);
	}
	
	@Test
	public void lock__itemGone()
	{
		View item = mock(View.class);
		View lock = mock(View.class);
		
		ViewLock lockState = new ViewLock(item, lock);
		lockState.lock();
		
		verify(item, times(2)).setVisibility(View.GONE);
	}
}