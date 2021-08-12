package com.jordan.betcher.siviso.siviso.add;

import android.view.View;

import com.jordan.betcher.siviso.siviso.A_Activity;

public class Factory_OnClickListener_StartActivityAdd
{
	private A_Activity activity;
	
	public Factory_OnClickListener_StartActivityAdd(A_Activity activity)
	{
		this.activity = activity;
	}
	
	public View.OnClickListener create()
	{
		Factory_Intent_Add intentAdd = new Factory_Intent_Add(activity);
		
		return new OnClickListener_StartActivityAdd(activity, intentAdd);
	}
}
