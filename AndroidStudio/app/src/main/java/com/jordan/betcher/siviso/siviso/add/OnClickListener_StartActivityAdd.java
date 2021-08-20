package com.jordan.betcher.siviso.siviso.add;

import android.app.Activity;
import android.content.Intent;
import android.view.View;

public class OnClickListener_StartActivityAdd
implements View.OnClickListener
{
	private Activity activity;
	private Intent intent;
	
	public OnClickListener_StartActivityAdd(Activity activity, Intent intent)
	{
		this.activity = activity;
		this.intent = intent;
	}
	
	@Override
	public void onClick(View view)
	{
		activity.startActivity(intent);
	}
}
