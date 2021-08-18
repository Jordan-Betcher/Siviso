package com.jordan.betcher.siviso.siviso.lock;

import android.view.View;

import java.util.ArrayList;

class ViewLock implements EventUnlock
{
	private View item;
	private View lock;
	private boolean unlocked;
	private ArrayList<OnUnlock> onUnlocks = new ArrayList<>();
	
	public ViewLock(View item, View lock)
	{
		this.item = item;
		this.lock = lock;
		lock();
	}
	
	void lock()
	{
		setGone(item);
		setVisible(lock);
		
		unlocked = false;
	}
	
	void unlock()
	{
		setVisible(item);
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
