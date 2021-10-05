package com.jordan.betcher.siviso.siviso.lock;


import com.jordan.betcher.siviso.siviso.permissions.AtPermissionGranted;

class AtPermissionGranted_Unlock implements AtPermissionGranted
{
	private ViewLock lock;
	
	public AtPermissionGranted_Unlock(ViewLock lock)
	{
		this.lock = lock;
	}
	
	@Override
	public void call()
	{
		lock.unlock();
	}
}
