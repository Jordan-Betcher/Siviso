package com.jordan.betcher.siviso.siviso.add;

import android.view.View;

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
