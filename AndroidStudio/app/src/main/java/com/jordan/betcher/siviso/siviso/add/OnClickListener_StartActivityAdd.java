package com.jordan.betcher.siviso.siviso.add;

import android.app.Activity;
import android.content.Intent;
import android.view.View;

class OnClickListener_StartActivityAdd
implements View.OnClickListener
{
	private Activity activity;
	private Intent intent;
	
	public OnClickListener_StartActivityAdd(Activity activity, Factory_Intent_Add factory)
	{
		this.activity = activity;
		intent = factory.create();
	}
	
	@Override
	public void onClick(View view)
	{
		activity.startActivity(intent);
	}
}
