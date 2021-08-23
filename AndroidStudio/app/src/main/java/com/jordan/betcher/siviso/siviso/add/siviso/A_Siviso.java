package com.jordan.betcher.siviso.siviso.add.siviso;

import android.view.LayoutInflater;

import com.jordan.betcher.siviso.siviso.add.A_Activity_Add;
import com.jordan.betcher.siviso.siviso.database.PossibleSiviso;

public class A_Siviso
{
	public A_Siviso(
	A_Activity_Add activity,
	PossibleSiviso possibleSiviso)
	{
		LayoutInflater layoutInflater = LayoutInflater.from(activity);
		
		Factory_SivisoView sivisoViewFactory = new Factory_SivisoView();
		sivisoViewFactory.create(activity, layoutInflater, possibleSiviso);
	}
}
