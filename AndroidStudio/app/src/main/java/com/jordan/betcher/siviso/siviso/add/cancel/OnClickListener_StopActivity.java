package com.jordan.betcher.siviso.siviso.add.cancel;

import android.view.View;

import com.jordan.betcher.siviso.siviso.add.A_Activity_Add;

class OnClickListener_StopActivity implements View.OnClickListener
{
	private A_Activity_Add activity;
	
	public OnClickListener_StopActivity(A_Activity_Add activity)
	{
		this.activity = activity;
	}
	
	@Override
	public void onClick(View view)
	{
		activity.finish();
	}
}
