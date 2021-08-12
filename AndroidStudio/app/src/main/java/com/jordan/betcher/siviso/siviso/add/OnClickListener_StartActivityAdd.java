package com.jordan.betcher.siviso.siviso.add;

import android.app.Activity;
import android.view.View;

class OnClickListener_StartActivityAdd
implements View.OnClickListener
{
	private Activity activity;
	private Intent_Add intentAdd;
	
	public OnClickListener_StartActivityAdd(Activity activity, Intent_Add intentAdd)
	{
		this.activity = activity;
		this.intentAdd = intentAdd;
	}
	
	@Override
	public void onClick(View view)
	{
		activity.startActivity(intentAdd);
	}
}
