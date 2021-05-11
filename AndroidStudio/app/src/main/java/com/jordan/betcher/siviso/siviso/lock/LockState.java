package com.jordan.betcher.siviso.siviso.lock;

import android.view.View;

public class LockState
{
	private View view;
	private View viewLock;
	
	public LockState(View view, View viewLock){this.view = view;
		//this.viewLock = viewLock;
	}
	
	void lock()
	{
		//setGone(view);
		//setVisible(viewLock);
	}
	
	void unlock()
	{
		//setVisible(view);
		//setGone(viewLock);
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
	
	}
}
