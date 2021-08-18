package com.jordan.betcher.siviso.siviso.add;

import android.content.Intent;

import com.jordan.betcher.siviso.siviso.main.A_Activity_Main;

class Factory_Intent_Add
{
	private A_Activity_Main activity;
	
	public Factory_Intent_Add(A_Activity_Main activity)
	{
		
		this.activity = activity;
	}
	
	public Intent create()
	{
		Intent intent = new Intent(activity, A_Activity_Add.class);
		return intent;
	}
}
