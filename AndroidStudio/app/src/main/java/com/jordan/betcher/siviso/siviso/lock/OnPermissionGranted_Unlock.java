package com.jordan.betcher.siviso.siviso.lock;


import com.jordan.betcher.siviso.siviso.permissions.OnPermissionGranted;

class OnPermissionGranted_Unlock implements OnPermissionGranted
{
	private LockState lockState;
	
	public OnPermissionGranted_Unlock(LockState lockState)
	{
		this.lockState = lockState;
	}
	
	@Override
	public void granted()
	{
		lockState.unlock();
	}
}
