package com.jordan.betcher.siviso.siviso.add.siviso;

import android.view.LayoutInflater;

import com.jordan.betcher.siviso.siviso.add.A_Activity_Add;

public class A_AddSiviso
{
	public A_AddSiviso(A_Activity_Add activity)
	{
		LayoutInflater layoutInflater = LayoutInflater.from(activity);
		
		Factory_SivisoView sivisoViewFactory = new Factory_SivisoView();
		sivisoViewFactory.create(activity, layoutInflater);
	}
}
