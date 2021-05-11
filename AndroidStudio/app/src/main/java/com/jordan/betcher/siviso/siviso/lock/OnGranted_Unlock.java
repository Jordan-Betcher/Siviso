package com.jordan.betcher.siviso.siviso.lock;


import com.jordan.betcher.siviso.siviso.permissions.OnGranted;

class OnGranted_Unlock implements OnGranted
{
	private LockState lockState;
	
	public OnGranted_Unlock(LockState lockState)
	{
		this.lockState = lockState;
	}
	
	@Override
	public void granted()
	{
		lockState.unlock();
	}
}
