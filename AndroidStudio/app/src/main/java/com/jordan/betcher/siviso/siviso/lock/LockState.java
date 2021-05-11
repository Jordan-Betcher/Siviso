package com.jordan.betcher.siviso.siviso.lock;

import android.view.View;

import java.util.ArrayList;

class LockState
{
	private View view;
	private View lock;
	private boolean unlocked = false;
	private ArrayList<OnUnlock> onUnlocks = new ArrayList<>();
	
	public LockState(View view, View lock)
	{
		this.view = view;
		this.lock = lock;
	}
	
	void lock()
	{
		setGone(view);
		setVisible(lock);
		
		unlocked = false;
	}
	
	void unlock()
	{
		setVisible(view);
		setGone(lock);
		
		unlocked = true;
		
		for(OnUnlock onUnlock : onUnlocks)
		{
			onUnlock.unlocked();
		}
		
		onUnlocks.clear();
	}
	
	private void setVisible(View view)
	{
		view.setVisibility(View.VISIBLE);
	}
	
	private void setGone(View view)
	{
		view.setVisibility(View.GONE);
	}
	
	public void addOnUnlock(OnUnlock onUnlock)
	{
		if(unlocked == true)
		{
			onUnlock.unlocked();
		}
		else
		{
			onUnlocks.add(onUnlock);
		}
	}
}
