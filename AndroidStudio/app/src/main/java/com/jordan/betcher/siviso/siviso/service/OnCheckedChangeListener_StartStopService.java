package com.jordan.betcher.siviso.siviso.service;

import android.widget.CompoundButton;

class OnCheckedChangeListener_StartStopService implements CompoundButton.OnCheckedChangeListener
{
	public OnCheckedChangeListener_StartStopService(PowerServiceSiviso powerServiceSiviso)
	{
		powerServiceSiviso.start();
	}
	
	@Override
	public void onCheckedChanged(CompoundButton compoundButton, boolean checked)
	{
	
	}
}
