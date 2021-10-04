package com.jordan.betcher.siviso.siviso.lock;


import com.jordan.betcher.siviso.siviso.permissions.OnPermissionGranted;

class OnPermissionGranted_Unlock implements OnPermissionGranted
{
	private ViewLock lock;
	
	public OnPermissionGranted_Unlock(ViewLock lock)
	{
		this.lock = lock;
	}
	
	@Override
	public void call()
	{
		lock.unlock();
	}
}
