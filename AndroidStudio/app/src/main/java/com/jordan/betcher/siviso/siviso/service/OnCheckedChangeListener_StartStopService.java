package com.jordan.betcher.siviso.siviso.service;

import android.widget.CompoundButton;

class OnCheckedChangeListener_StartStopService implements CompoundButton.OnCheckedChangeListener
{
	private PowerServiceSiviso powerServiceSiviso;
	
	public OnCheckedChangeListener_StartStopService(PowerServiceSiviso powerServiceSiviso)
	{
		this.powerServiceSiviso = powerServiceSiviso;
		powerServiceSiviso.stop();
	}
	
	@Override
	public void onCheckedChanged(CompoundButton compoundButton, boolean checked)
	{
		if(checked) powerServiceSiviso.start();
	}
}
