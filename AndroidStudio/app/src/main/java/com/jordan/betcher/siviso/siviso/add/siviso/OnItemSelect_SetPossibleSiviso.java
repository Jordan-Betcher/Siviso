package com.jordan.betcher.siviso.siviso.add.siviso;

import android.view.View;
import android.widget.AdapterView;

import com.jordan.betcher.siviso.siviso.database.PossibleSivisoData;

class OnItemSelect_SetPossibleSiviso
implements AdapterView.OnItemSelectedListener
{
	public OnItemSelect_SetPossibleSiviso(PossibleSivisoData possibleSivisoData)
	{
		possibleSivisoData.setSiviso(0);
	}
	
	@Override
	public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l)
	{
	
	}
	
	@Override
	public void onNothingSelected(AdapterView<?> adapterView)
	{
	
	}
	//TODO
}
