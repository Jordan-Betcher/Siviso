package com.jordan.betcher.siviso.siviso.add.siviso;

import android.view.LayoutInflater;

import com.jordan.betcher.siviso.siviso.add.A_Activity_Add;
import com.jordan.betcher.siviso.siviso.database.PossibleSivisoData;

public class A_Siviso
{
	public A_Siviso(
	A_Activity_Add activity,
	PossibleSivisoData possibleSivisoData)
	{
		LayoutInflater layoutInflater = LayoutInflater.from(activity);
		
		Factory_SivisoView sivisoViewFactory = new Factory_SivisoView();
		sivisoViewFactory.create(activity, layoutInflater, possibleSivisoData);
	}
}
