package com.jordan.betcher.siviso.siviso.lock;

import android.view.View;

import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

public class Test$LockState
{
	@Test
	public void unlockaddOnUnlockUnlock_onUnlock_1onUnlockUnlocked()
	{
		View view = mock(View.class);
		View lock = mock(View.class);
		OnUnlock onUnlock = mock(OnUnlock.class);
		
		LockState lockState = new LockState(view, lock);
		lockState.unlock();
		lockState.addOnUnlock(onUnlock);
		lockState.unlock();
		
		verify(onUnlock, times(1)).unlocked();
	}
	
	@Test
	public void addOnUnlockUnlockUnlock_onUnlock_1onUnlockUnlocked()
	{
		View view = mock(View.class);
		View lock = mock(View.class);
		OnUnlock onUnlock = mock(OnUnlock.class);
		
		LockState lockState = new LockState(view, lock);
		lockState.addOnUnlock(onUnlock);
		lockState.unlock();
		lockState.unlock();
		
		verify(onUnlock, times(1)).unlocked();
	}
	
	@Test
	public void unlockLockAddOnUnlock_onUnlock_0OnUnlockUnlocked()
	{
		View view = mock(View.class);
		View lock = mock(View.class);
		OnUnlock onUnlock = mock(OnUnlock.class);
		
		LockState lockState = new LockState(view, lock);
		lockState.unlock();
		lockState.lock();
		lockState.addOnUnlock(onUnlock);
		
		verify(onUnlock, times(0)).unlocked();
	}
	
	@Test
	public void unlockAddOnUnlock_onUnlock_onUnlockUnlocked()
	{
		View view = mock(View.class);
		View lock = mock(View.class);
		OnUnlock onUnlock = mock(OnUnlock.class);
		
		LockState lockState = new LockState(view, lock);
		lockState.unlock();
		lockState.addOnUnlock(onUnlock);
		
		verify(onUnlock, times(1)).unlocked();
	}
	
	@Test
	public void addOnUnlockUnlock_onUnlock_onUnlockUnlocked()
	{
		View view = mock(View.class);
		View lock = mock(View.class);
		OnUnlock onUnlock = mock(OnUnlock.class);
		
		LockState lockState = new LockState(view, lock);
		lockState.addOnUnlock(onUnlock);
		lockState.unlock();
		
		verify(onUnlock, times(1)).unlocked();
	}
	
	@Test
	public void unlock__lockGone()
	{
		View view = mock(View.class);
		View lock = mock(View.class);
		
		LockState lockState = new LockState(view, lock);
		lockState.unlock();
		
		verify(lock, times(1)).setVisibility(View.GONE);
	}
	
	@Test
	public void unlock__viewVisible()
	{
		View view = mock(View.class);
		View lock = mock(View.class);
		
		LockState lockState = new LockState(view, lock);
		lockState.unlock();
		
		verify(view, times(1)).setVisibility(View.VISIBLE);
	}
	
	@Test
	public void lock__lockVisible()
	{
		View view = mock(View.class);
		View lock = mock(View.class);
		
		LockState lockState = new LockState(view, lock);
		lockState.lock();
		
		verify(lock, times(1)).setVisibility(View.VISIBLE);
	}
	
	@Test
	public void lock__viewGone()
	{
		View view = mock(View.class);
		View lock = mock(View.class);
		
		LockState lockState = new LockState(view, lock);
		lockState.lock();
		
		verify(view, times(1)).setVisibility(View.GONE);
	}
}